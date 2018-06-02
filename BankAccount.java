/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rutvi
 */
public class BankAccount extends Bank
{
    int AccNo;
    String OwnerName;
    float Balance;
    double amount;
    
  
    public BankAccount()
            {  
                super();
                AccNo = 0;
                OwnerName = "Unknown";
                amount = 0;
            }
   public BankAccount(String BankName, int BankID,int AccNo,String OwnerName, float Balance)
 {
     super(BankName,BankID);
     this.AccNo = AccNo;
     this.OwnerName = OwnerName;
     this.Balance = Balance;
 }
    @Override
    public String toString()
    {
        String BankDetails = super.toString();
        return(super.toString() + "\n Account Number : " +AccNo + "\n Owner Name : " +OwnerName+ "\n Balance : " +Balance);
        
    }
    public void deposit (float Balance)
    {
        Balance = (float) (Balance + amount);
       
    }
    public void withdraw (double balance)
    {
        Balance = (float) (Balance - amount);
    }
}
