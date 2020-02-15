package com.gfadvocaciars.lawyeradm.domain.enums;


public enum DeadlineType {
    RÉPLICA("Réplica", 15),
    PROVAS("Provas", 10),
    CONTRARRAZÕES("Contrarrazões", 15),
    RECURSO("Recurso", 10),
    APELAÇÃO("Apelação", 15),
    ;

    private  String type;
    private  Integer daysOfDeadline;

    DeadlineType(String type, int daysOfDeadline) {
        this.type = type;
        this.daysOfDeadline = daysOfDeadline;
    }

    public Integer getDaysOfDeadline() {
        return daysOfDeadline;
    }

    public void setDaysOfDeadline(Integer daysOfDeadline) {
        this.daysOfDeadline = daysOfDeadline;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
