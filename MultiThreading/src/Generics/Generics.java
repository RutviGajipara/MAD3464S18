/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics;

/**
 *
 * @author Rutvi
 * @version 1.0
 * @since 13 Jun 2018
 */


public class Generics {
    /** generic method printArray
     * 
     * printing list of elements
     * @param <E> indicates the generic type
     * @param inputArray list of elements to be printed
     * @return no return value
     */
    public static <E> void printArray(E[] inputArray)
    {
        for(E element : inputArray)
        {
            System.out.printf("%s, ",element);
        }
        System.out.println();
    }
    /**
     * 
     * @param <T> generic type
     * @param x first value
     * @param y second value
     * @param z third value
     * @return maximum of three elements
     */
    public static <T extends Comparable<T>> T maximum(T x, T y, T z)
    {
        T max = x;
        if(y.compareTo(max) > 0)
        {
            max = y;
        }
        if(z.compareTo(max) > 0)
        {
            max = z;
        }
        return max;
    }
    /**
     * 
     * @param args command line arguments
     * @return 
     */
    public static void main(String[] args)
    {
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.set(new Integer(10));
        System.out.printf("Integer Value : %d\n", integerBox.get());
        
         Box<String> stringBox = new Box<String>();
        stringBox.set(new String("Hello world"));
        System.out.printf("String Value : %s\n\n", stringBox.get());
        
        Integer[] intarr = {1,2,3,4,5};
        System.out.println("Integer array : ");
        printArray(intarr);
        
        Double[] dblarr = {1.1,2.2,3.3,4.4,5.5};
        System.out.println("Double array : ");
        printArray(dblarr);
        
        Character[] chararr = {'A','B','C','D','E'};
        System.out.println("Character array : ");
        printArray(chararr);
        
        System.out.printf("Max of %d, %d and %d is : %d\n\n",3,4,5, maximum(3,4,5));
        System.out.printf("Max of %.1f, %.1f and %.1f is : %.1f\n\n",6.6,4.4,5.5, maximum(6.6,4.4,5.5));
        System.out.printf("Max of %s, %s and %sis : %s\n\n","Pear","Apple","Orange", maximum("Pear","Apple","Orange"));
      
    }
    
}
