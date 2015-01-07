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
public class clear_dataController {
	
	private final static Logger logger = LoggerFactory.getLogger(clear_dataController.class);
	private static final String VIEW = "clear_data";
	
	@RequestMapping(value="/clear_data", method=RequestMethod.GET)
	public ModelAndView clearDB() {
		logger.debug("Loading \"clear_data\" page");
		Map<String, Object> model = new HashMap<String, Object>();
		return new ModelAndView(VIEW, model); 
	}
	
}
