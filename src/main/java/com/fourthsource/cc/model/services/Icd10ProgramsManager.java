package com.fourthsource.cc.model.services;

import java.util.List;

import com.fourthsource.cc.domain.Icd10ProgramsEntity;

public interface Icd10ProgramsManager {
	
	public List<Icd10ProgramsEntity> getAllIcd10Programs();
	public Icd10ProgramsEntity getIcd10ProgramsById(Integer id);
	public Boolean existIcd10Programs(String id);   /* Feb 24 */
	public Integer saveIcd10(Icd10ProgramsEntity entity);
	public void upDateIcd10(Icd10ProgramsEntity entity);
	public void deleteIcd10(Icd10ProgramsEntity entity);
	void updateIcd10(Icd10ProgramsEntity entity);
    
}
