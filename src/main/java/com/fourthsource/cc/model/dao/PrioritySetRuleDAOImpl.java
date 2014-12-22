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
public class PrioritySetRuleDAOImpl implements PrioritySetRuleDAO  {
	
	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	public PrioritySetRuleEntity getPrioritySetRuleById(Integer id) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(PrioritySetRuleEntity.class);
		criteria.add(Restrictions.eq("prioritySetId", id));
		return (PrioritySetRuleEntity) criteria.uniqueResult();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<PrioritySetRuleEntity> getAllPriorityRulesById(Integer id) {
		Query q = sessionFactory.getCurrentSession().createQuery("FROM PrioritySetRuleEntity WHERE prioritySetId.prioritySetId = :id");
		//Query q = sessionFactory.getCurrentSession().createQuery("FROM PrioritySetEntity pe JOIN FETCH pe.icdCodeId "); //used with Carlos
		q.setParameter("id", id);
		return q.list();
	}
	
	@Override
	public Integer savePrioritySetRule(PrioritySetRuleEntity entity) {
		return (Integer)sessionFactory.getCurrentSession().save(entity);
	}		
	
	@Override
	public void updatePrioritySetRule(PrioritySetRuleEntity entity) {
		sessionFactory.getCurrentSession().update(entity);
	}		
	
	@Override
	public void deletePrioritySetRule(PrioritySetRuleEntity entity) {
		sessionFactory.getCurrentSession().delete(entity);
	}		

	/*@Override
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
	}*/


}


