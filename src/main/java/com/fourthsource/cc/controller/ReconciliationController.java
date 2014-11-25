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
public class ReconciliationController {
	
	private final static Logger logger = LoggerFactory.getLogger(ReconciliationController.class);
	private static final String VIEW = "run_reconciliation";
	
	@RequestMapping(value="/run_reconciliation", method=RequestMethod.GET)
	public ModelAndView reconciliation() {
		logger.debug("Loading \"run_reconciliation\" page");
		Map<String, Object> model = new HashMap<String, Object>();
		return new ModelAndView(VIEW, model); 
	}
	
}
