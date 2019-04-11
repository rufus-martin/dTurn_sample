/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonsai.dropwizard.dao.d;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author vinoth.v
 */
@Entity
@Table(name ="d_studys")
public class DStudys implements IDdbPojo{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public DStudys(String name, String projetid, Date created_timestamp, Date updated_timestamp) {
        this.name = name;
        this.projetid = projetid;
        this.created_timestamp = created_timestamp;
        this.updated_timestamp = updated_timestamp;
    }

    private String name;

    private String projetid;
    private String status;


    private String notes;
    private java.util.Date created_timestamp;
    private java.util.Date updated_timestamp;

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
       this.notes=notes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProjetid() {
        return projetid;
    }

    public void setProjetid(String projetid) {
        this.projetid = projetid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreated_timestamp() {
        return created_timestamp;
    }

    public void setCreated_timestamp(Date created_timestamp) {
        this.created_timestamp = created_timestamp;
    }

    public Date getUpdated_timestamp() {
        return updated_timestamp;
    }

    public void setUpdated_timestamp(Date updated_timestamp) {
        this.updated_timestamp = updated_timestamp;
    }
}
