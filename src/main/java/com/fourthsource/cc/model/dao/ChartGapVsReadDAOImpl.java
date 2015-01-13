package com.fourthsource.cc.model.dao;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.fourthsource.cc.domain.ChartEntity;
import com.fourthsource.cc.domain.ChartGapVsReadEntity;

@Repository
public class ChartGapVsReadDAOImpl implements ChartGapVsReadDAO  {
	
	@Autowired
    private SessionFactory sessionFactory;

	@Override
	@SuppressWarnings("unchecked")
	public List<ChartGapVsReadEntity> getAllData() {
		Query q = null;		
		q = sessionFactory.getCurrentSession().createQuery("FROM ChartGapVsReadEntity");
		return q.list();
	}
}
