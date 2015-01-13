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

import com.fourthsource.cc.domain.ChartAdmisEntity;
import com.fourthsource.cc.domain.ChartEntity;
import com.fourthsource.cc.domain.ChartGapsByMonthEntity;
import com.fourthsource.cc.model.services.ChartAdmisManager;
import com.fourthsource.cc.model.services.ChartGapsByMonthManager;
import com.fourthsource.cc.model.services.ChartManager;

@Controller
public class DashboardSetupController {
	
	private final static Logger logger = LoggerFactory.getLogger(DashboardSetupController.class);
	private static final String VIEW = "dashboard_setup";

	@Autowired
	private ChartManager chartManager;

	@Autowired
	private ChartAdmisManager chartAdmisManager;

	@Autowired
	private ChartGapsByMonthManager chartGapsByMonthManager;
	
	@RequestMapping(value="/dashboard_setup", method=RequestMethod.GET)
	public ModelAndView dashboardSetup() {
		logger.debug("Loading \"dashboard_setup\" page");
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

		return new ModelAndView(VIEW, model); 
	}
	
}
