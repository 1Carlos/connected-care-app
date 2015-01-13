package com.fourthsource.cc.model.services;

import java.util.List;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourthsource.cc.domain.ChartEntity;
import com.fourthsource.cc.domain.ChartGapVsReadEntity;
import com.fourthsource.cc.model.dao.ChartDAO;
import com.fourthsource.cc.model.dao.ChartGapVsReadDAO;

@Service
public class ChartGapVsReadManagerImpl implements ChartGapVsReadManager {
	
	@Autowired
    private ChartGapVsReadDAO chartGapVsReadDAO;

	@Override
	@Transactional
	@Cascade({CascadeType.SAVE_UPDATE})
	public List<ChartGapVsReadEntity> getAllData() {
		return chartGapVsReadDAO.getAllData();
	}
	
}
