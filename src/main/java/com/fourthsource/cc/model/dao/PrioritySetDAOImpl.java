package com.fourthsource.cc.model.dao;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.jdbc.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.fourthsource.cc.domain.PrioritySetEntity;
import com.fourthsource.cc.domain.PrioritySetRuleEntity;

@Repository
public class PrioritySetDAOImpl implements PrioritySetDAO  {
	
	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	public PrioritySetEntity getPrioritySetById(Integer id) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(PrioritySetEntity.class);
		criteria.add(Restrictions.eq("prioritySetId", id));
		return (PrioritySetEntity) criteria.uniqueResult();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<PrioritySetEntity> getAllPrioritySets() {
		Query q = sessionFactory.getCurrentSession().createQuery("FROM PrioritySetEntity");
		//Query q = sessionFactory.getCurrentSession().createQuery("FROM PrioritySetEntity pe JOIN FETCH pe.icdCodeId "); //used with Carlos
		//q.setParameter("id", id);
		return q.list();
	}
	
	@Override
	public Integer savePrioritySet(PrioritySetEntity entity) {
		return (Integer)sessionFactory.getCurrentSession().save(entity);
	}		
	
	@Override
	public void updatePrioritySet(PrioritySetEntity entity) {
		sessionFactory.getCurrentSession().update(entity);
	}		
	
	@Override
	public void deletePrioritySet(PrioritySetEntity entity) {
		sessionFactory.getCurrentSession().delete(entity);
	}		

	@Override
	public void callSpGenerateDinSql (Integer Id) {
		sessionFactory.getCurrentSession().doWork(new Work() {
			@Override
			public void execute(Connection connection) throws SQLException {
				CallableStatement statement = connection.prepareCall("{CALL sp_GenerateDinSql (?)}");
			    //statement.setInt(1, Id);			    
				//(statement.registerOutParameter(1, java.sql.Types.INTEGER);
				statement.execute();
				statement.close();
			}
		});
	}


}


