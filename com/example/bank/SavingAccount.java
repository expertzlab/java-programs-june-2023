package com.example.bank;

public class SavingAccount extends Account {

    public SavingAccount(float cb,String n){
        super(cb, n);
    }

    public boolean transer(Account account, float amount){
        boolean result = false;
        if(checkRuleForTranfer(amount)){
            result = super.transer(account, amount);
        } else {
            System.out.printf("This is a problem, minimum balance can"+
            " not be go below {%.2f}\n",minimumBalance);
        }
        return result;
    }

    private boolean checkRuleForTranfer(float amount){
        if(currentBalance - amount >= minimumBalance){
            return true;
        } else {
            return false;
        }
    }
    
}
