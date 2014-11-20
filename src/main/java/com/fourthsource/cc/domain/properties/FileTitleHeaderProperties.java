package com.fourthsource.cc.domain.properties;

import java.io.Serializable;

public class FileTitleHeaderProperties implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String headerName;
	private String dataType;
	
	public FileTitleHeaderProperties() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHeaderName() {
		return headerName;
	}

	public void setHeaderName(String headerName) {
		this.headerName = headerName;
	}
	
	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String toString() {
		return "{" + this.id + ", " + this.headerName + ", " + this.dataType + "}";
	}

}
