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
		Hibernate.initialize(entity.getOrdersEntity());
		
		Set<OrdersEntity> orders = entity.getOrdersEntity();
		
		for(OrdersEntity order : orders) {
			Hibernate.initialize(order.getNoteEntity());
		}
		
		return entity;
	}
	
}
