package com.fourthsource.cc.model.services;

import com.fourthsource.cc.domain.CaseEntity;

public interface CasesManager {
	
	public CaseEntity getCaseById(int id);
	public CaseEntity getSimpleCaseById(int id);
	public void updateCase(CaseEntity entity);
    
}
