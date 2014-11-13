package com.fourthsource.cc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BaseController {

	private final static Logger logger = LoggerFactory.getLogger(BaseController.class);
	private static final String VIEW = "index";

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String root(ModelMap model) {
		logger.debug("Starting \"index\" page");
		return VIEW;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap model) {
		logger.debug("Starting \"index\" page");
		return VIEW;
	}
	
}