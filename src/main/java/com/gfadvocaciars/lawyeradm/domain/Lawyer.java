package com.gfadvocaciars.lawyeradm.domain;

import com.gfadvocaciars.lawyeradm.domain.enums.MaritalStatus;
import com.gfadvocaciars.lawyeradm.domain.enums.Permission;
import com.gfadvocaciars.lawyeradm.domain.enums.Area;

import java.io.Serializable;
import java.util.Date;

public class Lawyer extends Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    private String oab;
    private Area area;

    public Lawyer() {
        super();
    }

    public Lawyer(String name, String phone, Address address, String cpf, String rg, Date birthdate, String occupation, MaritalStatus maritalStatus, String nacionalilty, String id, Permission permission, String oab, Area area) {
        super(name, phone, address, cpf, rg, birthdate, occupation, maritalStatus, nacionalilty, id, permission);
        this.oab = oab;
        this.area = area;
    }

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }
}
