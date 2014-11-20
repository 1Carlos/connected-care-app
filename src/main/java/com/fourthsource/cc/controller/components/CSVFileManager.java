package com.fourthsource.cc.controller.components;

import java.io.File;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.fourthsource.cc.controller.services.UploadFileService;
import com.fourthsource.cc.controller.utils.FileManager;
import com.fourthsource.cc.domain.CSVDetailEntity;
import com.fourthsource.cc.domain.properties.FileTitleHeaderProperties;

@Component
public class CSVFileManager {
	
	private final static Logger logger = LoggerFactory.getLogger(UploadFileService.class);
	
	@Resource(name = "appProperties")
	private Properties appProperties;
	
	public List<FileTitleHeaderProperties> getTitleHeadersFromProperties() throws NumberFormatException {
		logger.info("Getting headers from properties...");
		List<FileTitleHeaderProperties> result = new ArrayList<FileTitleHeaderProperties>();

		String columnSize = appProperties.getProperty("file.property.columnSize");
		int columnLength = 0;
		
		try {
			columnLength = Integer.parseInt(columnSize);
		} catch(NumberFormatException e) {
			logger.error("Error trying parsing 'file.property.columnSize': " + e.getMessage(), e);
			throw e;
		}
		
		for(int i = 0; i < columnLength; i++) {
			FileTitleHeaderProperties fileTitleHeader = new FileTitleHeaderProperties();
			int order = i + 1;
			
			fileTitleHeader.setId(order);
			fileTitleHeader.setHeaderName(appProperties.getProperty("file.property.header." + order));
			fileTitleHeader.setDataType(appProperties.getProperty("file.property.dataType." + order));
			
			result.add(fileTitleHeader);
		}
		
		return result;
	}
	
	public List<CSVDetailEntity> getFileData(File file, List<FileTitleHeaderProperties> listHeader) throws Exception {
		logger.info("Reading CSV file and getting data...");
		List<String> fileData = FileManager.readFile(file);

		Collections.sort(listHeader, new Comparator<FileTitleHeaderProperties>() {
	        @Override
	        public int compare(FileTitleHeaderProperties obj1, FileTitleHeaderProperties obj2) {
	            return Integer.compare(obj1.getId(), obj2.getId());
	        }
	    });
		
		return transformMap(fileData, listHeader);
	}
	
	private List<CSVDetailEntity> transformMap(List<String> fileData, List<FileTitleHeaderProperties> listHeaders) throws Exception {
		List<CSVDetailEntity> result = new ArrayList<CSVDetailEntity>();

		for(int i = 0; i < fileData.size(); i++) {
			logger.debug("Parsing row: " + (i + 1));
			CSVDetailEntity entity = new CSVDetailEntity();
			String row = (String)fileData.get(i);
			String[] cells = row.split("\\|");
			
			for(int j = 0; j < listHeaders.size(); j++) {
				FileTitleHeaderProperties header = (FileTitleHeaderProperties)listHeaders.get(j);
				Class<?> dataType = null;
				String cellValue = null;
				int cellId = header.getId() - 1;
				
				try {
					cellValue = cells[cellId];
				} catch(IndexOutOfBoundsException e) {
					cellValue = null;
				}
				
				Object cellObject = doFilter(header.getHeaderName(), cellValue);
				
				if(header.getDataType().equals("String")) {
					dataType = String.class;
					
					if(cellObject == null) {
						cellObject = cellValue;
					}
				} else if(header.getDataType().equals("Integer")) {
					dataType = Integer.class;
					
					if(cellObject == null) {
						try {
							cellObject = Integer.parseInt(cellValue);
						} catch(NumberFormatException e) {
							cellObject = 0;
						}
					}
				}  else if(header.getDataType().equals("Date")) {
					dataType = Date.class;
					
					if(cellObject == null && cellValue != null) {
						try {
							cellObject = (Date) new SimpleDateFormat("MM/dd/yyyy").parse(cellValue);
						} catch(ParseException e) {
							cellObject = null;
						}
					}
				}

				Method method = CSVDetailEntity.class.getMethod("set" + header.getHeaderName(), dataType);
				method.invoke(entity, cellObject);
			}
			
			result.add(entity);
		}

		return result;
	}
	
	private Object doFilter(String headerName, Object value) throws Exception {
		Object response = null;
		
		if(headerName.equals("PatientGender")) {
			if(value.equals("F")) {
				response = 0;
			} else if(value.equals("M")) {
				response = 1;
			} else {
				throw new Exception("Wrong format in 'PatientGender' attribute");
			}
		}
		
		return response;
	}
	
}
