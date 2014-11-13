package com.fourthsource.cc.domain.responses;

import java.io.Serializable;
import java.util.List;

import com.fourthsource.cc.domain.PatientEntity;

public class ResponseListPatients implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<PatientEntity> list;

	public List<PatientEntity> getList() {
		return list;
	}

	public void setList(List<PatientEntity> list) {
		this.list = list;
	}
	
}
