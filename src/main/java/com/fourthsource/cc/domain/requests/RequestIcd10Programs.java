package com.fourthsource.cc.domain.requests;

import java.io.Serializable;

import com.fourthsource.cc.domain.Icd10ProgramsEntity;

public class RequestIcd10Programs implements Serializable {
	//{"icd10ProgramsId":"3","icdCodeId":"00001","icdCode":"A00","rxAdherence":"0","apptAdherence":"0","education":"1"}
	private static final long serialVersionUID = 1L;
	private Integer icd10ProgramsId;
	private String  icd10Id;
	private String  icdCodeId;
	private String  icdCode;
	private Integer rxAdherence;
	private Integer apptAdherence;
	private Integer education;
	//private Icd10ProgramsEntity icd10ProgramsEntity;
	
	// Icd10ProgramsEntity
	/*public Icd10ProgramsEntity getIcd10ProgramsEntity() {
		return icd10ProgramsEntity;
	}
	public void setIcd10ProgramsEntity(Icd10ProgramsEntity icd10ProgramsEntity) {
		this.icd10ProgramsEntity = icd10ProgramsEntity;
	}*/
	
	// Icd10ProgramsId
	public Integer getIcd10ProgramsId() {
		return icd10ProgramsId;
	}
	public void setIcd10ProgramsId(Integer icd10ProgramsId) {
		this.icd10ProgramsId = icd10ProgramsId;
	}
	
	// Icd10Id
	public String getIcd10Id() {
		return icd10Id;
	}
	public void setIcd10Id(String icd10Id) {
		this.icd10Id = icd10Id;
	}
	
	// IcdCode
	public String getIcdCode() {
		return icdCode;
	}
	public void setIcdCode(String icdCode) {
		this.icdCode = icdCode;
	}

	// rxAdherence
	public Integer getRxAdherence() {
		return rxAdherence;
	}
	public void setRxAdherence(Integer rxAdherence) {
		this.rxAdherence = rxAdherence;
	}
	
	// apptAdherence
	public Integer getApptAdherence() {
		return apptAdherence;
	}
	public void setApptAdherence(Integer apptAdherence) {
		this.apptAdherence = apptAdherence;
	}
	
	// Education
	public Integer getEducation() {
		return education;
	}
	public void setEducation(Integer education) {
		this.education = education;
	}
	public String getIcdCodeId() {
		return icdCodeId;
	}
	public void setIcdCodeId(String icdCodeId) {
		this.icdCodeId = icdCodeId;
	}
	
}
