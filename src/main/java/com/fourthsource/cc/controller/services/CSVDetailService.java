package com.fourthsource.cc.controller.services;

import org.hibernate.HibernateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fourthsource.cc.domain.Message;
import com.fourthsource.cc.domain.properties.CommonProperties;
import com.fourthsource.cc.domain.requests.RequestCSVHead;
import com.fourthsource.cc.domain.responses.ResponseListCSVDetail;
import com.fourthsource.cc.model.services.CSVDetailManager;

@Controller
@RequestMapping(value="/services")
public class CSVDetailService  {

	private final static Logger logger = LoggerFactory.getLogger(CSVDetailService.class);
	
	@Autowired
	private CommonProperties commonProperties;
	
	@Autowired
	private CSVDetailManager csvDetailManager;
	
	@RequestMapping(value="/getAllByCSVHeadId", method=RequestMethod.POST)
    public @ResponseBody ResponseListCSVDetail getAllByCSVHeadId(@RequestBody RequestCSVHead request) {
		logger.debug("Service getAllByCSVHeadId()");
		ResponseListCSVDetail response = new ResponseListCSVDetail();
		response.setList(csvDetailManager.getAllByCSVHeadId(request.getIdFile()));
		return response;
    }
	
	@RequestMapping(value="/deleteByCSVHeadId", method=RequestMethod.POST)
    public @ResponseBody Message deleteByCSVHeadId(@RequestBody RequestCSVHead request) {
		logger.debug("Service deleteByCSVHeadId()");
		Message response = null;
		
		try {
			csvDetailManager.deleteByCSVHeadId(request.getIdFile());
			response = commonProperties.getSuccessMessage();
		} catch(HibernateException e) {
			response = commonProperties.getTransactionException();
			logger.error(e.getMessage(), e);
		}

		return response;
    }
	
	@RequestMapping(value="/callReconciliationProcess", method=RequestMethod.POST)
    public @ResponseBody Message callReconciliationProcess() {
		logger.debug("Service callReconciliationProcess()");
		Message response = null;
		
		try {
			csvDetailManager.callReconciliationProcess();
			response = commonProperties.getSuccessMessage();
		} catch(HibernateException e) {
			response = commonProperties.getTransactionException();
			logger.error(e.getMessage(), e);
		}
		
		return response;
    }
	
}
