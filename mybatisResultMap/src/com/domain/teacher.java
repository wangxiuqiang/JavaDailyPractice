package com.domain;

import java.util.List;

public class teacher {
    private String namea;
    private int ida;
    private String passworda;
    public Mybatisforeach mybatisforeach;
//    保证字段名和数据库的名称不一样,以便用resultMap进行查询
public Mybatisforeach getMybatisforeach() {
    return mybatisforeach;
}

    public void setMybatisforeach(Mybatisforeach mybatisforeach) {
        this.mybatisforeach = mybatisforeach;
    }

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


    //以下的用于collection测试

//    private List<Mybatisforeach> list;
//
//    public List<Mybatisforeach> getList() {
//        return list;
//    }
//
//    public void setList(List<Mybatisforeach> list) {
//        this.list = list;
//    }

}
