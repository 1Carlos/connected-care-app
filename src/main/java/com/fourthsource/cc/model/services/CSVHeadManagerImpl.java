package com.fourthsource.cc.model.services;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourthsource.cc.domain.CSVHeadEntity;
import com.fourthsource.cc.domain.FileSummaryEntity;
import com.fourthsource.cc.model.dao.CSVHeadDAO;

@Service
public class CSVHeadManagerImpl implements CSVHeadManager {
	
	@Autowired
    private CSVHeadDAO csvHeadDAO;

	@Override
	@Transactional
	public CSVHeadEntity getCSVHead(Integer id) {
		return csvHeadDAO.getCSVHead(id);
	}
	
	@Override
	@Transactional
	public Integer saveCSVHead(CSVHeadEntity entity) {
		return csvHeadDAO.saveCSVHead(entity);
	}
	
	@Override
	@Transactional
	public Integer saveCSVFileName(String fileName, String description) {
		CSVHeadEntity entity = new CSVHeadEntity();
		
		entity.setCsvName(fileName);
		entity.setCreationDate(new Date());
		entity.setFileDesc(description);
		
		return csvHeadDAO.saveCSVHead(entity);
	}

	@Override
	@Transactional
	@Cascade({CascadeType.SAVE_UPDATE})
	public List<CSVHeadEntity> getAllCSVHead() {
		return csvHeadDAO.getAllCSVHead();
	}

	@Override
	@Transactional	
	public List<FileSummaryEntity> getStatisticByIdFile() {
		return csvHeadDAO.getStatisticByIdFile();
	}

}

