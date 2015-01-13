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
@Table(name = "v_gaps_vs_read")
public class ChartGapVsReadEntity implements Serializable {
 
	private static final long serialVersionUID = 1L;
 
	@Id
	@Column(name="ID")
	private String id;
	
	@Column(name="TotalGaps")
	private Integer totalGap;
	
	@Column(name="Readmissions")
	private Integer totalRead;
	
	@Column(name="ReadmissionsType")
	private String readminType;
	
	@Column(name="Month")
	private String month;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getTotalGap() {
		return totalGap;
	}

	public void setTotalGap(Integer totalGap) {
		this.totalGap = totalGap;
	}

	public Integer getTotalRead() {
		return totalRead;
	}

	public void setTotalRead(Integer totalRead) {
		this.totalRead = totalRead;
	}

	public String getReadminType() {
		return readminType;
	}

	public void setReadminType(String readminType) {
		this.readminType = readminType;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}
		
}