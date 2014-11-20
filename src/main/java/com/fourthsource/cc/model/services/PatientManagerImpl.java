package com.fourthsource.cc.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourthsource.cc.domain.PatientEntity;
import com.fourthsource.cc.model.dao.PatientDAO;

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
