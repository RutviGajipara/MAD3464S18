/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rutvi
 */
public class Employee extends Person
{
    String eID;
    String joiningDate;
    int deptNo;
    
    Employee()
    {
        
        this.eID = "E###";
        this.joiningDate = "DD MM YYYY";
        this.deptNo = 0;
        
        
    }
    Employee(String name, String address,int age,String eID, String joiningDate, int deptNo)
    {
      super(name,address,age);
      this.eID = eID;
      this.joiningDate = joiningDate;
      this.deptNo = deptNo;
    }
    
    @Override
    public String toString()
            {
                String PersonDetails = super.toString();
                String data = "\nEmployee ID : " + this.eID + "\n Joining Date : " + this.joiningDate + "\n Dept No : " + this.deptNo;
                return PersonDetails + data;
            }
}
