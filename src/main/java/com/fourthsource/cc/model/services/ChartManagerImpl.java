package com.fourthsource.cc.model.services;

import java.util.List;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourthsource.cc.domain.ChartEntity;
import com.fourthsource.cc.model.dao.ChartDAO;

@Service
public class ChartManagerImpl implements ChartManager {
	
	@Autowired
    private ChartDAO chartDAO;

	@Override
	@Transactional
	@Cascade({CascadeType.SAVE_UPDATE})
	public List<ChartEntity> getAllData() {
		return chartDAO.getAllData();
	}
	
	/*@Override
	@Transactional
	public Icd10ProgramsEntity getIcd10ProgramsById(Integer id) {
		return icd10ProgramsDAO.getIcd10ProgramsById(id);
	}
	
	@Override
	@Transactional
	public Integer saveIcd10(Icd10ProgramsEntity entity) {
		return icd10ProgramsDAO.saveIcd10(entity);
	}	
	
	@Override
	@Transactional
	public void upDateIcd10(Icd10ProgramsEntity entity) {
		icd10ProgramsDAO.upDateIcd10(entity);
	}	
	
	@Override
	@Transactional
	public void deleteIcd10(Icd10ProgramsEntity entity) {
		icd10ProgramsDAO.deleteIcd10(entity);
	}	*/
}
