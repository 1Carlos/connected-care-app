package com.fourthsource.cc.model.dao;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.fourthsource.cc.domain.ChartEntity;

@Repository
public class ChartDAOImpl implements ChartDAO  {
	
	@Autowired
    private SessionFactory sessionFactory;

	@Override
	@SuppressWarnings("unchecked")
	public List<ChartEntity> getAllData() {
		Query q = sessionFactory.getCurrentSession().createQuery("FROM ChartEntity");
		/*String sql = "SELECT COUNT(0) AS `Total`, "+
					        "MONTHNAME(STR_TO_DATE(MONTH(`t`.`FOLLOW_UP_DATE`), '%m')) AS `Month`, "+
					        "YEAR(`t`.`FOLLOW_UP_DATE`) AS `Year` "+
					 "FROM  `Cases` `t` "+
					 "GROUP BY `Month`,`Year` "+
					 "ORDER BY `Month`,`Year` ";*/
		//Query q = sessionFactory.getCurrentSession().createSQLQuery(sql);
		//Query q = sessionFactory.getCurrentSession().createQuery("FROM Icd10ProgramsEntity pe JOIN FETCH pe.icdCodeId "); //used with Carlos
		//q.setParameter("id", id);
		return q.list();
	}
	
	/*@Override
	public Icd10ProgramsEntity getIcd10ProgramsById(Integer id) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Icd10ProgramsEntity.class);
		criteria.add(Restrictions.eq("icd10ProgramsId", id));
		return (Icd10ProgramsEntity) criteria.uniqueResult();
	}
	
	@Override
	public Icd10ProgramsEntity getIcd10ProgramsByIcdCodeId(String icdCodeId) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Icd10ProgramsEntity.class);
		criteria.add(Restrictions.eq("icdCodeId", icdCodeId));
		return (Icd10ProgramsEntity) criteria.uniqueResult();
	}
	
	@Override
	public Integer saveIcd10(Icd10ProgramsEntity entity) {
		return (Integer)sessionFactory.getCurrentSession().save(entity);
	}		
	
	@Override
	public void upDateIcd10(Icd10ProgramsEntity entity) {
		sessionFactory.getCurrentSession().update(entity);
	}		
	
	@Override
	public void deleteIcd10(Icd10ProgramsEntity entity) {
		sessionFactory.getCurrentSession().delete(entity);
	}*/		
}
