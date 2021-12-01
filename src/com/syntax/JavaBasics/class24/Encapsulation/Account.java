package com.syntax.JavaBasics.class24.Encapsulation;

public class Account {
    private String name;
    private String userName;
    private String password;
    private double balance=1000;
//To get Getter Setter Methods, right click-->Moderate-->
// Getter Setter-->select methods we need-->ok

    Account (){

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance(String userName, String password) {
        if(userName.equals(this.userName)&& password.equals(this.userName)) {
            return balance;
        };

    public void setBalance(double balance) {
        this.balance = balance;


    }
}
