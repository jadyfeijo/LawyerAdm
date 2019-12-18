package com.gfadvocaciars.lawyeradm.domain.dto;

import com.gfadvocaciars.lawyeradm.domain.Process;
import com.gfadvocaciars.lawyeradm.domain.enums.Area;

public class ProcessDTO {

    private String id;
    private String number;
    private Area area;
    private String claimant;
    private String defedant;


    public ProcessDTO() {
    }

    public ProcessDTO(Process process){
        id = process.getId();
        number = process.getNumber();
        claimant = process.getClaimant().getName();
        defedant = process.getDefendant().getName();
        area = process.getArea();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getClaimant() {
        return claimant;
    }

    public void setClaimant(String claimant) {
        this.claimant = claimant;
    }

    public String getDefedant() {
        return defedant;
    }

    public void setDefedant(String defedant) {
        this.defedant = defedant;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }
}
