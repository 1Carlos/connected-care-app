package com.fourthsource.cc.domain.requests;

import java.io.Serializable;
import java.util.Date;

public class RequestAddProgressNote implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer caseId;
	private Integer orderId;
	private String noteDescription;
	private Date nextFollowUpDate;
	private Boolean followUpRequired;

	public Integer getCaseId() {
		return caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}
	
	public Integer getOrderId() {
		return orderId;
	}
	
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getNoteDescription() {
		return noteDescription;
	}

	public void setNoteDescription(String noteDescription) {
		this.noteDescription = noteDescription;
	}

	public Date getNextFollowUpDate() {
		return nextFollowUpDate;
	}

	public void setNextFollowUpDate(Date nextFollowUpDate) {
		this.nextFollowUpDate = nextFollowUpDate;
	}

	public Boolean getFollowUpRequired() {
		return followUpRequired;
	}

	public void setFollowUpRequired(Boolean followUpRequired) {
		this.followUpRequired = followUpRequired;
	}

}
