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
@Table(name = "csvheader")
public class CSVHeadEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CSV_ID")
	@GeneratedValue
	private Integer csvId;
	
	@Column(name="CSV_NAME")
	private String csvName;
	
	@Column(name="RECORD_COUNT")
	private Integer recordCount;

    @Column(name="CREATION_DATE")
    private Date creationDate;
    
    @Column(name="UPDATE_DATE")
    private Date updateDate;
    
    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "csvId")
    private Set<CSVDetailEntity> csvDetailEntity = new HashSet<CSVDetailEntity>(0);
	
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

	public Set<CSVDetailEntity> getCsvDetailEntity() {
		return csvDetailEntity;
	}

	public void setCsvDetailEntity(Set<CSVDetailEntity> csvDetailEntity) {
		this.csvDetailEntity = csvDetailEntity;
	}
	
}
