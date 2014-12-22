package com.fourthsource.cc.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonManagedReference;

@Entity
@Table(name = "PrioritySetRules")
public class PrioritySetRuleEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @Column(name="PTY_SET_RULE_ID")
    @GeneratedValue
    private Integer ptySetruleId;

    @JsonManagedReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRIORITY_SET_ID")
    private PrioritySetEntity prioritySetId;


	@Column(name="RULE_TYPE")
    private String ruleType;
 
    @Column(name="OPERATOR")
    private String operator;
    
    @Column(name="CONSTANT1")
    private String constant1;

    @Column(name="CONSTANT2")
    private String constant2;

    @Column(name="CREATION_DATE")
    private Date creationDate;

    @Column(name="UPDATE_DATE")
    private Date updateDate;

    //@Column(name="PRIORITY_SET_ID")
    //private Integer prioritySetId;

	public Integer getPtySetruleId() {
		return ptySetruleId;
	}

	public void setPtySetruleId(Integer ptySetruleId) {
		this.ptySetruleId = ptySetruleId;
	}

    
    public PrioritySetEntity getPrioritySetId() {
		return prioritySetId;
	}

	public void setPrioritySetId(PrioritySetEntity prioritySetId) {
		this.prioritySetId = prioritySetId;
	}

	public String getRuleType() {
		return ruleType;
	}

	public void setRuleType(String ruleType) {
		this.ruleType = ruleType;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getConstant1() {
		return constant1;
	}

	public void setConstant1(String constant1) {
		this.constant1 = constant1;
	}

	public String getConstant2() {
		return constant2;
	}

	public void setConstant2(String constant2) {
		this.constant2 = constant2;
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

	/*public Integer getPrioritySetId() {
		return prioritySetId;
	}

	public void setPrioritySetId(Integer prioritySetId) {
		this.prioritySetId = prioritySetId;
	}*/

	public static long getSerialversionuid() {
		return serialVersionUID;
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