package com.fourthsource.cc.model.services;

import java.util.List;

import com.fourthsource.cc.domain.CSVDetailEntity;

public interface CSVDetailManager {
	
	public List<CSVDetailEntity> getAllByCSVHeadId(Integer id);
    public Integer saveCSVDetail(CSVDetailEntity entity);
    
}
