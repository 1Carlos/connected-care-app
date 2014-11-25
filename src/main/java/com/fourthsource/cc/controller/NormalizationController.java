package com.fourthsource.cc.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
public class NormalizationController {
	
	private final static Logger logger = LoggerFactory.getLogger(NormalizationController.class);
	private static final String VIEW = "normalization";
	
	@Autowired
	private CSVDetailManager csvDetailManager;
	
	@RequestMapping(value="/normalization", method=RequestMethod.POST)
	public ModelAndView normalization(int idFile, int rowsLoaded) {
		logger.debug("Loading \"normalization\" page");
		Map<String, Object> model = new HashMap<String, Object>();
		
		csvDetailManager.callNormalizationProcess();
		List<CSVDetailEntity> list = csvDetailManager.getAllProcessedByCSVHeadId(idFile);
		
		model.put("list", list);
		model.put("rowsLoaded", rowsLoaded);
		model.put("rowsProcessed", list.size());
		model.put("rowsNotProcessed", rowsLoaded - list.size());
		
		return new ModelAndView(VIEW, model); 
	}
	
}
