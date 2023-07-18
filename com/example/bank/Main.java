package com.example.bank;

public class Main {

    public static void main(String[] args) {
        Account john = new SavingAccount(1000.00f, "john");
        Account jill = new SavingAccount(1000.00f, "jill");
        System.out.println("Before txn: John cb:"+ john.getCurrentBalance() + 
          "Jill cb:"+jill.getCurrentBalance() );
        john.transer(jill, 600);
        System.out.println("After txn: John cb:"+ john.getCurrentBalance() + 
          "Jill cb:"+jill.getCurrentBalance() );
    }
    
}
