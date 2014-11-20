package com.fourthsource.cc.model.dao;

import java.util.List;

import com.fourthsource.cc.domain.PatientEntity;

public interface PatientDAO {
	
    public List<PatientEntity> getAllPatients();
    
}