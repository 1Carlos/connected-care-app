package com.fourthsource.cc.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fourthsource.cc.domain.CSVHeadEntity;
import com.fourthsource.cc.domain.CSVDetailEntity;
import com.fourthsource.cc.domain.FileSummaryEntity;
import com.fourthsource.cc.domain.ImportSummaryEntity;
import com.fourthsource.cc.model.services.CSVDetailManager;
import com.fourthsource.cc.model.services.CSVHeadManager;

@Controller
public class LaunchpadController {
	
	private final static Logger logger = LoggerFactory.getLogger(LaunchpadController.class);
	private static final String VIEW = "launchpad";

	@Autowired
	private CSVHeadManager csvHeadManager;

	@Autowired
	private CSVDetailManager csvDetailManager;
	
	@RequestMapping(value="/launchpad", method=RequestMethod.GET)
	public ModelAndView dashboardSetup() {
		logger.debug("Loading \"launchpad\" page");
		Map<String, Object> model = new HashMap<String, Object>();
	    List<CSVHeadEntity> list = csvHeadManager.getAllCSVHead();
	    model.put("list", list);
		List<FileSummaryEntity> sumlist = csvHeadManager.getStatisticByIdFile();
		model.put("listSummary", sumlist);
		List<ImportSummaryEntity> sumimplist = csvHeadManager.getImportStatByIdFile();
		model.put("listImpSummary", sumimplist);
		return new ModelAndView(VIEW, model); 
	}
	
	@RequestMapping(value="/normalizationById", method=RequestMethod.POST)
	public ModelAndView normalizationByIdFile(Integer csvId) {
		logger.debug("Loading \"normalizationById\" page");
		Map<String, Object> model = new HashMap<String, Object>();
		csvDetailManager.callNormalizationByIdFile(csvId);
		//List<FileSummaryEntity> sumlist = csvHeadManager.getStatisticByIdFile(csvId);
		//model.put("listSummary", sumlist);
		return new ModelAndView("redirect:launchpad",model); 
	}	

	
	@RequestMapping(value="/previewFile", method=RequestMethod.POST)
	public ModelAndView previewLaunchpad(Integer csvId) {
		logger.debug("Loading \"previewFile\" page");
		Map<String, Object> model = new HashMap<String, Object>();
		
		Set<CSVDetailEntity> prevList = csvDetailManager.getAllByCSVHeadId(csvId);
		
		model.put("list", prevList);
		
		return new ModelAndView("data_validation",model); 
	}

	
	@RequestMapping(value="/removeFileById", method=RequestMethod.POST)
	public ModelAndView removeFileById(Integer csvId) {
		logger.debug("Loading \"removeFileById\" page");
		Map<String, Object> model = new HashMap<String, Object>();
		csvDetailManager.deleteByCSVHeadId(csvId);
		List<CSVHeadEntity> list = csvHeadManager.getAllCSVHead();
	    model.put("list", list);
		return new ModelAndView(VIEW, model); 
	}	
	
	
}
