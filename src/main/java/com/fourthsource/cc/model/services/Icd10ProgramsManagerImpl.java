package com.fourthsource.cc.model.services;

import java.util.List;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourthsource.cc.domain.Icd10ProgramsEntity;
import com.fourthsource.cc.model.dao.Icd10ProgramsDAO;

@Service
public class Icd10ProgramsManagerImpl implements Icd10ProgramsManager {
	
	@Autowired
    private Icd10ProgramsDAO icd10ProgramsDAO;

	@Override
	@Transactional
	@Cascade({CascadeType.SAVE_UPDATE})
	public List<Icd10ProgramsEntity> getAllIcd10Programs() {
		return icd10ProgramsDAO.getAllIcd10Programs();
	}
	
	@Override
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
	}	
}
