package com.fourthsource.cc.model.services;

import java.util.List;

import com.fourthsource.cc.domain.PatientEntity;

public interface PatientManager {
	
    public List<PatientEntity> getAllPatients();
    
}
