package com.fourthsource.cc.model.services;

import com.fourthsource.cc.domain.CSVHeadEntity;

public interface CSVHeadManager {
	
	public CSVHeadEntity getCSVHead(Integer id);
	public Integer saveCSVHead(CSVHeadEntity entity);
	public Integer saveCSVFileName(String fileName);
    
}
