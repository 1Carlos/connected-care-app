package com.fourthsource.cc.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonBackReference;

@Entity
@Table(name = "PatientDiagnosis")
public class PatientDiagnosisEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PATIENT_DIAGNOSIS_ID")
	private Integer id;
	
	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CASE_ID", nullable = false)
	private CaseEntity caseId;
	
	@JsonBackReference
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "DIAGNOSIS_ID", referencedColumnName = "ICD_CODE", nullable = false)
	private Icd10Entity diagnosisId;
	
	@Column(name="START_DATE")
	private Date startDate;
	
	@Column(name="STOP_DATE")
	private Date stopDate;
	
	@Column(name="CREATION_DATE")
	private Date creationDate;
	
	@Column(name="UPDATE_DATE")
	private Date updateDate;
	
    public Integer getId() {
		return id;
	}

    public void setId(Integer id) {
		this.id = id;
	}
    
	public CaseEntity getCaseId() {
		return caseId;
	}

	public void setCaseId(CaseEntity caseId) {
		this.caseId = caseId;
	}

	public Icd10Entity getDiagnosisId() {
		return diagnosisId;
	}

	public void setDiagnosisId(Icd10Entity diagnosisId) {
		this.diagnosisId = diagnosisId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getStopDate() {
		return stopDate;
	}

	public void setStopDate(Date stopDate) {
		this.stopDate = stopDate;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}
