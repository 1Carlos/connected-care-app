package com.fourthsource.cc.model.dao;

import java.util.List;

import org.hibernate.criterion.Criterion;

import com.fourthsource.cc.domain.CasesViewEntity;

public interface CasesViewDAO {
	
	public List<CasesViewEntity> getAll();
	public List<CasesViewEntity> getAllOpenCases();
	public List<CasesViewEntity> getAllByExpresion(List<Criterion> expressions);
    
}