package com.fourthsource.cc.controller.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fourthsource.cc.domain.responses.ResponseListCasesView;
import com.fourthsource.cc.model.services.CasesViewManager;

@Controller
@RequestMapping(value="/services")
public class CasesViewService  {

	private final static Logger logger = LoggerFactory.getLogger(CasesViewService.class);

	@Autowired
	private CasesViewManager casesViewManager;
	
	@RequestMapping(value="/getAllCasesView", method=RequestMethod.POST)
    public @ResponseBody ResponseListCasesView getAllCasesView() {
		logger.debug("Service getAllCasesView()");
		ResponseListCasesView response = new ResponseListCasesView();
		response.setList(casesViewManager.getAll());
		return response;
    }
	
}
