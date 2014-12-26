package com.fourthsource.cc.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonBackReference;
import org.hibernate.annotations.CascadeType;
import org.hibernate.mapping.Collection;

@Entity
@Table(name = "icd10_programs")
public class Icd10ProgramsEntity implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name="ICD10_PROGRAMS_ID")
    private Integer icd10ProgramsId;	
	
    @JsonBackReference
	@OneToOne(fetch = FetchType.EAGER) //cascade = CascadeType.ALL)//
	@JoinColumn(name = "ICD_CODE_ID", nullable = false)
	private Icd10Entity icdCodeId;    
    
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
    
	public Icd10Entity getIcdCodeId() {
		return icdCodeId;
	}

	public void setIcdCodeId(Icd10Entity icdCodeId) {
		this.icdCodeId = icdCodeId;
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

	public void setApptAdherence(Integer apptAdherence) {
		this.apptAdherence = apptAdherence;
	}

	public Integer getEducation() {
		return education;
	}

	public void setEducation(Integer education) {
		this.education = education;
	}
	
}