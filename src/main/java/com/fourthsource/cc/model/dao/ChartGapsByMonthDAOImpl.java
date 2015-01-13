package com.fourthsource.cc.model.dao;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.fourthsource.cc.domain.ChartAdmisEntity;
import com.fourthsource.cc.domain.ChartEntity;
import com.fourthsource.cc.domain.ChartGapsByMonthEntity;

@Repository
public class ChartGapsByMonthDAOImpl implements ChartGapsByMonthDAO  {
	
	@Autowired
    private SessionFactory sessionFactory;

	@Override
	@SuppressWarnings("unchecked")
	public List<ChartGapsByMonthEntity> getAllData() {
		Query q = sessionFactory.getCurrentSession().createQuery("FROM ChartGapsByMonthEntity"); // ORDER BY gapType, colSort
		return q.list();
	}
}
