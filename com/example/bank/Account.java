package com.example.bank;

public class Account {
    
    float currentBalance;
    static final float minimumBalance =500;
    String name;

    public Account(float cb, String name){
        this.currentBalance = cb;
        this.name = name;
    }

    public boolean transer(Account account, float amount){
            withdraw(amount);
            account.deposit(amount);
            return true;
    }

    public void deposit(float amount){
        currentBalance += amount;
    }

    public boolean withdraw(float amount){
        currentBalance -= amount;
        return true;
    }

    public float getCurrentBalance(){
        return currentBalance;
    }
}
