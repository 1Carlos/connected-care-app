package com.fourthsource.cc.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cases_view")
public class CasesViewEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID")
    private Integer id;
	
    @Column(name="CASE_ID")
    private Integer caseId;
    
    @Column(name="PATIENT_ID")
    private Integer patientId;
    
    @Column(name="PATIENT_FIRST_NAME")
    private String patientFirstName;
 
    @Column(name="PATIENT_LAST_NAME")
    private String patientLastName;
    
    @Column(name="PATIENT_DOB")
    private Date patientDOB;

    @Column(name="PATIENT_GENDER")
    private String patientGender;
    
    @Column(name="CASE_STATUS")
    private Integer caseStatus;

    @Column(name="DIAGNOSIS_CODE")
    private String diagnosisCode;
    
    @Column(name="DIAGNOSIS_NAME")
    private String diagnosisName;

    @Column(name="ORDER_ACTUAL_DATE")
    private Date orderActualDate;
    
    @Column(name="ORDER_SCHEDULE_DATE")
    private Date orderScheduleDate;
    
    @Column(name="SOURCE_TYPE")
    private String sourceType;
    
    @Column(name="SOURCE_NAME")
    private String sourceName;
    
    @Column(name="ORDER_TYPE")
    private String orderType;
    
    @Column(name="CASE_WORKER_LAST_NAME")
    private String caseWorkerLastName;
    
    @Column(name="CASE_WORKER_FIRST_NAME")
    private String caseWorkerFirstName;
    
    @Column(name="FOLLOW_UP_DATE")
    private Date followUpDate;
    
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
    public Integer getCaseId() {
    	return caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}
	
	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}
	
	public String getPatientFirstName() {
		return patientFirstName;
	}
	
	public void setPatientFirstName(String patientFirstName) {
		this.patientFirstName = patientFirstName;
	}
	
	public String getPatientLastName() {
		return patientLastName;
	}
	
	public void setPatientLastName(String patientLastName) {
		this.patientLastName = patientLastName;
	}
	
	public Date getPatientDOB() {
		return patientDOB;
	}
	
	public void setPatientDOB(Date patientDOB) {
		this.patientDOB = patientDOB;
	}
	
	public String getPatientGender() {
		return patientGender;
	}
	
	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}
	
	public String getDiagnosisCode() {
		return diagnosisCode;
	}
	
	public void setDiagnosisCode(String diagnosisCode) {
		this.diagnosisCode = diagnosisCode;
	}
	
	public String getDiagnosisName() {
		return diagnosisName;
	}
	
	public void setDiagnosisName(String diagnosisName) {
		this.diagnosisName = diagnosisName;
	}
	
	public Date getOrderActualDate() {
		return orderActualDate;
	}
	
	public void setOrderActualDate(Date orderActualDate) {
		this.orderActualDate = orderActualDate;
	}
	
	public Date getOrderScheduleDate() {
		return orderScheduleDate;
	}
	
	public void setOrderScheduleDate(Date orderScheduleDate) {
		this.orderScheduleDate = orderScheduleDate;
	}
	
	public Integer getCaseStatus() {
		return caseStatus;
	}

	public void setCaseStatus(Integer caseStatus) {
		this.caseStatus = caseStatus;
	}
	
	public String getSourceType() {
		return sourceType;
	}
	
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}
	
	public String getSourceName() {
		return sourceName;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}
	
	public String getOrderType() {
		return orderType;
	}
	
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

    public String getCaseWorkerLastName(){
    	return caseWorkerLastName;
    }

    public void setCaseWorkerLastName(String caseWorkerLastName){
    	this.caseWorkerLastName = caseWorkerLastName;
    }
    
    //@Column(name="CASE_WORKER_FIRST_NAME")
    //private String caseWorkerFirstName;

    public String getCaseWorkerFirstName(){
    	return caseWorkerFirstName;
    }

    public void setCaseWorkerFirstName(String caseWorkerFirstName){
    	this.caseWorkerFirstName = caseWorkerFirstName;
    }
    
    /*@Column(name="FOLLOW_UP_DATE")
    private String followUpDate;*/

    public Date getFollowUpDate(){
    	return followUpDate;
    }

    public void setFollowUpDate(Date followUpDate){
    	this.followUpDate = followUpDate;
    }
}
