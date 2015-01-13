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
@Table(name = "importsummary")
//@NamedQueries({@NamedQuery(name="ImportSummaryEntity.getImportStatByIdFile",query="select f from ImportSummaryEntity f")})
public class ImportSummaryEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="ID")
    private Integer Id;
    
    @Column(name="CSV_ID")
    private Integer csvId;
        
    @Column(name="DESCRIPTION")
    private String descrip;
    
    @Column(name="QTY")
    private Integer quantity;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }
    
    public Integer getCsvId() {
        return csvId;
    }

    public void setCsvId(Integer csvId) {
        this.csvId = csvId;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    
}
