package com.fourthsource.cc.model.dao;

import java.util.List;
import java.util.Set;

import com.fourthsource.cc.domain.CSVHeadEntity;
import com.fourthsource.cc.domain.FileSummaryEntity;
import com.fourthsource.cc.domain.Icd10ProgramsEntity;
import com.fourthsource.cc.domain.ImportSummaryEntity;

public interface CSVHeadDAO {
	
	public CSVHeadEntity getCSVHead(Integer id);
    public Integer saveCSVHead(CSVHeadEntity entity);
    public List<CSVHeadEntity> getAllCSVHead();
	public void deleteByCSVHeadId(Integer id);
	public List<FileSummaryEntity> getStatisticByIdFile();
	public List<ImportSummaryEntity> getImportStatByIdFile();
	public void callDeleteStagingFile(Integer id);
    
}