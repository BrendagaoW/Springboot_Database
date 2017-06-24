package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "t_organization")
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String organizaitonName;

    public Organization() {
    }

    public Organization(String organizaitonName) {
        this.organizaitonName = organizaitonName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOrganizaitonName() {
        return organizaitonName;
    }

    public void setOrganizaitonName(String organizaitonName) {
        this.organizaitonName = organizaitonName;
    }
}
