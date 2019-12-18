package com.gfadvocaciars.lawyeradm.domain;

import com.gfadvocaciars.lawyeradm.domain.enums.MaritalStatus;
import com.gfadvocaciars.lawyeradm.domain.enums.Permission;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@Document
public class Employee extends NaturalPerson implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private Permission permission;

    public Employee() {
        super();
    }

    public Employee(String name, String phone, Address address, String cpf, String rg, Date birthdate, String occupation, MaritalStatus maritalStatus, String nacionalilty, String id, Permission permission) {
        super(name, phone, address, cpf, rg, birthdate, occupation, maritalStatus, nacionalilty);
        this.id = id;
        this.permission = permission;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }
}
