package com.fourthsource.cc.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CaseController {
	
	private final static Logger logger = LoggerFactory.getLogger(CaseController.class);
	private static final String VIEW_OPEN_CASES = "view_open_cases";
	
	@RequestMapping(value="/view_open_cases", method=RequestMethod.GET)
	public ModelAndView dataValidation() {
		logger.debug("Loading \"view_open_cases\" page");
		Map<String, Object> model = new HashMap<String, Object>();
		return new ModelAndView(VIEW_OPEN_CASES, model); 
	}
	
}
