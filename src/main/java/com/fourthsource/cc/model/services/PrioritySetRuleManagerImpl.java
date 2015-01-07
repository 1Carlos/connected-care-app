package com.fourthsource.cc.model.services;

import java.util.List;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourthsource.cc.domain.PrioritySetRuleEntity;
import com.fourthsource.cc.model.dao.PrioritySetRuleDAO;

@Service
public class PrioritySetRuleManagerImpl implements PrioritySetRuleManager {
	
	@Autowired
    private PrioritySetRuleDAO prioritySetRuleDAO;

	@Override
	@Transactional
	@Cascade({CascadeType.SAVE_UPDATE})
	public List<PrioritySetRuleEntity> getAllPriorityRulesById(Integer id) {
		return prioritySetRuleDAO.getAllPriorityRulesById(id);
	}
	
	@Override
	@Transactional
	public PrioritySetRuleEntity getPrioritySetRuleById(Integer id) {
		return prioritySetRuleDAO.getPrioritySetRuleById(id);
	}
	
	@Override
	@Transactional
	public Integer savePrioritySetRule(PrioritySetRuleEntity entity) {
		return prioritySetRuleDAO.savePrioritySetRule(entity);
	}	
	
	@Override
	@Transactional
	public void updatePrioritySetRule(PrioritySetRuleEntity entity) {
		prioritySetRuleDAO.updatePrioritySetRule(entity);
	}	
	
	@Override
	@Transactional
	public void deletePrioritySetRule(PrioritySetRuleEntity entity) {
		prioritySetRuleDAO.deletePrioritySetRule(entity);
	}	
}
