package com.astontech.astonengineer.domain;

import javax.persistence.*;

/**
 * Created by Bipin on 10/15/2015.
 */
@Entity
public class Ent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ent_id")
    private Integer id;

    @Version
    private Integer version;

    private String EntityName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getEntityName() {
        return EntityName;
    }

    public void setEntityName(String entityName) {
        EntityName = entityName;
    }
}

