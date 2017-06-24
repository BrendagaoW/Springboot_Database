package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "t_role")
public class Role {

    @Id
    @GeneratedValue
    private long id;
    @Column
    private String roleName;

    public Role() {
    }

    public Role(String roleName) {
        this.roleName = roleName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
