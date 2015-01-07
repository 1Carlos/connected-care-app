package com.fourthsource.cc.model.services;

import java.util.List;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourthsource.cc.domain.PrioritySetEntity;
import com.fourthsource.cc.model.dao.PrioritySetDAO;

@Service
public class PrioritySetManagerImpl implements PrioritySetManager {
	
	@Autowired
    private PrioritySetDAO prioritySetDAO;

	@Override
	@Transactional
	@Cascade({CascadeType.SAVE_UPDATE})
	public List<PrioritySetEntity> getAllPrioritySets() {
		return prioritySetDAO.getAllPrioritySets();
	}
	
	@Override
	@Transactional
	public PrioritySetEntity getPrioritySetById(Integer id) {
		return prioritySetDAO.getPrioritySetById(id);
	}
	
	@Override
	@Transactional
	public Integer savePrioritySet(PrioritySetEntity entity) {
		return prioritySetDAO.savePrioritySet(entity);
	}	
	
	@Override
	@Transactional
	public void updatePrioritySet(PrioritySetEntity entity) {
		prioritySetDAO.updatePrioritySet(entity);
	}	
	
	@Override
	@Transactional
	public void deletePrioritySet(PrioritySetEntity entity) {
		prioritySetDAO.deletePrioritySet(entity);
	}	
}
