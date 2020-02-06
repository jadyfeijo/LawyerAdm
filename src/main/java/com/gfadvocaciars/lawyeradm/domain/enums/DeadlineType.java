package com.gfadvocaciars.lawyeradm.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DeadlineType {
    RÉPLICA("Réplica", 15),
    PROVAS("Provas", 10),
    CONTRARRAZÕES("Contrarrazões", 15),
    RECURSO("Recurso", 10),
    APELAÇÃO("Apelação", 15),
    ;

    private  String type;
    private  Integer daysOfDeadline;
}
