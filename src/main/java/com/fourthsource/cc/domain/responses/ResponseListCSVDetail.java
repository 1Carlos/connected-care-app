package com.fourthsource.cc.domain.responses;

import java.io.Serializable;
import java.util.Set;

import com.fourthsource.cc.domain.CSVDetailEntity;

public class ResponseListCSVDetail implements Serializable {

	private static final long serialVersionUID = 1L;

	private Set<CSVDetailEntity> list;

	public Set<CSVDetailEntity> getList() {
		return list;
	}

	public void setList(Set<CSVDetailEntity> list) {
		this.list = list;
	}
	
}
