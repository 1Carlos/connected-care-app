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
@Table(name = "caseworker")
public class CaseWorkerEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @Column(name="CASE_WORKER_ID")
    @GeneratedValue
    private Integer id;
     
    @Column(name="FIRST_NAME")
    private String firstName;
 
    @Column(name="LAST_NAME")
    private String lastName;
    
    @Column(name="CREATION_DATE")
    private Date creationDate;
    
    @Column(name="UPDATE_DATE")
    private Date updateDate;
    
    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "caseWorkerId")
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
	
	public Set<CaseEntity> getCasesEntity() {
		return casesEntity;
	}

	public void setCasesEntity(Set<CaseEntity> casesEntity) {
		this.casesEntity = casesEntity;
	}
	
}