package com.fourthsource.cc.model.dao;


import java.util.List;

import com.fourthsource.cc.domain.ChartAdmisEntity;
import com.fourthsource.cc.domain.ChartEntity;
import com.fourthsource.cc.domain.ChartGapsByMonthEntity;

public interface ChartGapsByMonthDAO {
	
    public List<ChartGapsByMonthEntity> getAllData();
    
}