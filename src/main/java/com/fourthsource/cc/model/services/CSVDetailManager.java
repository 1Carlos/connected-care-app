package com.fourthsource.cc.model.services;

import java.util.Set;

import com.fourthsource.cc.domain.CSVDetailEntity;

public interface CSVDetailManager {
	
	public Set<CSVDetailEntity> getAllByCSVHeadId(Integer id);
    public Integer saveCSVDetail(CSVDetailEntity entity);
    
}
