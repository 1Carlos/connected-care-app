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
    @Column(name="CASE_ID")
    private Integer caseId;
    
    @Column(name="PATIENT_FIRST_NAME")
    private String patientFirstName;
 
    @Column(name="PATIENT_LAST_NAME")
    private String patientLastName;
    
    @Column(name="PATIENT_DOB")
    private Date patientDOB;

    @Column(name="PATIENT_GENDER")
    private String patientGender;

    @Column(name="DIAGNOSIS_CODE")
    private String diagnosisCode;
    
    @Column(name="DIAGNOSIS_NAME")
    private String diagnosisName;

    @Column(name="ORDER_ACTUAL_DATE")
    private Date orderActualDate;
    
    @Column(name="ORDER_SCHEDULE_DATE")
    private Date orderScheduleDate;
    
    @Column(name="SOURCE_ID")
    private Integer sourceId;
    
    @Column(name="ORDER_TYPE")
    private String orderType;
    
    @Column(name="CASE_STATUS")
    private Integer caseStatus;
    
    public Integer getCaseId() {
    	return caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
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
	
	public Integer getSourceId() {
		return sourceId;
	}
	
	public void setSourceId(Integer sourceId) {
		this.sourceId = sourceId;
	}
	
	public String getOrderType() {
		return orderType;
	}
	
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public Integer getCaseStatus() {
		return caseStatus;
	}

	public void setCaseStatus(Integer caseStatus) {
		this.caseStatus = caseStatus;
	}

}
