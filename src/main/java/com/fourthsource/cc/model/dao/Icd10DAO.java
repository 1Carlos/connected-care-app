package com.fourthsource.cc.model.dao;

import com.fourthsource.cc.domain.Icd10Entity;

public interface Icd10DAO {
	
	public Icd10Entity getIcd10ById(String id);
	public Icd10Entity getIcd10ByIcdCode(String icdCode);
	public Integer save(Icd10Entity entity);
    
}