package com.gfadvocaciars.lawyeradm.domain;

import com.gfadvocaciars.lawyeradm.domain.enums.DeadlineStatus;
import com.gfadvocaciars.lawyeradm.domain.enums.DeadlineType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@Document
public class Deadline implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private DeadlineType type;
    private String description;
    private Integer deadline;
    private Date initialDate;
    private DeadlineStatus status;
    private Employee maker;

    public Deadline() {
    }

    public Deadline(String id, DeadlineType type, String description, Integer deadline, Date initialDate) {
        this.id = id;
        this.type = type;
        this.description = description;
        this.deadline = deadline;
        this.initialDate = initialDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DeadlineType getType() {
        return type;
    }

    public void setType(DeadlineType type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDeadline() {
        return deadline;
    }

    public void setDeadline(Integer deadline) {
        this.deadline = deadline;
    }

    public Date getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(Date initialDate) {
        this.initialDate = initialDate;
    }

    public DeadlineStatus getStatus() {
        return status;
    }

    public void setStatus(DeadlineStatus status) {
        this.status = status;
    }

    public Employee getMaker() {
        return maker;
    }

    public void setMaker(Employee maker) {
        this.maker = maker;
    }
}
