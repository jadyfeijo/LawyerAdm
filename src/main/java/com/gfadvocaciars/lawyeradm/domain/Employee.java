package com.gfadvocaciars.lawyeradm.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gfadvocaciars.lawyeradm.domain.enums.MaritalStatus;
import com.gfadvocaciars.lawyeradm.domain.enums.Permission;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Document
public class Employee extends NaturalPerson implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private String email;
    private List<Permission> permission;

    private String password;

    public Employee() {
        super();
    }

    public Employee(String name, String phone, Address address, String cpf, String rg, Date birthdate, String occupation, MaritalStatus maritalStatus, String nacionalilty, String id, String email, List<Permission> permission, String password) {
        super(name, phone, address, cpf, rg, birthdate, occupation, maritalStatus, nacionalilty);
        this.id = id;
        this.email = email;
        this.permission = permission;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Permission> getPermission() {
        return permission;
    }

    public void setPermission(List<Permission> permission) {
        this.permission = permission;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
