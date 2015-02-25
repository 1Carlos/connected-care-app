package com.fourthsource.cc.controller.services;

import org.hibernate.HibernateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fourthsource.cc.domain.Icd10Entity;
import com.fourthsource.cc.domain.Icd10ProgramsEntity;
import com.fourthsource.cc.domain.Message;
import com.fourthsource.cc.domain.properties.CommonProperties;
import com.fourthsource.cc.domain.requests.RequestAddIcd10Programs;
import com.fourthsource.cc.domain.requests.RequestIcd10Programs;
import com.fourthsource.cc.model.services.Icd10Manager;
import com.fourthsource.cc.model.services.Icd10ProgramsManager;

@SuppressWarnings("unused")
@Controller
@RequestMapping(value="/services")
public class Icd10ProgramsService  {

	private final static Logger logger = LoggerFactory.getLogger(Icd10ProgramsService.class);

	@Autowired
	private CommonProperties commonProperties;

	
	@Autowired
	private Icd10ProgramsManager icd10ProgramsManager;
	
	@Autowired
	private Icd10Manager icd10Manager;
	
	//private Validator validateIcd10;

	
	@RequestMapping(value="/addIcd10Programs", method=RequestMethod.POST)
    public @ResponseBody Message addIcd10Programs(@RequestBody RequestAddIcd10Programs request) {
		logger.debug("Service addIcd10Programs()");
		Message response = null;
		
		try {
			Icd10Entity icd10Entity = icd10Manager.getIcd10ByIcdCode(request.getIcdCode());
			
			Icd10ProgramsEntity icd10ProgramsEntity = new Icd10ProgramsEntity();
			
			icd10ProgramsEntity.setIcdCodeId(icd10Entity);
			icd10ProgramsEntity.setRxAdherence(request.getRxAdherence());
			icd10ProgramsEntity.setApptAdherence(request.getApptAdherence());
			icd10ProgramsEntity.setEducation(request.getEducation());
			
			//validateIcd10.validate(request, result);
			// resultBinding
			
			icd10ProgramsManager.saveIcd10(icd10ProgramsEntity);
			
			response = commonProperties.getSuccessMessage();
		} catch(HibernateException e) {
			response = commonProperties.getTransactionException();
			logger.error(e.getMessage(), e);
		}

		return response;
    }

	
	@RequestMapping(value="/existIcd10Programs", method=RequestMethod.POST)
    public @ResponseBody Message existIcd10Programs(@RequestBody RequestAddIcd10Programs request) {
		logger.debug("Service existIcd10Programs()");
		Message response = new Message(); 
		String existe = "";
		
		Icd10Entity icd10Entity = icd10Manager.getIcd10ByIcdCode(request.getIcdCode());
		existe = icd10Entity.getIcdCodeId();
		
		if ( icd10ProgramsManager.existIcd10Programs( existe ) ){ 
			response.setCode(400);
			response.setMessage("The ICD Code does it exist");
		}else{
			response = commonProperties.getSuccessMessage();
			response.setCode(200);
			response.setMessage("The ICD Code doesn't exit");
		}
		return response;
	 }
	                        
	@RequestMapping(value="/updateIcd10Programs", method=RequestMethod.POST)
    public @ResponseBody Message updateIcd10Programs(@RequestBody RequestIcd10Programs request) { //RequestIcd10Programs request
		logger.debug("Service updateIcd10Programs()");
		Message response = null;
		
		try {
			Icd10ProgramsEntity icd10ProgramsEntity = icd10ProgramsManager.getIcd10ProgramsById(request.getIcd10ProgramsId()); //request.getIcd10ProgramsId()
			
			//icd10ProgramsEntity.setIcdCodeId(icd10Entity);
			icd10ProgramsEntity.setRxAdherence(request.getRxAdherence());
			icd10ProgramsEntity.setApptAdherence(request.getApptAdherence());
			icd10ProgramsEntity.setEducation(request.getEducation());
			
			icd10ProgramsManager.updateIcd10(icd10ProgramsEntity);
			
			response = commonProperties.getSuccessMessage();
		} catch(HibernateException e) {
			response = commonProperties.getTransactionException();
			logger.error(e.getMessage(), e);
		}

		return response;
    }

	@RequestMapping(value="/deleteIcd10Programs", method=RequestMethod.POST)
    public @ResponseBody Message deleteIcd10Programs(@RequestBody RequestIcd10Programs request) {
		logger.debug("Service deleteIcd10Programs()");
		Message response = null;
		
		try {
			Icd10ProgramsEntity icd10ProgramsEntity = icd10ProgramsManager.getIcd10ProgramsById(request.getIcd10ProgramsId()); //request.getIcd10ProgramsId()
			icd10ProgramsManager.deleteIcd10(icd10ProgramsEntity);
			
			response = commonProperties.getSuccessMessage();
		} catch(HibernateException e) {
			response = commonProperties.getTransactionException();
			logger.error(e.getMessage(), e);
		}

		return response;
    }
	
	
}
