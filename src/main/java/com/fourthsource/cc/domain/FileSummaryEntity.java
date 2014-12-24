package com.fourthsource.cc.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "fileSummary_view")
public class FileSummaryEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CSV_ID")
	@GeneratedValue
	private Integer csvId;
	
	@Column(name="SOURCE_NAME")
	private String sourceName;
	
	@Column(name="PATIENT_COUNT")
	private Integer patientCount;

    @Column(name="Rx")
    private Date rx;
    
    @Column(name="Appt")
    private Date appt;

	public Integer getCsvId() {
		return csvId;
	}

	public void setCsvId(Integer csvId) {
		this.csvId = csvId;
	}

	public String getSourceName() {
		return sourceName;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public Integer getPatientCount() {
		return patientCount;
	}

	public void setPatientCount(Integer patientCount) {
		this.patientCount = patientCount;
	}

	public Date getRx() {
		return rx;
	}

	public void setRx(Date rx) {
		this.rx = rx;
	}

	public Date getAppt() {
		return appt;
	}

	public void setAppt(Date appt) {
		this.appt = appt;
	}
}
