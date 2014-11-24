package com.fourthsource.cc.domain.requests;

import java.io.Serializable;

public class RequestCSVHead implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idFile;
	
	public Integer getIdFile() {
		return idFile;
	}
	
	public void setIdFile(Integer idFile) {
		this.idFile = idFile;
	}

}
