/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class permanentEmp extends Employee
{
    int workingdays;
    String designation;
    int salary;
 public permanentEmp()
         {
             super();
             this.workingdays = 0;
             this.designation = "Unknown";
             this.salary = 0;
         }
 public permanentEmp(String name, String address,int age,String eID, String joiningDate, int deptNo,int workingdays,String designation,int salary)
 {
     super(name,address,age,eID,joiningDate,deptNo);
     this.workingdays = workingdays;
     this.designation = designation;
     this.salary = salary;
 }
 @Override
 public String toString()
 {
     return(super.toString() + "\n Working Days : " + this.workingdays + "\n Designation : " + this.designation + "\n Salary : " + this.salary);
 }
}
