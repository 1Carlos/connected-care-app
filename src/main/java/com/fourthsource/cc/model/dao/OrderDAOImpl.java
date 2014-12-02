package com.fourthsource.cc.model.dao;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fourthsource.cc.domain.OrdersEntity;

@Repository
public class OrderDAOImpl implements OrderDAO  {
	
	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	public OrdersEntity getOrderById(int id) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(OrdersEntity.class);
		criteria.add(Restrictions.eq("id", id));
		return (OrdersEntity) criteria.uniqueResult();
	}
	
}
