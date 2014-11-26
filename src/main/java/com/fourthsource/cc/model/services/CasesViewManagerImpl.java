package com.fourthsource.cc.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourthsource.cc.domain.CasesViewEntity;
import com.fourthsource.cc.model.dao.CasesViewDAO;

@Service
public class CasesViewManagerImpl implements CasesViewManager {
	
	@Autowired
    private CasesViewDAO casesViewDAO;

	@Override
	@Transactional
	public List<CasesViewEntity> getAll() {
		return casesViewDAO.getAll();
	}
	
}
