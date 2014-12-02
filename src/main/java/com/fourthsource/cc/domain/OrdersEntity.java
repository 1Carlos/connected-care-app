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
import javax.persistence.Transient;

import org.codehaus.jackson.annotate.JsonBackReference;
import org.codehaus.jackson.annotate.JsonManagedReference;

@Entity
@Table(name = "Orders")
public class OrdersEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_ORDER")
	private Integer id;
	
	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CASE_ID", nullable = false)
	private CaseEntity caseId;
	
    @Column(name="ORDER_TYPE")
    private Integer orderType;
    
    @Column(name="ORDER_DETAILS")
    private String orderDetails;
    
    @Column(name="ORDER_STATUS")
    private Integer orderStatus;
    
    @Transient
    private String orderStatusDescription;
    
    @Column(name="ORDER_ACTUAL_DATE")
    private Date orderActualDate;
    
    @Column(name="ORDER_SCHEDULE_DATE")
    private Date orderScheduleDate;
    
    @Column(name="CREATION_DATE")
    private Date creationDate;
    
    @Column(name="UPDATE_DATE")
    private Date updateDate;
    
    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orderId")
    private Set<NoteEntity> noteEntity = new HashSet<NoteEntity>(0);

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CaseEntity getCaseId() {
		return caseId;
	}

	public void setCaseId(CaseEntity caseId) {
		this.caseId = caseId;
	}

	public Integer getOrderType() {
		return orderType;
	}

	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
	}

	public String getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(String orderDetails) {
		this.orderDetails = orderDetails;
	}

	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderStatusDescription() {
		return orderStatusDescription;
	}

	public void setOrderStatusDescription(String orderStatusDescription) {
		this.orderStatusDescription = orderStatusDescription;
	}
	
	public Date getOrderActualDate() {
		return orderActualDate;
	}

	public void setOrderActualDate(Date orderActualDate) {
		this.orderActualDate = orderActualDate;
	}

	public Date getOrderScheduleDate() {
		return orderScheduleDate;
	}

	public void setOrderScheduleDate(Date orderScheduleDate) {
		this.orderScheduleDate = orderScheduleDate;
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

	public Set<NoteEntity> getNoteEntity() {
		return noteEntity;
	}

	public void setNoteEntity(Set<NoteEntity> noteEntity) {
		this.noteEntity = noteEntity;
	}

}
