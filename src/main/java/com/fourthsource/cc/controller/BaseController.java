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

import com.fourthsource.cc.domain.ChartAdmisEntity;
import com.fourthsource.cc.domain.ChartEntity;
import com.fourthsource.cc.domain.ChartGapVsReadEntity;
import com.fourthsource.cc.domain.ChartGapsByMonthEntity;
import com.fourthsource.cc.model.services.ChartAdmisManager;
import com.fourthsource.cc.model.services.ChartGapVsReadManager;
import com.fourthsource.cc.model.services.ChartGapsByMonthManager;
import com.fourthsource.cc.model.services.ChartManager;

@Controller
public class BaseController {

	private final static Logger logger = LoggerFactory.getLogger(BaseController.class);
	private static final String VIEW_INDEX    = "index";
	private static final String VIEW_HELP     = "help";
	private static final String VIEW_CLEAR    = "clear_data";

	@Autowired
	private ChartManager chartManager;

	@Autowired
	private ChartAdmisManager chartAdmisManager;

	@Autowired
	private ChartGapsByMonthManager chartGapsByMonthManager;

	@Autowired
	private ChartGapVsReadManager chartGapVsReadManager;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView root() {
		logger.debug("Starting \"index\" page");
		Map<String, Object> model = new HashMap<String, Object>();
		
		//Chart #1 Cases by Month//
		List<ChartEntity> list = chartManager.getAllData();
		model.put("chartData", list);
		
		//Chart #2 Admissions by Month//
		List<ChartAdmisEntity> listChart2 = chartAdmisManager.getAllData();
		model.put("chartAdmisData", listChart2);
		
		//Chart #3 Gaps by Month//
		List<ChartGapsByMonthEntity> listChart3 = chartGapsByMonthManager.getAllData();
		model.put("chartGapsByMonthData", listChart3);
		
		//Chart #4 Gaps in Car vs Readmissions by Month//
		List<ChartGapVsReadEntity> listChart4 = chartGapVsReadManager.getAllData();
		model.put("chartGapVsReadData", listChart4);

		return new ModelAndView(VIEW_INDEX, model); 
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView index() { //ModelMap model
		logger.debug("Starting \"index\" page");
		Map<String, Object> model = new HashMap<String, Object>();

		//Chart #1 Cases by Month//
		List<ChartEntity> list = chartManager.getAllData();
		model.put("chartData", list);
		
		//Chart #2 Admissions by Month//
		List<ChartAdmisEntity> listChart2 = chartAdmisManager.getAllData();
		model.put("chartAdmisData", listChart2);
		
		//Chart #3 Gaps by Month//
		List<ChartGapsByMonthEntity> listChart3 = chartGapsByMonthManager.getAllData();
		model.put("chartGapsByMonthData", listChart3);
		
		//Chart #4 Gaps in Car vs Readmissions by Month//
		List<ChartGapVsReadEntity> listChart4 = chartGapVsReadManager.getAllData();
		model.put("chartGapVsReadData", listChart4);

		return new ModelAndView(VIEW_INDEX, model); 
	}
	
	@RequestMapping(value = "/help", method = RequestMethod.GET)
	public String help(ModelMap model) {
		logger.debug("Loading \"help\" page");
		return VIEW_HELP;
	}

    @RequestMapping(value="/clear_data", method=RequestMethod.GET)
    public String clearDB() {
        logger.debug("Loading \"clear_data\" page");
        return VIEW_CLEAR; 
    }
	
}