package com.fourthsource.cc.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fourthsource.cc.domain.ChartEntity;
import com.fourthsource.cc.model.services.ChartManager;

@Controller
public class BaseController {

	private final static Logger logger = LoggerFactory.getLogger(BaseController.class);
	private static final String VIEW_INDEX    = "index";
	private static final String VIEW_HELP     = "help";

	@Autowired
	private ChartManager chartManager;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String root(ModelMap model) {
		logger.debug("Starting \"index\" page");
		return VIEW_INDEX;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView index() { //ModelMap model
		logger.debug("Starting \"index\" page");
		Map<String, Object> model = new HashMap<String, Object>();
		List<ChartEntity> list = chartManager.getAllData();
		model.put("chartData", list);
		return new ModelAndView(VIEW_INDEX, model); 
		//return VIEW_INDEX;
	}
	
	@RequestMapping(value = "/help", method = RequestMethod.GET)
	public String help(ModelMap model) {
		logger.debug("Loading \"help\" page");
		return VIEW_HELP;
	}

	
}