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
public class DashboardSetupController {
	
	private final static Logger logger = LoggerFactory.getLogger(DashboardSetupController.class);
	private static final String VIEW = "dashboard_setup";
	
	@RequestMapping(value="/dashboard_setup", method=RequestMethod.GET)
	public ModelAndView dashboardSetup() {
		logger.debug("Loading \"dashboard_setup\" page");
		Map<String, Object> model = new HashMap<String, Object>();
		return new ModelAndView(VIEW, model); 
	}
	
}
