package com.fourthsource.cc.controller.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fourthsource.cc.domain.responses.ResponseListPatients;
import com.fourthsource.cc.model.services.PatientManager;

@Controller
@RequestMapping(value="/services")
public class PatientService  {

	private final static Logger logger = LoggerFactory.getLogger(PatientService.class);
	
	@Autowired
	private PatientManager patientManager;
	
	@RequestMapping(value="/getPatientService", method=RequestMethod.POST)
    private @ResponseBody ResponseListPatients getAllPatients() {
		logger.debug("Service getAllPatients()");
		ResponseListPatients response = new ResponseListPatients();
		response.setList(patientManager.getAllPatients());
		return response;
    }
	
}
