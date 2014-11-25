package com.fourthsource.cc.model.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Set;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.jdbc.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fourthsource.cc.domain.CSVDetailEntity;
import com.fourthsource.cc.domain.CSVHeadEntity;

@Repository
public class CSVDetailDAOImpl implements CSVDetailDAO  {
	
	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	public Set<CSVDetailEntity> getAllByCSVHeadId(Integer id) {
		Set<CSVDetailEntity> list = ((CSVHeadEntity)sessionFactory.getCurrentSession().load(CSVHeadEntity.class, id)).getCsvDetailEntity();
		Hibernate.initialize(list);
		return list;
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<CSVDetailEntity> getAllProcessedByCSVHeadId(Integer id) {
		Query q = sessionFactory.getCurrentSession().createQuery("FROM CSVDetailEntity WHERE csvId.id = :id AND processed = 1");
		q.setParameter("id", id);
		return q.list();
	}
	
	@Override
	public Integer saveCSVDetail(CSVDetailEntity entity) {
		return (Integer)sessionFactory.getCurrentSession().save(entity);
	}

	@Override
	public void deleteByCSVHeadId(Integer id) {
		Set<CSVDetailEntity> list = ((CSVHeadEntity)sessionFactory.getCurrentSession().load(CSVHeadEntity.class, id)).getCsvDetailEntity();
		Hibernate.initialize(list);
		
		for(CSVDetailEntity entity : list) {
			sessionFactory.getCurrentSession().delete(entity);
		}
	}
	
	@Override
	public void callSPGetPatientInfo() {
		sessionFactory.getCurrentSession().doWork(new Work() {
			@Override
			public void execute(Connection connection) throws SQLException {
				CallableStatement statement = connection.prepareCall("{CALL sp_GetPatientInfo(?, ?, ?)}");
				statement.registerOutParameter(1, java.sql.Types.INTEGER);
				statement.registerOutParameter(2, java.sql.Types.INTEGER);
				statement.registerOutParameter(3, java.sql.Types.INTEGER);
				statement.execute();
				statement.close();
			}
		});
	}

	@Override
	public void callSPClearDB() {
		Query q = sessionFactory.getCurrentSession().createSQLQuery("CALL sp_ClearDB()");
		q.executeUpdate();
	}
	
	@Override
	public void callSPReconciliation() {
		Query q = sessionFactory.getCurrentSession().createSQLQuery("CALL sp_Reconciliation()");
		q.executeUpdate();
	}
	
}
