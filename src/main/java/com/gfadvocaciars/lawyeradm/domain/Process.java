package com.gfadvocaciars.lawyeradm.domain;

import com.gfadvocaciars.lawyeradm.domain.enums.Area;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Document
public class Process implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private String number;
    private Vara vara;
    private Area area;
    private Person claimant;
    private Person defendant;

    @DBRef(lazy = true)
    private List<Deadline> deadlines = new ArrayList<>();

    public Process() {
    }

    public Process(String id, String number, Vara vara, Area area, Person claimant, Person defendant) {
        this.id = id;
        this.number = number;
        this.vara = vara;
        this.area = area;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }
}
