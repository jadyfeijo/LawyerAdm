package com.gfadvocaciars.lawyeradm.domain;

public class Vara {

    private int number;
    private String comarca;
    private String forum;

    public Vara() {
    }

    public Vara(int number, String comarca, String forum) {
        this.number = number;
        this.comarca = comarca;
        this.forum = forum;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getComarca() {
        return comarca;
    }

    public void setComarca(String comarca) {
        this.comarca = comarca;
    }

    public String getForum() {
        return forum;
    }

    public void setForum(String forum) {
        this.forum = forum;
    }
}

