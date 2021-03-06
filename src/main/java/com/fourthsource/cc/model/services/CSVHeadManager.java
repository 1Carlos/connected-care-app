package com.fourthsource.cc.model.services;

import java.util.List;
import java.util.Set;

import com.fourthsource.cc.domain.CSVHeadEntity;
import com.fourthsource.cc.domain.FileSummaryEntity;
import com.fourthsource.cc.domain.ImportSummaryEntity;

public interface CSVHeadManager {
	
	public CSVHeadEntity getCSVHead(Integer id);
	public Integer saveCSVHead(CSVHeadEntity entity);
	public Integer saveCSVFileName(String fileName, String description);
    public void deleteByCSVHeadId(Integer id);
	public List<CSVHeadEntity> getAllCSVHead();
	public List<FileSummaryEntity> getStatisticByIdFile();
	public List<ImportSummaryEntity> getImportStatByIdFile();
	public void callDeleteStagingFile(Integer id);
    
}
