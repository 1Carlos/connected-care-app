package com.fourthsource.cc.model.dao;

import java.util.List;
import java.util.Set;

import com.fourthsource.cc.domain.CSVDetailEntity;
import com.fourthsource.cc.domain.FileSummaryEntity;
import com.fourthsource.cc.domain.ImportSummaryEntity;

public interface CSVDetailDAO {
	
	public Set<CSVDetailEntity> getAllByCSVHeadId(Integer id);
	public List<CSVDetailEntity> getAllProcessedByCSVHeadId(Integer id);
    public Integer saveCSVDetail(CSVDetailEntity entity);
	public void deleteByCSVHeadId(Integer id);
	public void callSPGetPatientInfo();
	public void callSPClearDB();
	public void callSPReconciliation();
	public void callSPGetPatientInfo2(Integer id);
	public List<FileSummaryEntity> getStatisticByIdFile(Integer id);
    public List<ImportSummaryEntity> getImportStatByIdFile(Integer id);
    
}