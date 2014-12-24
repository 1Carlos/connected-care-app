package com.fourthsource.cc.model.dao;

import java.util.List;

import com.fourthsource.cc.domain.CSVHeadEntity;
import com.fourthsource.cc.domain.FileSummaryEntity;
import com.fourthsource.cc.domain.Icd10ProgramsEntity;

public interface CSVHeadDAO {
	
	public CSVHeadEntity getCSVHead(Integer id);
    public Integer saveCSVHead(CSVHeadEntity entity);
    public List<CSVHeadEntity> getAllCSVHead();
	public List<FileSummaryEntity> getStatisticByIdFile(Integer id);
    
}