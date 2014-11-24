package com.fourthsource.cc.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fourthsource.cc.domain.CSVDetailEntity;
import com.fourthsource.cc.model.services.CSVDetailManager;

@Controller
public class DataValidationController {
	
	private final static Logger logger = LoggerFactory.getLogger(DataValidationController.class);
	private static final String VIEW = "data_validation";
	
	@Autowired
	private CSVDetailManager csvDetailManager;
	
	@RequestMapping(value="/data_validation", method=RequestMethod.POST)
	public ModelAndView dataValidation(int idFile, int rowsInFile) {
		logger.debug("Loading \"data_validation\" page");
		Map<String, Object> model = new HashMap<String, Object>();
		Set<CSVDetailEntity> list = csvDetailManager.getAllByCSVHeadId(idFile);
		
		model.put("idFile", idFile);
		model.put("list", list);
		model.put("rowsInFile", rowsInFile);
		model.put("rowsLoaded", list.size());
		model.put("rowsNotLoaded", rowsInFile - list.size());

		return new ModelAndView(VIEW, model); 
	}
	
}
