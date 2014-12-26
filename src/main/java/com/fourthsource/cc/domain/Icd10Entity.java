package com.fourthsource.cc.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
    private String codeDesc1;

    @Column(name="CODE_DESC2")
    private String codeDesc2;

    /*@JsonManagedReference
    @OneToOne(fetch = FetchType.EAGER, mappedBy = "icdCodeId")
    private Set<Icd10ProgramsEntity> icd10ProgramsEntity = new HashSet<Icd10ProgramsEntity>(0);*/

    /*@JsonManagedReference
    @ManyToOne(fetch = FetchType.LAZY)//, mappedBy = "icdCodeId")
    private Icd10ProgramsEntity icd10ProgramsEntity;*/
    @JsonManagedReference
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "icdCodeId")
    private Icd10ProgramsEntity icd10ProgramsEntity;   
    
    
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

	public String getCodeDesc1() {
		return codeDesc1;
	}

	public void setCodeDesc1(String codeDesc1) {
		this.codeDesc1 = codeDesc1;
	}
    
	public String getCodeDesc2() {
		return codeDesc2;
	}

	public void setCodeDesc2(String codeDesc2) {
		this.codeDesc2 = codeDesc2;
	}

	public Set<PatientDiagnosisEntity> getPatientDiagnosisEntity() {
		return patientDiagnosisEntity;
	}

	public void setPatientDiagnosisEntity(Set<PatientDiagnosisEntity> patientDiagnosisEntity) {
		this.patientDiagnosisEntity = patientDiagnosisEntity;
	}

	public Icd10ProgramsEntity getIcd10ProgramsEntity() {
		return icd10ProgramsEntity;
	}

	public void setIcd10ProgramsEntity(Icd10ProgramsEntity icd10ProgramsEntity) {
		this.icd10ProgramsEntity = icd10ProgramsEntity;
	}
	
}