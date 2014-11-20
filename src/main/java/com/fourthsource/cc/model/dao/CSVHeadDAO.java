package com.fourthsource.cc.model.dao;

import com.fourthsource.cc.domain.CSVHeadEntity;

public interface CSVHeadDAO {
	
	public CSVHeadEntity getCSVHead(Integer id);
    public Integer saveCSVHead(CSVHeadEntity entity);
    
}