package com.revature.project0;

import java.util.Objects;
public class User {
    private String id;
    private String userName;
    private int paycheck;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPaycheck() {
        return paycheck;
    }

    public void setPaycheck(int paycheck) {
        this.paycheck = paycheck;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(userName, user.userName) && Objects.equals(paycheck, user.paycheck);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, paycheck);
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", paycheck='" + paycheck + '\'' +
                '}';
    }

}