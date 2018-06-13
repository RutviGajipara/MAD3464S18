/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rutvi
 */
public class MultiThreading {
    public static void main(String[] args)
    {
        Thread t1 = new Thread();
        System.out.println("Cuurent Thread : " +t1);
        
         t1.setName("Test Thread");
         t1.setPriority(10);
//         System.out.println("Thread into after modification : " +t1);
//         System.out.println("State of thread : " +t1.getState());
//         System.out.println("alive or not : " +t1.isAlive());
//         System.out.println("daemon or non-daemon : " +t1.isDaemon());
         try{
         for(int i=1;i<=3;i++)
         {
             System.out.println("Main thread : "+i);
             new FirstThread();
             new SecondThread("Second Theead");
             
             Thread.sleep(5000);
         }
         }
         catch(InterruptedException e)
         {
             e.printStackTrace();
         }
         finally{
             System.out.println("Exiting from main thread");
         }
    }
    
    
    
}
