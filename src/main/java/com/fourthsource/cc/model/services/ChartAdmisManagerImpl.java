package com.fourthsource.cc.model.services;

import java.util.List;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourthsource.cc.domain.ChartAdmisEntity;
import com.fourthsource.cc.domain.ChartEntity;
import com.fourthsource.cc.model.dao.ChartAdmisDAO;
import com.fourthsource.cc.model.dao.ChartDAO;

@Service
public class ChartAdmisManagerImpl implements ChartAdmisManager {
	
	@Autowired
    private ChartAdmisDAO chartAdmisDAO;

	@Override
	@Transactional
	@Cascade({CascadeType.SAVE_UPDATE})
	public List<ChartAdmisEntity> getAllData() {
		return chartAdmisDAO.getAllData();
	}
}
