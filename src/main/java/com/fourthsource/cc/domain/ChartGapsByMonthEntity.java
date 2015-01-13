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
@Table(name = "v_gaps_by_month")
public class ChartGapsByMonthEntity implements Serializable {
 
	private static final long serialVersionUID = 1L;
 
	@Id
	@Column(name="ID")
	private Integer id;
	
	@Column(name="Qtty")
	private Integer quantity;
	
	@Column(name="Gap_Type")
	private String gapType;
	
	@Column(name="Month")
	private String month;
	
	@Column(name="col_sort")
	private Date colSort;

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

	public String getGapType() {
		return gapType;
	}

	public void setGapType(String gapType) {
		this.gapType = gapType;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public Date getColSort() {
		return colSort;
	}

	public void setColSort(Date colSort) {
		this.colSort = colSort;
	}

}