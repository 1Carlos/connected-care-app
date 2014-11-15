package com.fourthsource.cc.domain;

import java.io.Serializable;

public class Message implements Serializable {

	private static final long serialVersionUID = 1L;
	private int code;
    private String message;
    private MessageType messageType;

    public Message() {
    	
    }
    
    public Message(Message message) {
    	this.code = message.code;
    	this.message = message.message;
    	this.messageType = message.messageType;
    }
    
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public MessageType getMessageType() {
		return messageType;
	}

	public void setMessageType(MessageType messageType) {
		this.messageType = messageType;
	}
    
}
