package com.astontech.astonengineer.domain;

import javax.persistence.*;

/**
 * Created by Bipin on 10/5/2015.
 */
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employee_id")
    private Integer Id;

    @Version
    private Integer version;

    @OneToOne
    @JoinColumn(name = "person_id")
    private Person person;

    @OneToOne
    private EntityType category;

    @OneToOne
    private EntityType laptop;

    @OneToOne
    private EntityType payrate;

    private String background;

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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public EntityType getCategory() {
        return category;
    }

    public void setCategory(EntityType category) {
        this.category = category;
    }

    public EntityType getLaptop() {
        return laptop;
    }

    public void setLaptop(EntityType laptop) {
        this.laptop = laptop;
    }

    public EntityType getPayrate() {
        return payrate;
    }

    public void setPayrate(EntityType payrate) {
        this.payrate = payrate;
    }
}
