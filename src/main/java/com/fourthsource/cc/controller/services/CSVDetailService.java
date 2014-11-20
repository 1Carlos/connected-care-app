package com.fourthsource.cc.controller.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fourthsource.cc.domain.responses.ResponseListCSVDetail;
import com.fourthsource.cc.model.services.CSVDetailManager;

@Controller
@RequestMapping(value="/services")
public class CSVDetailService  {

	private final static Logger logger = LoggerFactory.getLogger(CSVDetailService.class);
	
	@Autowired
	private CSVDetailManager csvDetailManager;
	
	@RequestMapping(value="/getAllByCSVHeadId", method=RequestMethod.GET)
    public @ResponseBody ResponseListCSVDetail getAllByCSVHeadId() {
		logger.debug("Method getAllByCSVHeadId()");
		ResponseListCSVDetail response = new ResponseListCSVDetail();
		response.setList(csvDetailManager.getAllByCSVHeadId(42));
		return response;
    }
	
}
