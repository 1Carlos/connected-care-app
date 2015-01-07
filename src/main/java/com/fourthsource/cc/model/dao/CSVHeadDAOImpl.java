package com.fourthsource.cc.model.dao;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fourthsource.cc.domain.CSVHeadEntity;
import com.fourthsource.cc.domain.FileSummaryEntity;
import com.fourthsource.cc.domain.ImportSummaryEntity;

@Repository
public class CSVHeadDAOImpl implements CSVHeadDAO  {

	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	public CSVHeadEntity getCSVHead(Integer id) {
		return (CSVHeadEntity)sessionFactory.getCurrentSession().get(CSVHeadEntity.class, id);
	}
	
	@Override
	public Integer saveCSVHead(CSVHeadEntity entity) {
		return (Integer)sessionFactory.getCurrentSession().save(entity);
	}


	@Override
	@SuppressWarnings("unchecked")
	public List<CSVHeadEntity> getAllCSVHead() {
		Query q = sessionFactory.getCurrentSession().createQuery("FROM CSVHeadEntity");
		//Query q = sessionFactory.getCurrentSession().createQuery("FROM Icd10ProgramsEntity pe JOIN FETCH pe.icdCodeId "); //used with Carlos
		//q.setParameter("id", id);
		return q.list();
	}	
	
	@Override
	@SuppressWarnings("unchecked")
	public List<FileSummaryEntity> getStatisticByIdFile() {
		Query q = sessionFactory.getCurrentSession().getNamedQuery("FileSummaryEntity.getStatisticByIdFile");
				//createQuery("FROM FileSummaryEntity");
		//q.setParameter("id", id);
		//q.setParameter("id", id);
		return q.list();
	}


    @Override
    @SuppressWarnings("unchecked")
    public List<ImportSummaryEntity> getImportStatByIdFile() {
	Query q = sessionFactory.getCurrentSession().getNamedQuery("ImportSummaryEntity.getImportStatByIdFile");
	return q.list();
    }

}