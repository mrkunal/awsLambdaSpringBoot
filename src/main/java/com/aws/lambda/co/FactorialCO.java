package com.aws.lambda.co;

public class FactorialCO {
    Long num;
    String username;

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "FactorialCO{" +
                "num=" + num +
                ", username='" + username + '\'' +
                '}';
    }
}
