package com.fourthsource.cc.domain.requests;

import java.io.Serializable;
import java.util.Date;

public class RequestPrioritySet implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer prioritySetId;
	private Integer description;
	private Integer priorityValue;
	private String mysqlUpdate;
	private String mysqlListCases;
	private Boolean enabledFlag;
	private Date creationDate;
	private Date updateDate;

	public Integer getPrioritySetId() {
		return prioritySetId;
	}
	public void setPrioritySetId(Integer prioritySetId) {
		this.prioritySetId = prioritySetId;
	}
	public Integer getDescription() {
		return description;
	}
	public void setDescription(Integer description) {
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


}
