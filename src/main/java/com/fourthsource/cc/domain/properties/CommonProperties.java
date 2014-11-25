package com.fourthsource.cc.domain.properties;

import java.io.Serializable;

import com.fourthsource.cc.domain.Message;

public class CommonProperties implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Message successMessage;
	private Message transactionException;
	
	public Message getSuccessMessage() {
		return successMessage;
	}
	
	public void setSuccessMessage(Message successMessage) {
		this.successMessage = successMessage;
	}
	
	public Message getTransactionException() {
		return transactionException;
	}
	
	public void setTransactionException(Message transactionException) {
		this.transactionException = transactionException;
	}

}
