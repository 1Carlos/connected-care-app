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
@Table(name = "PrioritySets")
public class PrioritySetEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @Column(name="PRIORITY_SET_ID")
    @GeneratedValue
    private Integer prioritySetId;
    
    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "prioritySetId")
    private Set<PrioritySetRuleEntity> PrioritySetRuleEntity = new HashSet<PrioritySetRuleEntity>(0);
    
	@Column(name="DESCRIPTION")
    private String description;
 
    @Column(name="PRIORITY_VALUE")
    private Integer priorityValue;
    
    @Column(name="MYSQL_UPDATE")
    private String mysqlUpdate;

    @Column(name="MYSQL_LIST_CASES")
    private String mysqlListCases;

    @Column(name="ENABLED_FLAG")
    private Boolean enabledFlag;

    @Column(name="CREATION_DATE")
    private Date creationDate;

    @Column(name="UPDATE_DATE")
    private Date updateDate;

	public Integer getPrioritySetId() {
		return prioritySetId;
	}

	public void setPrioritySetId(Integer prioritySetId) {
		this.prioritySetId = prioritySetId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPriorityValue() {
		return priorityValue;
	}

	public void setPriorityValue(Integer priorityValue) {
		this.priorityValue = priorityValue;
	}

	public String getMysqlUpdate() {
		return mysqlUpdate;
	}

	public void setMysqlUpdate(String mysqlUpdate) {
		this.mysqlUpdate = mysqlUpdate;
	}

	public String getMysqlListCases() {
		return mysqlListCases;
	}

	public void setMysqlListCases(String mysqlListCases) {
		this.mysqlListCases = mysqlListCases;
	}

	public Boolean getEnabledFlag() {
		return enabledFlag;
	}

	public void setEnabledFlag(Boolean enabledFlag) {
		this.enabledFlag = enabledFlag;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Set<PrioritySetRuleEntity> getPrioritySetRuleEntity() {
		return PrioritySetRuleEntity;
	}

	public void setPrioritySetRuleEntity(
			Set<PrioritySetRuleEntity> prioritySetRuleEntity) {
		PrioritySetRuleEntity = prioritySetRuleEntity;
	}


    /*@JsonManagedReference
    @OneToOne(fetch = FetchType.EAGER, mappedBy = "icdCodeId")
    private Set<Icd10ProgramsEntity> icd10ProgramsEntity = new HashSet<Icd10ProgramsEntity>(0);*/

    /*@JsonManagedReference
    @ManyToOne(fetch = FetchType.LAZY)//, mappedBy = "icdCodeId")
    private Icd10ProgramsEntity icd10ProgramsEntity;*/
    /*@JsonManagedReference
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "icdCodeId")
    private Icd10ProgramsEntity icd10ProgramsEntity;   
    
    
    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "diagnosisId")
    private Set<PatientDiagnosisEntity> patientDiagnosisEntity = new HashSet<PatientDiagnosisEntity>(0);
    */
	
}