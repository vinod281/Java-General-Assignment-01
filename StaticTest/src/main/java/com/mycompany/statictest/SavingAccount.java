package com.mycompany.statictest;


public class SavingAccount 
{
  private static float annualInterestRate;
  private double savingBalance;
  
  public SavingAccount(double savingBalance)
  {
      this.savingBalance=savingBalance;
  }
  
  public double calculateMonthlyInterest()
  {
      return savingBalance+(annualInterestRate*savingBalance)/12;
  }
  
  public static void modifyInterrestRate(float annualInterrestRate)
  {
      SavingAccount.annualInterestRate=annualInterrestRate;
  }
       
}
