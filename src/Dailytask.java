/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rutvi
 */
public class Dailytask {
    public static void main(String[] args)
    {
        Arithmetic operation1 = new Arithmetic();
       operation1.num1 = 20;
       System.out.println("num1 : " + operation1.num1);
       operation1.addition();
       int Sum = operation1.Addition(23, 45);
       System.out.println("Sum : " +Sum);
       
       float sum = operation1.addition(20.67f, 112.88f);
       System.out.println("Sum : "+ sum);
       
       int[]numbers = {10,20,30,40};
       operation1.addition(numbers);
       
       operation1.Addition(1,2,3);
       operation1.Addition(1,2,4,6,5,889,67);
    }
    
}
