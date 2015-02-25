package com.fourthsource.cc.model.dao;

import java.util.List;

import com.fourthsource.cc.domain.Icd10Entity;
import com.fourthsource.cc.domain.Icd10ProgramsEntity;

@SuppressWarnings("unused")
public interface Icd10ProgramsDAO {
	
    public List<Icd10ProgramsEntity> getAllIcd10Programs();
	public Icd10ProgramsEntity getIcd10ProgramsById(Integer id);
	public Icd10ProgramsEntity getIcd10ProgramsByIcdCodeId(String icdCodeId);
	public Boolean existIcd10Programs(String id);
	public Integer saveIcd10(Icd10ProgramsEntity entity);
	public void updateIcd10(Icd10ProgramsEntity entity);
	public void deleteIcd10(Icd10ProgramsEntity entity);
	
}