package com.fourthsource.cc.model.services;

import java.util.List;

import com.fourthsource.cc.domain.ChartAdmisEntity;
import com.fourthsource.cc.domain.ChartEntity;
import com.fourthsource.cc.domain.ChartGapsByMonthEntity;

public interface ChartGapsByMonthManager {
	
	public List<ChartGapsByMonthEntity> getAllData();
    
}
