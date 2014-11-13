package com.fourthsource.cc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UploadFileController {
	
	private final static Logger logger = LoggerFactory.getLogger(UploadFileController.class);
	private static final String VIEW = "uploadFile";
	
	@RequestMapping(value="/uploadFile", method=RequestMethod.GET)
	public ModelAndView upload() {
		logger.debug("Loading upload page");
		return new ModelAndView(VIEW); 
	}
	
}
