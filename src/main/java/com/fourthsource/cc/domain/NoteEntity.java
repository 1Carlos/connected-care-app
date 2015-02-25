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
import javax.persistence.OrderBy;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonBackReference;

@Entity
@Table(name = "Note")
public class NoteEntity implements Serializable {
 
	private static final long serialVersionUID = 1L;
 
	@Id
	@Column(name="NOTE_ID")
	@GeneratedValue
	private Integer id;
	
	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY)
	@OrderBy(value = "date_format(creationDate, '%Y-%m-%d %T') desc")
	@JoinColumn(name = "ORDER_ID", nullable = false)
	private OrdersEntity orderId;

	@Column(name="NOTE_DETAILS")
	private String noteDetails;
	
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

	public OrdersEntity getOrderId() {
		return orderId;
	}

	public void setOrderId(OrdersEntity orderId) {
		this.orderId = orderId;
	}
	
	public String getNoteDetails() {
		return noteDetails;
	}
	
	public void setNoteDetails(String noteDetails) {
		this.noteDetails = noteDetails;
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