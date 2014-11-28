package com.fourthsource.cc.model.services;

import java.util.List;

import com.fourthsource.cc.domain.CasesViewEntity;
import com.fourthsource.cc.domain.requests.RequestSearchCaseView;

public interface CasesViewManager {
	
	public List<CasesViewEntity> getAll();
	public List<CasesViewEntity> getAllOpenCases();
	public List<CasesViewEntity> getAllBySearchRequest(RequestSearchCaseView request);
    
}
