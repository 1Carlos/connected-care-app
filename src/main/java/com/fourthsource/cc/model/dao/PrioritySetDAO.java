package com.fourthsource.cc.model.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.jdbc.Work;

import com.fourthsource.cc.domain.PrioritySetEntity;

public interface PrioritySetDAO {
	
    public List<PrioritySetEntity> getAllPrioritySets();
	public PrioritySetEntity getPrioritySetById(Integer id);
	public Integer savePrioritySet(PrioritySetEntity entity);
	public void updatePrioritySet(PrioritySetEntity entity);
	public void deletePrioritySet(PrioritySetEntity entity);
	public void callSpGenerateDinSql (Integer Id);	
    
}