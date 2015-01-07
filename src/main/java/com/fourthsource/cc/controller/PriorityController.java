package com.fourthsource.cc.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.HibernateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fourthsource.cc.domain.CSVHeadEntity;
import com.fourthsource.cc.domain.PrioritySetEntity;
import com.fourthsource.cc.domain.PrioritySetRuleEntity;
import com.fourthsource.cc.model.services.PrioritySetManager;
import com.fourthsource.cc.model.services.PrioritySetRuleManager;

@Controller
public class PriorityController {
	
	private final static Logger logger = LoggerFactory.getLogger(PriorityController.class);
	private static final String VIEW_SETUP = "priority_setup";
	private static final String VIEW_RULES = "priority_rules_setup";

	@Autowired
	private PrioritySetManager prioritySetManager;

	@Autowired
	private PrioritySetRuleManager prioritySetRuleManager;
	
	@RequestMapping(value="/priority_setup", method=RequestMethod.GET)
	public ModelAndView priorityList() {
		logger.debug("Loading \"priority_setup\" page");
		Map<String, Object> model = new HashMap<String, Object>();
		List<PrioritySetEntity> list = prioritySetManager.getAllPrioritySets();
		model.put("list", list);
		return new ModelAndView(VIEW_SETUP, model); 
	}
	
	/*
	@RequestMapping(value="/removeFileById", method=RequestMethod.POST)
	public ModelAndView removeFileById(Integer csvId) {
		logger.debug("Loading \"removeFileById\" page");
		Map<String, Object> model = new HashMap<String, Object>();
		csvDetailManager.deleteByCSVHeadId(csvId);
		csvHeadManager.deleteByCSVHeadId(csvId);
		List<CSVHeadEntity> list = csvHeadManager.getAllCSVHead();
	    model.put("list", list);
		return new ModelAndView("redirect:launchpad", model); 
	}	
	*/
	
	@RequestMapping(value="/priority_rules_setup", method=RequestMethod.POST)
    public ModelAndView editPriority(Integer prioritySetId){
		logger.debug("Loading \"priority_rules_setup\" page");
		Map<String, Object> model = new HashMap<String, Object>();
		PrioritySetEntity priority = prioritySetManager.getPrioritySetById(prioritySetId);
		List<PrioritySetRuleEntity> ruleList = prioritySetRuleManager.getAllPriorityRulesById(prioritySetId);
		model.put("priority" , priority);
		model.put("listRules", ruleList);
        return new ModelAndView("priority_rules_setup",model);
    }
	
}
