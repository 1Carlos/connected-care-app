package com.fourthsource.cc.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonBackReference;

@Entity
@Table(name = "csvdetail")
public class CSVDetailEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CSV_DETAIL_ID")
	@GeneratedValue
	private Integer csvDetailId;
	
	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CSV_ID", nullable = false)
	private CSVHeadEntity csvId;
	
	@Column(name="CASE_WORKER_FIRST_NAME")
	private String caseWorkerFirstName;
	
	@Column(name="CASE_WORKER_LAST_NAME")
	private String caseWorkerLastName;

	@Column(name="DIAGNOSIS_CODE_1")
	private String diagnosisCode1;
	
	@Column(name="DIAGNOSIS_CODE_2")
	private String diagnosisCode2;
	
	@Column(name="DIAGNOSIS_CODE_3")
	private String diagnosisCode3;
	
	@Column(name="DIAGNOSIS_CODE_4")
	private String diagnosisCode4;
	
	@Column(name="DIAGNOSIS_CODE_5")
	private String diagnosisCode5;
	
	@Column(name="DIAGNOSIS_START_DATE_1")
	private Date diagnosisStartDate1;
	
	@Column(name="DIAGNOSIS_START_DATE_2")
	private Date diagnosisStartDate2;
	
	@Column(name="DIAGNOSIS_START_DATE_3")
	private Date diagnosisStartDate3;
	
	@Column(name="DIAGNOSIS_START_DATE_4")
	private Date diagnosisStartDate4;
	
	@Column(name="DIAGNOSIS_START_DATE_5")
	private Date diagnosisStartDate5;
	
	@Column(name="DIAGNOSIS_STOP_DATE_1")
	private Date diagnosisStopDate1;
	
	@Column(name="DIAGNOSIS_STOP_DATE_2")
	private Date diagnosisStopDate2;
	
	@Column(name="DIAGNOSIS_STOP_DATE_3")
	private Date diagnosisStopDate3;
	
	@Column(name="DIAGNOSIS_STOP_DATE_4")
	private Date diagnosisStopDate4;
	
	@Column(name="DIAGNOSIS_STOP_DATE_5")
	private Date diagnosisStopDate5;
	
	@Column(name="ORDER_ACTUAL_DATE")
	private Date orderActualDate;
	
	@Column(name="ORDER_CREATE_DATE")
	private Date orderCreateDate;
	
	@Column(name="ORDER_DETAILS")
	private String orderDetails;
	
	@Column(name="ORDER_SCHEDULE_DATE")
	private Date orderScheduleDate;
	
	@Column(name="ORDER_STATUS")
	private Integer orderStatus;
	
	@Column(name="ORDER_TYPE")
	private String orderType;

	@Column(name="PATIENT_ADDRESS_LINE_1")
	private String patientAddressLine1;
	
	@Column(name="PATIENT_ADDRESS_LINE_2")
	private String patientAddressLine2;
	
	@Column(name="PATIENT_CITY")
	private String patientCity;
	
	@Column(name="PATIENT_DATE_OF_BIRTH")
	private Date patientDateOfBirth;
	
	@Column(name="PATIENT_FIRST_NAME")
	private String patientFirstName;

	@Column(name="PATIENT_GENDER")
	private Integer patientGender;
	
	@Column(name="PATIENT_IDENTIFIER")
	private Integer patientIdentifier;
	
	@Column(name="PATIENT_LAST_NAME")
	private String patientLastName;
	
	@Column(name="PATIENT_PHONE_NUMBER")
	private String patientPhoneNumber;
	
	@Column(name="PATIENT_STATE")
	private String patientState;
	
	@Column(name="PATIENT_ZIP")
	private String patientZip;
	
	@Column(name="PROCESSED")
	private Integer processed;
	
	@Column(name="PROGRESS_NOTE_DATE")
	private Date progressNoteDate;

	@Column(name="PROGRESS_NOTES")
	private String progressNotes;
	
	@Column(name="SOURCE_NAME")
	private String sourceName;

	@Column(name="SOURCE_TYPE")
	private Integer sourceType;
	
	public String getCaseWorkerFirstName() {
		return caseWorkerFirstName;
	}

	public void setCaseWorkerFirstName(String caseWorkerFirstName) {
		this.caseWorkerFirstName = caseWorkerFirstName;
	}
	
	public String getCaseWorkerLastName() {
		return caseWorkerLastName;
	}

	public void setCaseWorkerLastName(String caseWorkerLastName) {
		this.caseWorkerLastName = caseWorkerLastName;
	}
	
	public Integer getCsvDetailId() {
		return csvDetailId;
	}

	public void setCsvDetailId(Integer csvDetailId) {
		this.csvDetailId = csvDetailId;
	}
	
	public CSVHeadEntity getCsvId() {
		return csvId;
	}

	public void setCsvId(CSVHeadEntity csvId) {
		this.csvId = csvId;
	}

	public String getDiagnosisCode1() {
		return diagnosisCode1;
	}

	public void setDiagnosisCode1(String diagnosisCode1) {
		this.diagnosisCode1 = diagnosisCode1;
	}
	
	public String getDiagnosisCode2() {
		return diagnosisCode2;
	}

	public void setDiagnosisCode2(String diagnosisCode2) {
		this.diagnosisCode2 = diagnosisCode2;
	}
	
	public String getDiagnosisCode3() {
		return diagnosisCode3;
	}

	public void setDiagnosisCode3(String diagnosisCode3) {
		this.diagnosisCode3 = diagnosisCode3;
	}
	
	public String getDiagnosisCode4() {
		return diagnosisCode4;
	}

	public void setDiagnosisCode4(String diagnosisCode4) {
		this.diagnosisCode4 = diagnosisCode4;
	}
	
	public String getDiagnosisCode5() {
		return diagnosisCode5;
	}

	public void setDiagnosisCode5(String diagnosisCode5) {
		this.diagnosisCode5 = diagnosisCode5;
	}
	
	public Date getDiagnosisStartDate1() {
		return diagnosisStartDate1;
	}

	public void setDiagnosisStartDate1(Date diagnosisStartDate1) {
		this.diagnosisStartDate1 = diagnosisStartDate1;
	}

	public Date getDiagnosisStartDate2() {
		return diagnosisStartDate2;
	}

	public void setDiagnosisStartDate2(Date diagnosisStartDate2) {
		this.diagnosisStartDate2 = diagnosisStartDate2;
	}

	public Date getDiagnosisStartDate3() {
		return diagnosisStartDate3;
	}

	public void setDiagnosisStartDate3(Date diagnosisStartDate3) {
		this.diagnosisStartDate3 = diagnosisStartDate3;
	}

	public Date getDiagnosisStartDate4() {
		return diagnosisStartDate4;
	}

	public void setDiagnosisStartDate4(Date diagnosisStartDate4) {
		this.diagnosisStartDate4 = diagnosisStartDate4;
	}

	public Date getDiagnosisStartDate5() {
		return diagnosisStartDate5;
	}

	public void setDiagnosisStartDate5(Date diagnosisStartDate5) {
		this.diagnosisStartDate5 = diagnosisStartDate5;
	}
	
	public Date getDiagnosisStopDate1() {
		return diagnosisStopDate1;
	}

	public void setDiagnosisStopDate1(Date diagnosisStopDate1) {
		this.diagnosisStopDate1 = diagnosisStopDate1;
	}

	public Date getDiagnosisStopDate2() {
		return diagnosisStopDate2;
	}

	public void setDiagnosisStopDate2(Date diagnosisStopDate2) {
		this.diagnosisStopDate2 = diagnosisStopDate2;
	}

	public Date getDiagnosisStopDate3() {
		return diagnosisStopDate3;
	}

	public void setDiagnosisStopDate3(Date diagnosisStopDate3) {
		this.diagnosisStopDate3 = diagnosisStopDate3;
	}

	public Date getDiagnosisStopDate4() {
		return diagnosisStopDate4;
	}

	public void setDiagnosisStopDate4(Date diagnosisStopDate4) {
		this.diagnosisStopDate4 = diagnosisStopDate4;
	}

	public Date getDiagnosisStopDate5() {
		return diagnosisStopDate5;
	}

	public void setDiagnosisStopDate5(Date diagnosisStopDate5) {
		this.diagnosisStopDate5 = diagnosisStopDate5;
	}
	
	public Date getOrderActualDate() {
		return orderActualDate;
	}

	public void setOrderActualDate(Date orderActualDate) {
		this.orderActualDate = orderActualDate;
	}
	
	public Date getOrderCreateDate() {
		return orderCreateDate;
	}

	public void setOrderCreateDate(Date orderCreateDate) {
		this.orderCreateDate = orderCreateDate;
	}
	
	public String getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(String orderDetails) {
		this.orderDetails = orderDetails;
	}

	public Date getOrderScheduleDate() {
		return orderScheduleDate;
	}

	public void setOrderScheduleDate(Date orderScheduleDate) {
		this.orderScheduleDate = orderScheduleDate;
	}

	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getPatientAddressLine1() {
		return patientAddressLine1;
	}

	public void setPatientAddressLine1(String patientAddressLine1) {
		this.patientAddressLine1 = patientAddressLine1;
	}

	public String getPatientAddressLine2() {
		return patientAddressLine2;
	}

	public void setPatientAddressLine2(String patientAddressLine2) {
		this.patientAddressLine2 = patientAddressLine2;
	}

	public String getPatientCity() {
		return patientCity;
	}

	public void setPatientCity(String patientCity) {
		this.patientCity = patientCity;
	}

	public Date getPatientDateOfBirth() {
		return patientDateOfBirth;
	}

	public void setPatientDateOfBirth(Date patientDateOfBirth) {
		this.patientDateOfBirth = patientDateOfBirth;
	}
	
	public String getPatientFirstName() {
		return patientFirstName;
	}

	public void setPatientFirstName(String patientFirstName) {
		this.patientFirstName = patientFirstName;
	}

	public Integer getPatientGender() {
		return patientGender;
	}

	public void setPatientGender(Integer patientGender) {
		this.patientGender = patientGender;
	}

	public Integer getPatientIdentifier() {
		return patientIdentifier;
	}

	public void setPatientIdentifier(Integer patientIdentifier) {
		this.patientIdentifier = patientIdentifier;
	}
	
	public String getPatientLastName() {
		return patientLastName;
	}

	public void setPatientLastName(String patientLastName) {
		this.patientLastName = patientLastName;
	}
	
	public String getPatientPhoneNumber() {
		return patientPhoneNumber;
	}

	public void setPatientPhoneNumber(String patientPhoneNumber) {
		this.patientPhoneNumber = patientPhoneNumber;
	}
	
	public String getPatientState() {
		return patientState;
	}

	public void setPatientState(String patientState) {
		this.patientState = patientState;
	}

	public String getPatientZip() {
		return patientZip;
	}

	public void setPatientZip(String patientZip) {
		this.patientZip = patientZip;
	}

	public Date getProgressNoteDate() {
		return progressNoteDate;
	}

	public void setProgressNoteDate(Date progressNotesDate) {
		this.progressNoteDate = progressNotesDate;
	}
	
	public String getProgressNotes() {
		return progressNotes;
	}

	public void setProgressNotes(String progressNotes) {
		this.progressNotes = progressNotes;
	}

	public String getSourceName() {
		return sourceName;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public Integer getSourceType() {
		return sourceType;
	}

	public void setSourceType(Integer sourceType) {
		this.sourceType = sourceType;
	}

}