package com.domain;

public class teacher {
    private String namea;
    private int ida;
    private String passworda;
//    保证字段名和数据库的名称不一样,以便用resultMap进行查询

    public String getNamea() {
        return namea;
    }

    public void setNamea(String namea) {
        this.namea = namea;
    }

    public int getIda() {
        return ida;
    }

    public void setIda(int ida) {
        this.ida = ida;
    }

    public String getPassworda() {
        return passworda;
    }

    public void setPassworda(String passworda) {
        this.passworda = passworda;
    }
}
