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
@Table(name = "phone")
public class PatientPhoneEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PHONE_ID")
	private Integer id;
	
	@JsonBackReference
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "PATIENT_ID", nullable = false)
	private PatientEntity patientId;
	
	@Column(name="PHONE")
	private String phone;
	
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

	public PatientEntity getPatientId() {
		return patientId;
	}

	public void setPatientId(PatientEntity patientId) {
		this.patientId = patientId;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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
