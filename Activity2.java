/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class Activity2 {
     public static void main(String[] args)
     {
       BankAccount bac1 = new BankAccount("National Bank",01,102030,"Rutvi Patel",30000.00f);
       
     System.out.println(bac1.toString());
    OverdaftAccount withdraw1 = new OverdaftAccount();
    withdraw1.withdraw();
       
     }
    
}
