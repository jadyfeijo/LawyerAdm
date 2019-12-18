package com.gfadvocaciars.lawyeradm.domain;

import com.gfadvocaciars.lawyeradm.domain.enums.MaritalStatus;

import java.util.Date;

public class NaturalPerson extends Person {

    private String cpf;
    private String rg;
    private Date birthdate;
    private String occupation;
    private MaritalStatus maritalStatus;
    private String nacionalilty;

    public NaturalPerson() {
        super();
    }

    public NaturalPerson(String name, String phone, Address address, String cpf, String rg, Date birthdate, String occupation, MaritalStatus maritalStatus, String nacionalilty) {
        super(name, phone, address);
        this.cpf = cpf;
        this.rg = rg;
        this.birthdate = birthdate;
        this.occupation = occupation;
        this.maritalStatus = maritalStatus;
        this.nacionalilty = nacionalilty;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getNacionalilty() {
        return nacionalilty;
    }

    public void setNacionalilty(String nacionalilty) {
        this.nacionalilty = nacionalilty;
    }
}
