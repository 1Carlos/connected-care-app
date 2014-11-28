package com.fourthsource.cc.model.services;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
		
		if(request.getPatientName() != null && !request.getPatientName().isEmpty()) {
		    Criterion restrictionPatientFirstName = Restrictions.like("patientFirstName", "%" + request.getPatientName() + "%");
		    Criterion restrictionPatientLastName = Restrictions.like("patientLastName", "%" + request.getPatientName() + "%");
		    expressions.add(Restrictions.or(restrictionPatientFirstName, restrictionPatientLastName));
		}

		if(request.getIcdInformation() != null && !request.getIcdInformation().isEmpty()) {
		    Criterion restrictionDiagnosisCode = Restrictions.eq("diagnosisCode", request.getIcdInformation());
		    Criterion restrictionDiagnosisName = Restrictions.like("diagnosisName", "%" + request.getIcdInformation() + "%");
		    expressions.add(Restrictions.or(restrictionDiagnosisCode, restrictionDiagnosisName));
		}
		
		if(request.getFromOrderDate() != null && request.getToOrderDate() != null) {
			expressions.add(Restrictions.between("orderActualDate", request.getFromOrderDate(), request.getToOrderDate()));
		}
		
		if(request.getFromScheduleDate() != null && request.getToScheduleDate() != null) {
			expressions.add(Restrictions.between("orderScheduleDate", request.getFromScheduleDate(), request.getToScheduleDate()));
		}
		
		if(request.getSourceType() != null && !request.getSourceType().equals("0")) {
			expressions.add(Restrictions.eq("sourceType", request.getSourceType()).ignoreCase());
		}
		
		if(request.getOrderType() != null && !request.getOrderType().equals("0")) {
			expressions.add(Restrictions.eq("orderType", request.getOrderType()).ignoreCase());
		}
		
		return casesViewDAO.getAllByExpresion(expressions);
	}
	
}
