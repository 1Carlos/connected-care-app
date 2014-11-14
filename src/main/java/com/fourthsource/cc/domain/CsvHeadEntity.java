package com.fourthsource.cc.domain;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name = "csv_head")
	public class CsvHeadEntity implements Serializable {

		private static final long serialVersionUID = 1L;
	
		@Id
		@Column(name="CSV_ID")
		@GeneratedValue
		private Integer csvId;
	
	@Column(name="CSV_NAME")
	private String csvName;
	
	@Column(name="RECORD_COUNT")
	private Integer recordCount;

	public String getCsvName() {
		return csvName;
	}

	public void setCsvName(String csvName) {
		this.csvName = csvName;
	}

	public Integer getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(Integer recordCount) {
		this.recordCount = recordCount;
	}
	
}
