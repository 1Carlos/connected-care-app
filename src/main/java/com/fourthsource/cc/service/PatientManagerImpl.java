package com.fourthsource.cc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourthsource.cc.dao.PatientDAO;
import com.fourthsource.cc.domain.PatientEntity;

@Service
public class PatientManagerImpl implements PatientManager {
	
	@Autowired
    private PatientDAO patientDAO;

	@Override
	@Transactional
	public List<PatientEntity> getAllPatients() {
		return patientDAO.getAllPatients();
	}

}
