package com.gfadvocaciars.lawyeradm.domain.enums;

public enum Permission {

    SUPER(1, "ROLE_SUPER"),
    ADMIN(2, "ROLE_ADMIN");

    private int cod;
    private String permission;

    Permission(int cod, String permission) {
        this.cod = cod;
        this.permission = permission;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}
