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

import com.fourthsource.cc.domain.CasesViewEntity;
import com.fourthsource.cc.model.services.CasesViewManager;

@Controller
public class CaseController {
	
	private final static Logger logger = LoggerFactory.getLogger(CaseController.class);
	private static final String VIEW_OPEN_CASES = "view_open_cases";
	private static final String VIEW_SEARCH_CASES = "search_cases";
	private static final String VIEW_CASE_DETAIL = "case_detail";
	
	@Autowired
	private CasesViewManager casesViewManager;
	
	@RequestMapping(value="/view_open_cases", method=RequestMethod.GET)
	public ModelAndView dataValidation() {
		logger.debug("Loading \"view_open_cases\" page");		
		List<CasesViewEntity> list = casesViewManager.getAllOpenCases();
		
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("list", list);
		
		return new ModelAndView(VIEW_OPEN_CASES, model); 
	}
	
	@RequestMapping(value="/search_cases", method=RequestMethod.GET)
	public ModelAndView searchCases() {
		logger.debug("Loading \"search_cases\" page");
		Map<String, Object> model = new HashMap<String, Object>();
		return new ModelAndView(VIEW_SEARCH_CASES, model); 
	}
	
	@RequestMapping(value="/case_detail", method=RequestMethod.POST)
	public ModelAndView caseDetail(int caseId) {
		logger.debug("Loading \"case_detail\" page");
		Map<String, Object> model = new HashMap<String, Object>();
		return new ModelAndView(VIEW_CASE_DETAIL, model); 
	}
	
}
