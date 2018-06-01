
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rutvi
 */
public class Person {

    String name;
    String address;
    int age;
    Scanner in = new Scanner(System.in);
    //Default constructor
    Person()
    {
        name = "Unknown";
        address = "Unknown";
        age = 1;
    }
    //Parameterised Constructor
    Person(String name,String address,int age)
    {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    Person(Person anotherPerson)
    {
        this.name = anotherPerson.name;
        this.address = anotherPerson.address;
        this.age = anotherPerson.age;
    }
    void setname()
    {
        
        System.out.println("Enter Name : ");
        name = in.nextLine();
    }
    String getName()
    {
        return name;
    }
    void setaddress()
    {
        System.out.println("Enter Address : ");
        address = in.nextLine();
    }
    String getaddress()
    {
        return address;
    }
    void setage()
    {
        System.out.println("Enter Age : ");
        age = in.nextInt();
        
    }
    int getage()
    {
        return age;
    }
    void setData()
    {
        setname();
        setaddress();
        setage();
    }
    @Override
    public String toString()
    {
        String data = "Name : " + name + "\n Address : " + address + "\n Age : " +age;
        return data;
    }
}
