package com.astontech.astonengineer.domain;

import javax.persistence.*;

/**
 * Created by Bipin on 11/9/2015.
 */
@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "client_id")
    private Integer Id;
}
