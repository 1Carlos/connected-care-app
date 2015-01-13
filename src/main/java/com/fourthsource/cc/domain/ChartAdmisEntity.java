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

import org.codehaus.jackson.annotate.JsonBackReference;

@Entity
@Table(name = "v_admissions")
public class ChartAdmisEntity implements Serializable {
 
	private static final long serialVersionUID = 1L;
 
	@Id
	@Column(name="ID")
	private Integer id;
	
	@Column(name="Qtty")
	private Integer quantity;
	
	@Column(name="ADM_TYPE")
	private String admType; //Values: Admissions or Readmissions

	@Column(name="Month")
	private String month;

	@Column(name="Rec_order")
	private Date recOrder;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getAdmType() {
		return admType;
	}

	public void setAdmType(String admType) {
		this.admType = admType;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public Date getRecOrder() {
		return recOrder;
	}

	public void setRecOrder(Date recOrder) {
		this.recOrder = recOrder;
	}

}