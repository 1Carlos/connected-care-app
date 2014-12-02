package com.fourthsource.cc.model.services;

import com.fourthsource.cc.domain.OrdersEntity;

public interface OrderManager {
	
	public OrdersEntity getOrderById(int id);
    
}
