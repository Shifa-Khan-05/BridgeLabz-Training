package com.junittesting.sceneriobased;

class BankAccount
{
  double balance ;
  
  BankAccount(double balance)
  {
  this.balance=balance;
  }
  
  public void depositAmount(double amount)
  {
   
	  if(amount<=0)
	  {
	   throw new IllegalArgumentException("Amount can not be negative and zero");
	  }
	  balance+=amount;
	 
  }
  
  public void withdrawlAmount(double amount)
  {
   
	  if(amount>balance)
	  {
	   throw new IllegalArgumentException("Amount should be greator than balance");
	  }
	  balance-=amount;
	 
  }
  
  public double getBalance()
  {
	  return this.balance;
  }
  

}
