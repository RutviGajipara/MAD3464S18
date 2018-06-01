/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rutvi
 */
public class personTest {
    public static void main(String[] args)
    {
        Person sumanth = new Person();
        sumanth.name = "Sumanth";
        sumanth.address = "Toroto";
        sumanth.age = 20;
        System.out.println("Name : " +sumanth.name + "\nAddress : " + sumanth.address + "\nAge : " + sumanth.age);
              
//       Person foram = new Person();
//      foram.setname();
//       String nm = foram.getName();
//       foram.setaddress();
//       String add = foram.getaddress();
//       foram.setage();
//       int age = foram.getage();
//       System.out.println("Name : " + nm+ "\nAddress : " +add+ "\nAge : " +age);
//       
//       Person Anu = new Person();
//       Anu.setData();
//       System.out.println(Anu.toString());
       Person Aman = new Person();
       System.out.println(Aman.toString());
       
       Person rimpal = new Person("Rimpal","Bampton",20);
       System.out.println(rimpal.toString());
       Person rimpal2 = new Person(rimpal);
       System.out.println(rimpal2.toString());
    }
    
    
}
