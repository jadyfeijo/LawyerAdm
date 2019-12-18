package com.gfadvocaciars.lawyeradm.domain;

import java.io.Serializable;

public class LegalPerson extends Person implements Serializable {
    private static final long serialVersionUID = 1L;

    private String cnpj;
    private String fantasyName;

    public LegalPerson() {
        super();
    }

    public LegalPerson(String name, String phone, Address address, String cnpj, String fantasyName) {
        super(name, phone, address);
        this.cnpj = cnpj;
        this.fantasyName = fantasyName;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getFantasyName() {
        return fantasyName;
    }

    public void setFantasyName(String fantasyName) {
        this.fantasyName = fantasyName;
    }
}
