/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rutvi
 */
public class Arithmetic
{
    int num1;
    void addition()
    {
        System.out.println("Addition : "+(num1+20));
    }
    int Addition(int n1,int n2)
    {
      // System.out.println("Sum of " + n1 + " and " + n2 + " is : "+(n1+n2));
        return(n1+n2);
    }
    float addition (float n1,float n2)
    {
        return(n1+n2);
    }
    void addition (int[] n1)
    {
        int sum=0;
        for(int i=0;i<n1.length;i++)
        {
            sum += n1[i];
        }
        System.out.println("Sum : " +sum);
    }
    void Addition(int... Numbers)
    {
        int sum = 0;
        for(int no: Numbers)
        {
            sum += no;
        }
        System.out.println("sum : " +sum);
    }
}
