package com.fourthsource.cc.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonManagedReference;

@Entity
@Table(name = "icd10")
public class Icd10Entity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @Column(name="ICD_CODE_ID")
    @GeneratedValue
    private String icdCodeId;
    
    @Column(name="ICD_CODE")
    private String icdCode;
 
    @Column(name="CODE_TYPE")
    private String codeType;
    
    @Column(name="CODE_DESC1")
    private String codeDescription1;

    @Column(name="CODE_DESC2")
    private String codeDescription2;

    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "icdCode")
    private Set<Icd10ProgramsEntity> icd10ProgramsEntity = new HashSet<Icd10ProgramsEntity>(0);
    
    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "diagnosisId")
    private Set<PatientDiagnosisEntity> patientDiagnosisEntity = new HashSet<PatientDiagnosisEntity>(0);
    
    public String getIcdCodeId() {
		return icdCodeId;
	}

	public void setIcdCodeId(String icdCodeId) {
		this.icdCodeId = icdCodeId;
	}
    
    public String getIcdCode() {
		return icdCode;
	}

	public void setIcdCode10(String icdCode) {
		this.icdCode = icdCode;
	}
    
	public String getCodeType() {
		return codeType;
	}

	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	public String getCodeDescription1() {
		return codeDescription1;
	}

	public void setCodeDescription1(String codeDescription1) {
		this.codeDescription1 = codeDescription1;
	}
    
	public String getCodeDescription2() {
		return codeDescription2;
	}

	public void setCodeDescription2(String codeDescription2) {
		this.codeDescription2 = codeDescription2;
	}

	public Set<PatientDiagnosisEntity> getPatientDiagnosisEntity() {
		return patientDiagnosisEntity;
	}

	public void setPatientDiagnosisEntity(Set<PatientDiagnosisEntity> patientDiagnosisEntity) {
		this.patientDiagnosisEntity = patientDiagnosisEntity;
	}
	
}