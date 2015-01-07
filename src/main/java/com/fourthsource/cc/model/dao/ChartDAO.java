package com.fourthsource.cc.model.dao;


import java.util.List;

import com.fourthsource.cc.domain.ChartEntity;

public interface ChartDAO {
	
    public List<ChartEntity> getAllData();
	/*public Icd10ProgramsEntity getIcd10ProgramsById(Integer id);
	public Icd10ProgramsEntity getIcd10ProgramsByIcdCodeId(String icdCodeId);
	public Integer saveIcd10(Icd10ProgramsEntity entity);
	public void upDateIcd10(Icd10ProgramsEntity entity);
	public void deleteIcd10(Icd10ProgramsEntity entity);*/
    
}