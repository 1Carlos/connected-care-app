package com.fourthsource.cc.controller.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fourthsource.cc.controller.services.UploadFileService;

public class FileManager {

	private final static Logger logger = LoggerFactory.getLogger(UploadFileService.class);
	
	public static List<String> readFile(File file) {
		List<String> result = new ArrayList<String>();
		BufferedReader bufferedReader = null;
		
		try {
			String currentLine;
			bufferedReader = new BufferedReader(new FileReader(file));
 
			while((currentLine = bufferedReader.readLine()) != null) {
				result.add(currentLine);
			}
		} catch (IOException e) {
			logger.error(e.getMessage(), e);
		} finally {
			try {
				if(bufferedReader != null) {
					bufferedReader.close();
				}
			} catch(IOException e) {
				logger.error(e.getMessage(), e);
			}
		}
		
		return result;
	}
	
	@SuppressWarnings("resource")
	public static void copyFile(File sourceFile, File destinationFile) throws IOException {
	    if(!destinationFile.exists()) {
	        destinationFile.createNewFile();
	    }

	    FileChannel source = null;
	    FileChannel destination = null;
	    
	    try {
	        source = new FileInputStream(sourceFile).getChannel();
	        destination = new FileOutputStream(destinationFile).getChannel();

	        long count = 0;
	        long size = source.size();
	        
	        while((count += destination.transferFrom(source, count, size-count))<size);
	    } catch(Exception e){
	    	logger.error("File cannot be copied", e);
	    } finally {
	    	if(source != null) {
	            source.close();
	        }
	        if(destination != null) {
	            destination.close();
	        }
	    }
	}
	
	public static void moveFile(File sourceFile, File destinationFile) throws IOException {
	    FileManager.copyFile(sourceFile, destinationFile);
	    FileManager.removeFile(sourceFile);
	}
	
	public static boolean removeFile(File file) {
		boolean result = false;
		
		try {
    		if(file.delete()){
    			result = true;
    		}
    	} catch(Exception e) {
    		logger.error("File cannot be deleted", e);
    	}
		
		return result;
	}
	
	public static String[] splitFileAndExtension(String file) {
		return file.split("\\.(?=[^\\.]+$)");
	}
	
}
