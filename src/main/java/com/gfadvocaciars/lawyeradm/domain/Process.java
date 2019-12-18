package com.gfadvocaciars.lawyeradm.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Process implements Serializable {
    private static final long serialVersionUID = 1L;

    private String number;
    private Vara vara;
    private Person claimant;
    private Person defendant;
    private List<Deadline> deadlines = new ArrayList<>();

    public Process() {
    }

    public Process(String number, Vara vara, Person claimant, Person defendant) {
        this.number = number;
        this.vara = vara;
        this.claimant = claimant;
        this.defendant = defendant;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Vara getVara() {
        return vara;
    }

    public void setVara(Vara vara) {
        this.vara = vara;
    }

    public Person getClaimant() {
        return claimant;
    }

    public void setClaimant(Person claimant) {
        this.claimant = claimant;
    }

    public Person getDefendant() {
        return defendant;
    }

    public void setDefendant(Person defendant) {
        this.defendant = defendant;
    }

    public List<Deadline> getDeadlines() {
        return deadlines;
    }

    public void setDeadlines(List<Deadline> deadlines) {
        this.deadlines = deadlines;
    }
}
