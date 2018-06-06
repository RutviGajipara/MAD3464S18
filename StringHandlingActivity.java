/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class StringHandlingActivity 
{
    public static void main(String[] args)
    {
        StringBuffer str4 = new StringBuffer("Hello There");
        System.out.println("String 4 : " +str4);
        
      str4.replace(0, str4.length(), "This is the activity for Java class");
      System.out.println("Updated String : " +str4);
      
     String sentence = "This is the activity for Java class";
     String[] sentencewords = sentence.split(" ");
     StringBuffer reverse = new StringBuffer();
     for(int i = sentencewords.length-1;i>=0;i--)
     {
         reverse.append(sentencewords[i]+ " ");
     }
     System.out.println(reverse.toString());
    }
    
    
}
