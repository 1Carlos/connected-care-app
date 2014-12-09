package com.fourthsource.cc.model.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourthsource.cc.domain.Icd10Entity;
import com.fourthsource.cc.model.dao.Icd10DAO;

@Service
public class Icd10ManagerImpl implements Icd10Manager {
	
	@Autowired
    private Icd10DAO icd10DAO;

	@Override
	@Transactional
	public Icd10Entity getIcd10ById(String id) {
		return icd10DAO.getIcd10ById(id);
	}
	
	@Override
	@Transactional
	public Icd10Entity getIcd10ByIcdCode(String icdCode) {
		return icd10DAO.getIcd10ByIcdCode(icdCode);
	}

	
}
