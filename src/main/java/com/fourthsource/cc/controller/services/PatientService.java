package com.fourthsource.cc.controller.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fourthsource.cc.domain.PatientEntity;
import com.fourthsource.cc.service.PatientManager;

@Controller
@RequestMapping(value="/services")
public class PatientService  {

	private final static Logger logger = LoggerFactory.getLogger(PatientService.class);
	
	@Autowired
	private PatientManager patientManager;
	
	@RequestMapping(value="/getPatientService", method=RequestMethod.GET)
    public @ResponseBody void getAllPatients() {
		logger.debug("getAllPatients()");
		List<PatientEntity> entity = patientManager.getAllPatients();
		logger.info(entity.toString());
    }
	
}
