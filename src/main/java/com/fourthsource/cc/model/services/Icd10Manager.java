package com.fourthsource.cc.model.services;

import com.fourthsource.cc.domain.Icd10Entity;

public interface Icd10Manager {
	
	public Icd10Entity getIcd10ById(String id);
	public Icd10Entity getIcd10ByIcdCode(String icdCode);
    
}
