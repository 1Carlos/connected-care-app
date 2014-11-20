package com.fourthsource.cc.model.dao;

import java.util.List;

import com.fourthsource.cc.domain.CSVDetailEntity;

public interface CSVDetailDAO {
	
	public List<CSVDetailEntity> getAllByCSVHeadId(Integer id);
    public Integer saveCSVDetail(CSVDetailEntity entity);
    
}