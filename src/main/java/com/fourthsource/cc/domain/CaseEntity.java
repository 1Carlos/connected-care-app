package com.fourthsource.cc.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonBackReference;
import org.codehaus.jackson.annotate.JsonManagedReference;

@Entity
@Table(name = "Cases")
public class CaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CASE_ID")
	private Integer id;
	
	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PATIENT_ID", nullable = false)
	private PatientEntity patientId;
	
	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CASE_WORKER_ID", nullable = false)
	private CaseWorkerEntity caseWorkerId;
	
	@Column(name="FOLLOW_UP_DATE")
	private Date followUpDate;
	
	@Column(name="CASE_STATUS")
	private Integer caseStatus;
	
	@Column(name="PRIORITY_VALUE")
	private Integer priority;
	
    @JsonManagedReference
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "caseId")
    private Set<PatientDiagnosisEntity> patientDiagnosisEntity = new HashSet<PatientDiagnosisEntity>(0);
	
    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "caseId")
    private Set<OrdersEntity> ordersEntity = new HashSet<OrdersEntity>(0);

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

	public CaseWorkerEntity getCaseWorkerId() {
		return caseWorkerId;
	}

	public void setCaseWorkerId(CaseWorkerEntity caseWorkerId) {
		this.caseWorkerId = caseWorkerId;
	}

	public Date getFollowUpDate() {
		return followUpDate;
	}

	public void setFollowUpDate(Date followUpDate) {
		this.followUpDate = followUpDate;
	}

	public Integer getCaseStatus() {
		return caseStatus;
	}

	public void setCaseStatus(Integer caseStatus) {
		this.caseStatus = caseStatus;
	}

	public Set<PatientDiagnosisEntity> getPatientDiagnosisEntity() {
		return patientDiagnosisEntity;
	}

	public void setPatientDiagnosisEntity(Set<PatientDiagnosisEntity> patientDiagnosisEntity) {
		this.patientDiagnosisEntity = patientDiagnosisEntity;
	}

	public Set<OrdersEntity> getOrdersEntity() {
		return ordersEntity;
	}

	public void setOrdersEntity(Set<OrdersEntity> ordersEntity) {
		this.ordersEntity = ordersEntity;
	}

	/**
	 * @return the priority
	 */
	public Integer getPriority() {
		return priority;
	}

	/**
	 * @param priority the priority to set
	 */
	public void setPriority(Integer priority) {
		this.priority = priority;
	}

}
