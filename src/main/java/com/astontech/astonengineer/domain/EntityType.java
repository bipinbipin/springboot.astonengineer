package com.astontech.astonengineer.domain;

import javax.persistence.*;

/**
 * Created by Bipin on 10/15/2015.
 */
@Entity
public class EntityType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "entitytype_id")
    private Integer Id;

    @Version
    private Integer version;

    private String entityTypeName;

    private String EntityTypeValue;


    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getEntityTypeValue() {
        return EntityTypeValue;
    }

    public void setEntityTypeValue(String entityTypeValue) {
        EntityTypeValue = entityTypeValue;
    }

    public String getEntityTypeName() {
        return entityTypeName;
    }

    public void setEntityTypeName(String entityTypeName) {
        this.entityTypeName = entityTypeName;
    }
}
