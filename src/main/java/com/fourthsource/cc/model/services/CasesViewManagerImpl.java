package com.fourthsource.cc.model.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourthsource.cc.controller.utils.Converters;
import com.fourthsource.cc.domain.CasesViewEntity;
import com.fourthsource.cc.domain.requests.RequestSearchCaseView;
import com.fourthsource.cc.model.dao.CasesViewDAO;

@Service
public class CasesViewManagerImpl implements CasesViewManager {
	
	@Autowired
    private CasesViewDAO casesViewDAO;

	@Override
	@Transactional
	public List<CasesViewEntity> getAll() {
		return casesViewDAO.getAll();
	}
	
	@Override
	@Transactional
	public List<CasesViewEntity> getAllOpenCases() {
		return casesViewDAO.getAllOpenCases();
	}
	
	@Override
	@Transactional
	public List<CasesViewEntity> getAllBySearchRequest(RequestSearchCaseView request) {
		List<Criterion> expressions = new ArrayList<Criterion>();
		
		if(request.getCaseId() != null && request.getCaseId().intValue() != 0) {
		    expressions.add(Restrictions.eq("caseId", request.getCaseId() ));
		}

		if(request.getCaseWorker() != null && !request.getCaseWorker().isEmpty()) {
		    Criterion restrictionCaseWorkerFirstName = Restrictions.like("caseWorkerFirstName", "%" + request.getCaseWorker() + "%");
		    Criterion restrictionCaseWorkerLastName = Restrictions.like("caseWorkerLastName", "%" + request.getCaseWorker() + "%");
		    expressions.add(Restrictions.or(restrictionCaseWorkerFirstName, restrictionCaseWorkerLastName));
		}

		if(request.getPatientName() != null && !request.getPatientName().isEmpty()) {
		    Criterion restrictionPatientFirstName = Restrictions.like("patientFirstName", "%" + request.getPatientName() + "%");
		    Criterion restrictionPatientLastName = Restrictions.like("patientLastName", "%" + request.getPatientName() + "%");
		    expressions.add(Restrictions.or(restrictionPatientFirstName, restrictionPatientLastName));
		}
		
		if(request.getFromFollowUpDate() != null && request.getToFollowUpDate() != null) {
			expressions.add(Restrictions.between("followUpDate", request.getFromFollowUpDate(), request.getToFollowUpDate()));
			
		}
		
		if(request.getCaseStatus().intValue() != 2) {
			expressions.add(Restrictions.eq("caseStatus", request.getCaseStatus()) ); 
		}
		
		return casesViewDAO.getAllByExpresion(expressions);
	}
	
}
