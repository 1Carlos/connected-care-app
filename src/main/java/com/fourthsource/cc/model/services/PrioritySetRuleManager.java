package com.fourthsource.cc.model.services;

import java.util.List;

import com.fourthsource.cc.domain.PrioritySetRuleEntity;

public interface PrioritySetRuleManager {
	
	public List<PrioritySetRuleEntity> getAllPriorityRulesById(Integer id);
	public PrioritySetRuleEntity getPrioritySetRuleById(Integer id);
	public Integer savePrioritySetRule(PrioritySetRuleEntity entity);
	public void updatePrioritySetRule(PrioritySetRuleEntity entity);
	public void deletePrioritySetRule(PrioritySetRuleEntity entity);
    
}
