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
		Query q = null;		
		//try {
		q = sessionFactory.getCurrentSession().createQuery("FROM ChartEntity");
		/*String sql = "SELECT 1080 AS n1, "+
			        "       ´January´ AS s1, "+
			        "        2015 AS n2 "+
			        "FROM  dual ";*/
		/*String sql = "SELECT COUNT(0) AS n1, "+
					        "MONTHNAME(STR_TO_DATE(MONTH(`t`.`FOLLOW_UP_DATE`), '%m')) AS s1, "+
					        "YEAR(`t`.`FOLLOW_UP_DATE`) AS s3 "+
					 "FROM  `Cases` `t` "+
					 "GROUP BY s1,s3 ";*/
					 //"ORDER BY s1,s3 ";
		//q = sessionFactory.getCurrentSession().createSQLQuery(sql);
		//Query q = sessionFactory.getCurrentSession().createQuery("FROM Icd10ProgramsEntity pe JOIN FETCH pe.icdCodeId "); //used with Carlos
		//q.setParameter("id", id);
		//}
		//catch (Exception e){
			//e.printStackTrace();
		//}
		/*finally {
		    if (sessionFactory.getCurrentSession().s
		    		.session != null) {
		      session.close();
		    }
		  }*/
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
