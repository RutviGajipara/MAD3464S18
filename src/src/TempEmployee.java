/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class TempEmployee extends Employee
{
    String designation;
    float hourlyrate;
    
    public TempEmployee()
    {   super();
        this.designation = "Unknown";
        this.hourlyrate = 0.0f;
    }
    public TempEmployee(String name,String address,int age,String eID, String joiningDate, int deptNo, String designation,float hourlyrate)
    {
    super(name,address,age,eID,joiningDate,deptNo);
    this.designation = designation;
    this.hourlyrate = hourlyrate;
}
    @Override
    public String toString()
    {
        return(super.toString() + "\n Designation : " + this.designation + "\n Hourly Rate : " + this.hourlyrate);
    }
}

