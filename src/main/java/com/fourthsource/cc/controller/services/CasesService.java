package com.fourthsource.cc.controller.services;

import java.util.Date;

import org.hibernate.HibernateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fourthsource.cc.domain.CaseEntity;
import com.fourthsource.cc.domain.Message;
import com.fourthsource.cc.domain.NoteEntity;
import com.fourthsource.cc.domain.OrdersEntity;
import com.fourthsource.cc.domain.properties.CommonProperties;
import com.fourthsource.cc.domain.requests.RequestAddProgressNote;
import com.fourthsource.cc.model.services.CasesManager;
import com.fourthsource.cc.model.services.NoteManager;
import com.fourthsource.cc.model.services.OrderManager;

@Controller
@RequestMapping(value="/services")
public class CasesService  {

	private final static Logger logger = LoggerFactory.getLogger(CasesService.class);

	@Autowired
	private CommonProperties commonProperties;
	
	@Autowired
	private CasesManager casesManager;
	
	@Autowired
	private OrderManager orderManager;
	
	@Autowired
	private NoteManager noteManager;
	
	@RequestMapping(value="/addProgressNote", method=RequestMethod.POST)
    private @ResponseBody Message addProgressNote(@RequestBody RequestAddProgressNote request) {
		logger.debug("Service addProgressNote()");
		Message response = null;
		
		try {
			CaseEntity caseEntity = casesManager.getSimpleCaseById(request.getCaseId());
			OrdersEntity orderEntity = orderManager.getOrderById(request.getOrderId());
			
			caseEntity.setFollowUpDate(request.getNextFollowUpDate());
			caseEntity.setCaseStatus((request.getFollowUpRequired()) ? 1 : 0);
			
			casesManager.updateCase(caseEntity);
						
			NoteEntity noteEntity = new NoteEntity();
			
			noteEntity.setOrderId(orderEntity);
			noteEntity.setNoteDetails(request.getNoteDescription());
			noteEntity.setCreationDate(new Date());
			
			noteManager.saveNote(noteEntity);
			
			response = commonProperties.getSuccessMessage();
		} catch(HibernateException e) {
			response = commonProperties.getTransactionException();
			logger.error(e.getMessage(), e);
		}

		return response;
    }
	
}
