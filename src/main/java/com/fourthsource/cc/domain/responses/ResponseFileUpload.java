package com.fourthsource.cc.domain.responses;

import java.io.Serializable;

import com.fourthsource.cc.domain.Message;

public class ResponseFileUpload implements Serializable {

	private static final long serialVersionUID = 1L;
	private Message response;
	private Integer idFile;
	
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
    
}
