/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rutvi
 */
public class Day04 
{
    public static void main(String[] args)
    {
        Employee emp1 = new Employee("Rutvi","Toronto",23,"E1O1","12 May 2017",10);
//       emp1.name = "Rutvi";
//       emp1.address = "Toronto";
//       emp1.age = 23;
       //System.out.println("Name : " +emp1.name + "\n Address : " + emp1.address + "\n Age : " +emp1.age);
       System.out.println(emp1.toString());
      TempEmployee tmp1 = new TempEmployee("Sukhi","Bampton",24,"T123","01 May 2017",20,"IOS Developer",80.50f);
      System.out.println(tmp1.toString());
      permanentEmp Pemp1 = new permanentEmp("Aman","North York",24,"P1E2","10 Feb 2016",34,26,"Android Developer", 40000);
      System.out.println(Pemp1.toString());
    }
}
