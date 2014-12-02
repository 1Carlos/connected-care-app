package com.fourthsource.cc.model.services;

import java.util.Set;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourthsource.cc.domain.CaseEntity;
import com.fourthsource.cc.domain.OrdersEntity;
import com.fourthsource.cc.model.dao.CasesDAO;

@Service
public class CasesManagerImpl implements CasesManager {
	
	@Autowired
    private CasesDAO casesDAO;

	@Override
	@Transactional
	public CaseEntity getCaseById(int id) {
		CaseEntity entity = casesDAO.getCaseById(id);
		
		Hibernate.initialize(entity.getPatientId());
		Hibernate.initialize(entity.getCaseWorkerId());
		
		Set<OrdersEntity> ordersList = entity.getOrdersEntity();
		
		Hibernate.initialize(ordersList);
		
		for(OrdersEntity orders : ordersList) {
			Hibernate.initialize(orders.getNoteEntity());
		}

		return entity;
	}
	
	@Override
	@Transactional
	public CaseEntity getSimpleCaseById(int id) {
		return casesDAO.getCaseById(id);
	}
	
	@Override
	@Transactional
	public void updateCase(CaseEntity entity) {
		casesDAO.updateCase(entity);
	}
	
}
