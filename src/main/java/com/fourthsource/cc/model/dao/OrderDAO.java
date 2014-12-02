package com.fourthsource.cc.model.dao;

import com.fourthsource.cc.domain.OrdersEntity;

public interface OrderDAO {
	
	public OrdersEntity getOrderById(int id);
    
}