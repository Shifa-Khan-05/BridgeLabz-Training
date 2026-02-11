package com.junittesting.sceneriobased;

class Main{
public static void main(String args[])
{
   BankAccount b= new BankAccount(1000000);	
   b.depositAmount(1000.0);
   System.out.println(b.getBalance());
   try{
	   b.withdrawlAmount(5);
	    b.depositAmount(-1000.0);
   }
   catch(Exception e){
    System.out.println(e.getMessage());
	
   }
	   
	System.out.println(b.getBalance());   
   UnitTest test= new UnitTest();
       
}

}
