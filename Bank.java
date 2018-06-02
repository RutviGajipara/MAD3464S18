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
public class Bank 
{
    
    String BankName;
    int BankID;
    Scanner in = new Scanner(System.in);
    
    public Bank()
    {
        BankName = "Unknown";
        BankID = 0;
    }
    Bank(String BankName, int BankID)
    {
        this.BankName = BankName;
        this.BankID = BankID;
    }

    void setname()
    {
        System.out.println("Enter name : ");
        this.BankName = in.nextLine();
    }
    String getname()
    {
        return this.BankName;
    }
    void setID()
    {
        System.out.println("Enter ID : ");
        this.BankID = in.nextInt();
    }
    int getID()
    {
        return this.BankID;
    }
    void setdata()
    {
        setname();
        setID();
        
    }
    @Override
    public String toString()
    {
        String BankDetails = "Bank Name : " + BankName + "\n Bank Id : " +BankID;
        return BankDetails;
    }
}
