package com.fourthsource.cc.domain.requests;

import java.io.Serializable;
import java.sql.Date;

public class RequestSearchCaseView implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer caseId;
	private String patientName;
	private String icdInformation;
	private Date fromOrderDate;
	private Date toOrderDate;
	private Date fromScheduleDate;
	private Date toScheduleDate;
	private String sourceType;
	private String orderType;
	private String fromFollowUpDate;
	private String toFollowUpDate;
	private String caseWorker;
	private Integer caseStatus;
	
	public Integer getCaseId() {
		return caseId;
	}
	
	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getIcdInformation() {
		return icdInformation;
	}

	public void setIcdInformation(String icdInformation) {
		this.icdInformation = icdInformation;
	}

	public Date getFromOrderDate() {
		return fromOrderDate;
	}

	public void setFromOrderDate(Date fromOrderDate) {
		this.fromOrderDate = fromOrderDate;
	}

	public Date getToOrderDate() {
		return toOrderDate;
	}

	public void setToOrderDate(Date toOrderDate) {
		this.toOrderDate = toOrderDate;
	}

	public Date getFromScheduleDate() {
		return fromScheduleDate;
	}

	public void setFromScheduleDate(Date fromScheduleDate) {
		this.fromScheduleDate = fromScheduleDate;
	}

	public Date getToScheduleDate() {
		return toScheduleDate;
	}

	public void setToScheduleDate(Date toScheduleDate) {
		this.toScheduleDate = toScheduleDate;
	}

	public String getSourceType() {
		return sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getFromFollowUpDate() {
		return fromFollowUpDate;
	}

	public void setFromFollowUpDate(String fromFollowUpDate) {
		this.fromFollowUpDate = fromFollowUpDate;
	}

	public String getToFollowUpDate() {
		return toFollowUpDate;
	}

	public void setToFollowUpDate(String toFollowUpDate) {
		this.toFollowUpDate = toFollowUpDate;
	}

	public String getCaseWorker() {
		return caseWorker;
	}

	public void setCaseWorker(String caseWorker) {
		this.caseWorker = caseWorker;
	}

	public Integer getCaseStatus() {
		return caseStatus;
	}

	public void setCaseStatus(Integer caseStatus) {
		this.caseStatus = caseStatus;
	}

}
