package com.fourthsource.cc.domain.requests;

import java.io.Serializable;

public class RequestAddIcd10Programs implements Serializable {

	private static final long serialVersionUID = 1L;
	private String icdCode;
	private Integer rxAdherence;
	private Integer apptAdherence;
	private Integer education;

	public String getIcdCode() {
		return icdCode;
	}
	public void setIcdCode(String icdCode) {
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
