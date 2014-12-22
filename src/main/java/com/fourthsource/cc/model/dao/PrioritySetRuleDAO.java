package com.fourthsource.cc.model.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.jdbc.Work;

import com.fourthsource.cc.domain.PrioritySetRuleEntity;

public interface PrioritySetRuleDAO {
	
    public List<PrioritySetRuleEntity> getAllPriorityRulesById(Integer id);
	public PrioritySetRuleEntity getPrioritySetRuleById(Integer id);
	public Integer savePrioritySetRule(PrioritySetRuleEntity entity);
	public void updatePrioritySetRule(PrioritySetRuleEntity entity);
	public void deletePrioritySetRule(PrioritySetRuleEntity entity);
	//public void callSpGenerateDinSql (Integer Id);	
    
}