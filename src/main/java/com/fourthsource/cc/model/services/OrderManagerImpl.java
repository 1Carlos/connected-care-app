package com.fourthsource.cc.model.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourthsource.cc.domain.OrdersEntity;
import com.fourthsource.cc.model.dao.OrderDAO;

@Service
public class OrderManagerImpl implements OrderManager {
	
	@Autowired
    private OrderDAO orderDAO;

	@Override
	@Transactional
	public OrdersEntity getOrderById(int id) {
		return orderDAO.getOrderById(id);
	}
	
}
