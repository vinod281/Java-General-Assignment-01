package com.mycompany.statictest;


public class StaticTest 
{

    public static void main(String[] args) 
    {
        SavingAccount.modifyInterrestRate(4);
        
        SavingAccount Saver1=new SavingAccount(2000);
        System.out.println("Monthly Interest Saver1's 4% : "+Saver1.calculateMonthlyInterest());
        
        SavingAccount Saver2=new SavingAccount(3000);
        System.out.println("Monthly Interest Saver2's 4% : "+Saver2.calculateMonthlyInterest());
        
        SavingAccount.modifyInterrestRate(5);
        
        System.out.println("Monthly Interest Saver1's 5% : "+Saver1.calculateMonthlyInterest());
        System.out.println("Monthly Interest Saver2's 5% : "+Saver2.calculateMonthlyInterest());
        
    }
}
