/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class Activity {
    public static void main(String[] args)
    {
        for(int r=1;r<=5;r++)
           {
               for(int c=1;c<=5;c++)
               {
                   
                       if(r == 1 || r== 5 || c == 1 || c == 5)
                       {
                           System.out.print("*");
                       }
                       else
                       {
                           System.out.print(" ");
                       }
                      
                   }
                   
                       System.out.println();
                   
               }
        for(int r=1;r<=9;r++)
        {
           for (int c=1;c<=9;c++)
           {    
               
               System.out.print(c+" ");
           }
           System.out.println();
        }
    }
    
    
}
