package com.fourthsource.cc.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name = "fileSummary_view")
//@NamedQueries({@NamedQuery(name="FileSummaryEntity.getStatisticByIdFile",query="select f from FileSummaryEntity f")})
public class FileSummaryEntity implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @Column(name="ID")
    private Integer Id;
    
    @Column(name="CSV_ID")
    private Integer csvId;
        
    @Column(name="SOURCE_NAME")
    private String sourceName;
    
    @Column(name="PATIENT_COUNT")
    private Integer patientCount;

    @Column(name="Rx")
    private Integer rx;
    
    @Column(name="Appt")
    private Integer appt;

    public Integer getCsvId() {
        return csvId;
    }

    public void setCsvId(Integer csvId) {
        this.csvId = csvId;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public Integer getPatientCount() {
        return patientCount;
    }

    public void setPatientCount(Integer patientCount) {
        this.patientCount = patientCount;
    }

    public Integer getRx() {
        return rx;
    }

    public void setRx(Integer rx) {
        this.rx = rx;
    }

    public Integer getAppt() {
        return appt;
    }

    public void setAppt(Integer appt) {
        this.appt = appt;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

}
