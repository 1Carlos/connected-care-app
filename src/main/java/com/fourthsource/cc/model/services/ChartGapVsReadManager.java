package com.fourthsource.cc.model.services;

import java.util.List;

import com.fourthsource.cc.domain.ChartEntity;
import com.fourthsource.cc.domain.ChartGapVsReadEntity;

public interface ChartGapVsReadManager {
	
	public List<ChartGapVsReadEntity> getAllData();
	/*public Icd10ProgramsEntity getIcd10ProgramsById(Integer id);
	public Integer saveIcd10(Icd10ProgramsEntity entity);
	public void upDateIcd10(Icd10ProgramsEntity entity);
	public void deleteIcd10(Icd10ProgramsEntity entity);*/
    
}
