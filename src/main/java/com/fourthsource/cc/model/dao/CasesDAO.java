package com.fourthsource.cc.model.dao;

import com.fourthsource.cc.domain.CaseEntity;

public interface CasesDAO {
	
	public CaseEntity getCaseById(int id);
	public void updateCase(CaseEntity entity);
    
}