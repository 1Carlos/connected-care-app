package com.fourthsource.cc.model.services;

import java.util.List;
import java.util.Set;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourthsource.cc.domain.CSVDetailEntity;
import com.fourthsource.cc.domain.FileSummaryEntity;
import com.fourthsource.cc.model.dao.CSVDetailDAO;

@Service
public class CSVDetailManagerImpl implements CSVDetailManager {
	
	@Autowired
    private CSVDetailDAO csvDetailDAO;

	@Override
	@Transactional
	public Set<CSVDetailEntity> getAllByCSVHeadId(Integer id) {
		Set<CSVDetailEntity> list = csvDetailDAO.getAllByCSVHeadId(id);
		Hibernate.initialize(list);
		return list;
	}
	
	@Override
	@Transactional
	public List<CSVDetailEntity> getAllProcessedByCSVHeadId(Integer id) {
		return csvDetailDAO.getAllProcessedByCSVHeadId(id);
	}
	
	@Override
	@Transactional
	public Integer saveCSVDetail(CSVDetailEntity entity) {
		return csvDetailDAO.saveCSVDetail(entity);
	}
	
	@Override
	@Transactional
	public void deleteByCSVHeadId(Integer id) {
		csvDetailDAO.deleteByCSVHeadId(id);
	}
	
	@Override
	@Transactional
	public void callNormalizationProcess() {
		csvDetailDAO.callSPGetPatientInfo();
	}
	
	@Override
	@Transactional
	public void callReconciliationProcess() {
		csvDetailDAO.callSPReconciliation();
	}
	
	@Override
	@Transactional
	public void callNormalizationByIdFile(Integer id) {
		csvDetailDAO.callSPGetPatientInfo2(id);
	}

	@Override
	@Transactional
	public List<FileSummaryEntity> getStatisticByIdFile(Integer id) {
		return csvDetailDAO.getStatisticByIdFile(id);
	}
	

}
