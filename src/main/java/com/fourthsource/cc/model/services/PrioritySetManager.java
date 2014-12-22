package com.fourthsource.cc.model.services;

import java.util.List;

import com.fourthsource.cc.domain.PrioritySetEntity;

public interface PrioritySetManager {
	
	public List<PrioritySetEntity> getAllPrioritySets();
	public PrioritySetEntity getPrioritySetById(Integer id);
	public Integer savePrioritySet(PrioritySetEntity entity);
	public void updatePrioritySet(PrioritySetEntity entity);
	public void deletePrioritySet(PrioritySetEntity entity);
    
}
