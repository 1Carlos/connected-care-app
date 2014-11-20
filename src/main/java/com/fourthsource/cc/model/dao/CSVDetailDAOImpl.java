package com.fourthsource.cc.model.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fourthsource.cc.domain.CSVDetailEntity;

@Repository
public class CSVDetailDAOImpl implements CSVDetailDAO  {

	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	@SuppressWarnings("unchecked")
	public List<CSVDetailEntity> getAllByCSVHeadId(Integer id) {
		return 	(List<CSVDetailEntity>) sessionFactory.getCurrentSession().createCriteria(CSVDetailEntity.class)
				.createAlias("csvHeadEntity", "h")
				.add(Restrictions.eq("h.id", id));
	}
	
	@Override
	public Integer saveCSVDetail(CSVDetailEntity entity) {
		return (Integer)sessionFactory.getCurrentSession().save(entity);
	}

}
