package com.fourthsource.cc.domain.responses;

import java.io.Serializable;

import com.fourthsource.cc.domain.Message;

public class ResponseFileUpload implements Serializable {

	private static final long serialVersionUID = 1L;
	private Message response;
	private Integer idFile;
	private Integer rowsInFile;
	private Integer rowsLoaded;
	
    public ResponseFileUpload() {
    }
    
	public Message getResponse() {
		return response;
	}

	public void setResponse(Message response) {
		this.response = response;
	}

	public Integer getIdFile() {
		return idFile;
	}

	public void setIdFile(Integer idFile) {
		this.idFile = idFile;
	}

	public Integer getRowsInFile() {
		return rowsInFile;
	}

	public void setRowsInFile(Integer rowsInFile) {
		this.rowsInFile = rowsInFile;
	}

	public Integer getRowsLoaded() {
		return rowsLoaded;
	}

	public void setRowsLoaded(Integer rowsLoaded) {
		this.rowsLoaded = rowsLoaded;
	}
    
}
