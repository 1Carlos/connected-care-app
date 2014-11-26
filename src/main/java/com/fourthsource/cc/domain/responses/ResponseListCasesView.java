package com.fourthsource.cc.domain.responses;

import java.io.Serializable;
import java.util.List;

import com.fourthsource.cc.domain.CasesViewEntity;

public class ResponseListCasesView implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<CasesViewEntity> list;

	public List<CasesViewEntity> getList() {
		return list;
	}

	public void setList(List<CasesViewEntity> list) {
		this.list = list;
	}
	
}
