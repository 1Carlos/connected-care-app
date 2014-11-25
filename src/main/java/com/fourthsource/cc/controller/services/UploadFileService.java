package com.fourthsource.cc.controller.services;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.multipart.MultipartFile;

import com.fourthsource.cc.controller.components.ReadFileThread;
import com.fourthsource.cc.domain.Message;
import com.fourthsource.cc.domain.MessageType;
import com.fourthsource.cc.domain.properties.FileUploadProperties;
import com.fourthsource.cc.domain.responses.ResponseFileUpload;
import com.fourthsource.cc.model.services.CSVHeadManager;

@Controller
@ControllerAdvice
@RequestMapping(value="/services")
public class UploadFileService {

	private final static Logger logger = LoggerFactory.getLogger(UploadFileService.class);
	
	@Autowired
	private FileUploadProperties fileUploadProperties;
	
	@Autowired
	private CSVHeadManager csvHeadManager;
	
	@Autowired
	private ReadFileThread readFileThread;
	
	@RequestMapping(value="/uploadFileService", method=RequestMethod.POST)
    public @ResponseBody ResponseFileUpload handleFileUploaded(@RequestParam("file") MultipartFile file) {
		logger.debug("Service handleFileUploaded()");
		ResponseFileUpload response = new ResponseFileUpload();
		String path = fileUploadProperties.getPath();
		
        if (!file.isEmpty()) {
        	String fileName = file.getOriginalFilename();
        	
            try {
                byte[] bytes = file.getBytes();
                BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File(path + fileName)));
                stream.write(bytes);
                stream.close();
                
                Integer id = csvHeadManager.saveCSVFileName(fileName);
                
                readFileThread.setIdFile(id);
                
                /* This process will run synchronized */
                
                readFileThread.run();
                
                Message message = new Message(fileUploadProperties.getSuccessMessage());
                message.setMessageType(MessageType.OK);
                message.setMessage(String.format(message.getMessage(), fileName));
                
                response.setIdFile(id);
                response.setRowsInFile(readFileThread.getRowsInFile());
                response.setRowsLoaded(readFileThread.getRowsLoaded());
                response.setResponse(message);
            } catch (Exception e) {
            	Message message = new Message(fileUploadProperties.getGeneralException());
            	message.setMessageType(MessageType.ERROR);
                message.setMessage(String.format(message.getMessage(), fileName));
                
            	response.setResponse(message);
            	logger.error(e.getMessage(), e);
            }
        } else {
        	Message message = new Message(fileUploadProperties.getFileEmpty());
        	message.setMessageType(MessageType.WARNING);
        	
        	response.setResponse(message);
        }
        
        return response;
    }
	
	@ExceptionHandler(MaxUploadSizeExceededException.class)
	public @ResponseBody ResponseFileUpload handleMaxUploadSizeExceededException(MaxUploadSizeExceededException e) {
		logger.debug("Handling Service MaxUploadSizeExceededException");
		ResponseFileUpload response = new ResponseFileUpload();
		Message message = new Message(fileUploadProperties.getFileSizeExceeded());
		message.setMessageType(MessageType.ERROR);
		response.setResponse(message);
		return response;
	}
	
}
