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
	private static final String VIEW_INDEX    = "index";
	private static final String VIEW_HELP     = "help";
	private static final String VIEW_PRIORITY = "priority_setup";
	private static final String VIEW_RULES    = "priority_rules_setup";

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String root(ModelMap model) {
		logger.debug("Starting \"index\" page");
		return VIEW_INDEX;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap model) {
		logger.debug("Starting \"index\" page");
		return VIEW_INDEX;
	}
	
	@RequestMapping(value = "/help", method = RequestMethod.GET)
	public String help(ModelMap model) {
		logger.debug("Loading \"help\" page");
		return VIEW_HELP;
	}
	
	@RequestMapping(value = "/priority_setup", method = RequestMethod.GET)
	public String priority(ModelMap model) {
		logger.debug("Loading \"priority_setup\" page");
		return VIEW_PRIORITY;
	}
	
	@RequestMapping(value = "/priority_rules_setup", method = RequestMethod.GET)
	public String priorityRules(ModelMap model) {
		logger.debug("Loading \"priority_rules_setup\" page");
		return VIEW_RULES;
	}
	
}