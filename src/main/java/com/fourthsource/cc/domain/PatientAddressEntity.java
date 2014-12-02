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
@Table(name = "addresspatient")
public class PatientAddressEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ADDRESS_ID")
	private Integer id;
	
	@JsonBackReference
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "PATIENT_ID", nullable = false)
	private PatientEntity patientId;
	
	@Column(name="ADDRESS_LINE_1")
	private String addressLine1;
	
	@Column(name="ADDRESS_LINE_2")
	private String addressLine2;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="STATE")
	private String state;
	
	@Column(name="ZIP")
	private String zipCode;
	
	@Column(name="ADDRESS_STATUS")
	private Integer addressStatus;
	
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

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public Integer getAddressStatus() {
		return addressStatus;
	}

	public void setAddressStatus(Integer addressStatus) {
		this.addressStatus = addressStatus;
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
