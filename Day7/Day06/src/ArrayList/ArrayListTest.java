/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author macstudent
 */
public class ArrayListTest {
    public static void main(String[] args)
    {
       ArrayList<String> ProductName = new ArrayList();
       ProductName.add("Projector");
       ProductName.add("Excel");
       ProductName.add("Contigo");
       ProductName.add("Apple");
       ProductName.add(2,"Oracle");
        for(String raman : ProductName)
       {
           System.out.println(raman);
       }
        System.out.println("========");
       if(ProductName.contains("Oracle"))
       {
            ProductName.remove("Oracle");
       }
       else
       {
          System.out.println("Buy Oracle first");
       }
       
       for(String raman : ProductName)
       {
           System.out.println(raman);
       }
      Collections.sort(ProductName);
      System.out.println("========");
      for(String raman : ProductName)
       {
           System.out.println(raman);
       }
      
      ArrayList<Books> library = new ArrayList<Books>();
    Books book1 = new Books(101,"The sky is falling",9);
     Books book2 = new Books(102,"Pride and Prejudice",5);
      Books book3 = new Books(103,"The Monk",8);
      library.add(book1);
      library.add(book2);
      library.add(book3);
      for(Books bk : library)
      {
         bk.display();
      }
      System.out.println("No of books in library : " +library.size());
    System.out.println("========");
    if(library.contains(book2))
    {
        library.remove(book2);
    }
    System.out.println("No of books in library : "+ library.size());
    library.add(2,new Books(120,"Courage",6));
    for(Books bk : library)
    {
        bk.display();
    }
    System.out.println("========");
    Collections.sort(library, new booktitlecomparator());
    for(Books bk : library)
    {
        bk.display();
    }
    System.out.println("========");
    Collections.sort(library, new bookratingcomparator());
    for(Books bk : library)
    {
        bk.display();
    }
    }
}
