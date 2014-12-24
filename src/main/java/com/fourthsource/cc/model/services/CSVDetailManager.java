package com.fourthsource.cc.model.services;

import java.util.List;
import java.util.Set;

import com.fourthsource.cc.domain.CSVDetailEntity;
import com.fourthsource.cc.domain.FileSummaryEntity;

public interface CSVDetailManager {
	
	public Set<CSVDetailEntity> getAllByCSVHeadId(Integer id);
	public List<CSVDetailEntity> getAllProcessedByCSVHeadId(Integer id);
    public Integer saveCSVDetail(CSVDetailEntity entity);
    public void deleteByCSVHeadId(Integer id);
    public void callNormalizationProcess();
	public void callReconciliationProcess();
    public void callNormalizationByIdFile(Integer id);
	public List<FileSummaryEntity> getStatisticByIdFile(Integer id);
    
}
