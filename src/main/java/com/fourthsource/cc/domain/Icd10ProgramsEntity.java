package com.fourthsource.cc.domain;

import java.io.Serializable;

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
@Table(name = "icd10_programs")
public class Icd10ProgramsEntity implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name="ICD10_PROGRAMS_ID")
    private Integer icd10ProgramsId;	
	
	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ICD_CODE_ID", nullable = false)
	private Icd10Entity icdCode;
     
    @Column(name="RX_ADHERENCE")
    private Integer rxAdherence;
 
    @Column(name="APPT_ADHERENCE")
    private Integer apptAdherence;
    
    @Column(name="EDUCATION")
    private Integer education;

	public Integer getIcd10ProgramsId() {
		return icd10ProgramsId;
	}

	public void setIcd10ProgramsId(Integer icd10ProgramsId) {
		this.icd10ProgramsId = icd10ProgramsId;
	}
    
	public Icd10Entity getIcdCode() {
		return icdCode;
	}

	public void setIcdCode(Icd10Entity icdCode) {
		this.icdCode = icdCode;
	}

	public Integer getRxAdherence() {
		return rxAdherence;
	}

	public void setRxAdherence(Integer rxAdherence) {
		this.rxAdherence = rxAdherence;
	}

	public Integer getApptAdherence() {
		return apptAdherence;
	}

	public void setapptAdherence(Integer apptAdherence) {
		this.apptAdherence = apptAdherence;
	}

	public Integer getEducation() {
		return education;
	}

	public void setEducation(Integer education) {
		this.education = education;
	}
	
}