package com.fourthsource.cc.domain;

import java.io.Serializable;
import java.util.Date;
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
@Table(name = "patient")
public class PatientEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @Column(name="PATIENT_ID")
    @GeneratedValue
    private Integer id;
     
    @Column(name="PATIENT_FIRST_NAME")
    private String firstName;
 
    @Column(name="PATIENT_LAST_NAME")
    private String lastName;
    
    @Column(name="PATIENT_DATE_OF_BIRTH")
    private Date dateOfBirth;

    @Column(name="PATIENT_GENDER")
    private Integer gender;
    
    @Column(name="CREATION_DATE")
    private Date creationDate;
    
    @Column(name="UPDATE_DATE")
    private Date updateDate;
    
    @JsonManagedReference
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "patientId")
    private Set<PatientAddressEntity> patientAddressEntity = new HashSet<PatientAddressEntity>(0);
    
    @JsonManagedReference
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "patientId")
    private Set<PatientPhoneEntity> patientPhoneEntity = new HashSet<PatientPhoneEntity>(0);
    
    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "patientId")
    private Set<CaseEntity> casesEntity = new HashSet<CaseEntity>(0);
    
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
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

	public Set<PatientAddressEntity> getPatientAddressEntity() {
		return patientAddressEntity;
	}

	public void setPatientAddressEntity(Set<PatientAddressEntity> patientAddressEntity) {
		this.patientAddressEntity = patientAddressEntity;
	}

	public Set<PatientPhoneEntity> getPatientPhoneEntity() {
		return patientPhoneEntity;
	}

	public void setPatientPhoneEntity(Set<PatientPhoneEntity> patientPhoneEntity) {
		this.patientPhoneEntity = patientPhoneEntity;
	}
	
	public Set<CaseEntity> getCasesEntity() {
		return casesEntity;
	}

	public void setCasesEntity(Set<CaseEntity> casesEntity) {
		this.casesEntity = casesEntity;
	}

}