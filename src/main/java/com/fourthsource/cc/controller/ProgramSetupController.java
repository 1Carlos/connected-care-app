package com.fourthsource.cc.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.HibernateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fourthsource.cc.domain.Icd10ProgramsEntity;
import com.fourthsource.cc.domain.requests.RequestIcd10Programs;
import com.fourthsource.cc.model.services.Icd10ProgramsManager;

@Controller
public class ProgramSetupController {
	
	private final static Logger logger = LoggerFactory.getLogger(ProgramSetupController.class);
	private static final String VIEW  = "program_setup";
	private static final String VIEWn = "program_new";
	private static final String VIEWe = "program_edit";

	@Autowired
	private Icd10ProgramsManager icd10ProgramsManager;
	
	@RequestMapping(value="/program_setup", method=RequestMethod.GET)
	public ModelAndView listProgram() {
		logger.debug("Loading \"program_setup\" page");
		Map<String, Object> model = new HashMap<String, Object>();
		//List<Icd10ProgramsEntity> list = icd10ProgramsManager.getAllIcd10Programs();
		List<Icd10ProgramsEntity> list = icd10ProgramsManager.getAllIcd10Programs();
		model.put("list", list);
		return new ModelAndView(VIEW, model); 
	}
	
	@RequestMapping(value="/program_new", method=RequestMethod.GET)
	public ModelAndView newProgram() {
		logger.debug("Loading \"program_new\" page");
		Map<String, Object> model = new HashMap<String, Object>();
		//List<Icd10ProgramsEntity> list = icd10ProgramsManager.getAllIcd10Programs();
		//List<Icd10ProgramsEntity> list = icd10ProgramsManager.getAllIcd10Programs();
		//model.put("list", list);
		return new ModelAndView(VIEWn, model); 
	}
	
	@RequestMapping(value="/program_edit", method=RequestMethod.GET)
	public ModelAndView editProgram(Integer icd10ProgramsId) {
		logger.debug("Loading \"program_edit\" page");
		Icd10ProgramsEntity entity = icd10ProgramsManager.getIcd10ProgramsById(icd10ProgramsId);
		//Icd10ProgramsEntity entity = icd10ProgramsService.getIcd10ProgramsById(id);
		//entity.setIcdCode(icdCode);
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("object", entity);
		return new ModelAndView(VIEWe, model); 
	}

	
}
