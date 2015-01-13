package com.fourthsource.cc.model.dao;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.fourthsource.cc.domain.ChartAdmisEntity;
import com.fourthsource.cc.domain.ChartEntity;

@Repository
public class ChartAdmisDAOImpl implements ChartAdmisDAO  {
	
	@Autowired
    private SessionFactory sessionFactory;

	@Override
	@SuppressWarnings("unchecked")
	public List<ChartAdmisEntity> getAllData() {
		Query q = sessionFactory.getCurrentSession().createQuery("FROM ChartAdmisEntity ORDER BY recOrder");
		return q.list();
	}
}
