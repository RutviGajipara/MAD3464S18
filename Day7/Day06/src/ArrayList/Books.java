package ArrayList;

import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class Books
{
    int bookID;
    String BookName;
    int bookrating;
    
    Books()
    {
       this.bookID = 0;
       this.BookName = "Unknown";
       this.bookrating = 0;
        
    }
    Books(int bookID,String BookName,int bookrating)
    {
         this.bookID = bookID;
        this.BookName = BookName;
        this.bookrating = bookrating;
    }
    void setID(int ID)
    {
        System.out.println("Enter the ID of the book : ");
        this.bookID = ID;
    }
    int getID()
    {
        return this.bookID;
    }
    void setName(String Name)
    {
        System.out.println("Enter the name of the book : ");
        this.BookName = Name;
    }
    String getName()
    {
        return this.BookName;
    }
    void setRating(int rating)
    {
        System.out.println("Enter the ratings of the book : ");
        this.bookrating = rating;
    }
    int getRating()
    {
        return this.bookrating;
    }
    void display()
    {
        System.out.println("BookId : " + this.bookID + "\nBook Name : " + this.BookName + "\nBook Rating : " + this.bookrating);
    }
    
}
class booktitlecomparator implements Comparator<Books>
{
    @Override
    public int compare(Books o1,Books o2)
    {
       return o1.BookName.compareToIgnoreCase(o2.BookName);
    }
}

class bookratingcomparator implements Comparator<Books>
{
    @Override
        public int compare(Books r1,Books r2)
        {
           if(r1.bookrating == r2.bookrating)
           {
               return 0;
           }
           else if(r1.bookrating < r2.bookrating)
           {
               return 1;
           }
           else
           {
              return -1;
           }
        }
    }
