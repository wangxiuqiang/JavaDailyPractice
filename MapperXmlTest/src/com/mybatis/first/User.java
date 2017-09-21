package com.mybatis.first;

/**
 * Created by wxq on 17-9-21.
 */
public class User {
    private int money;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "User{" +
                "money=" + money +
                '}';
    }
}
