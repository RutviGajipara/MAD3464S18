/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rutvi
 */
import java.util.Scanner;
public class OverdaftAccount extends BankAccount
{

     int overdraftLimit;
     float wd;
     float total;
 
    
 public OverdaftAccount ()
{   
   super();
    overdraftLimit = 1500;
}

public void withdraw ()
{
    System.out.println("You have an overdraft limit of : ");
    System.out.println("Amount to be withdrawn : ");
    wd = Integer.parseInt(in.nextLine());
    total = Balance - wd;
    System.out.println("Total Amount : " +total);
    if(Balance+overdraftLimit >=2500)
    {
        super.withdraw(amount);
    }
    else
    {
        System.out.println("Not enough limit to withdraw..");
    }
}
    @Override
     public String toString()
     {
         return (super.toString() + "Overdraft Limit : " + overdraftLimit);
     }
     }

   


