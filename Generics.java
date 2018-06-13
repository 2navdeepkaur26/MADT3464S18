/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics;

/**
 *Demonstrating the concept of Generics
 * @author Navdeep Sidhu
 * @version 1.0
 * @since 13 June 2018
 */
public class Generics {
    
    // generic method printArray
    /**
     * Printing list of elements
     *
     * @param <E>indicates the generic type
     * @param inputArray  List of elements to be printed
     * 
     */
     public static <E> void printArray(E[] inputArray)
     {
    //Display array elements
    for(E element : inputArray)
    {
            System.out.printf("%s," , element);
}
    System.out.println();
}
     //determines the largest of three Comparable objects
     /**
      * 
      * @param <T>Generic type
      * @param x first value
      * @param y second value
      * @param z third value
      * @return Returns maximum of three elements
      */
     public static<T extends Comparable<T>>T maximum(T x, T y ,T z){
         T max = x; // assume x is initially the largest
         
         if (y.compareTo(max)>0){
             max = y; // y is the largest so far
         }
         if(z.compareTo(max)>0){
             max = z; //z is the largest now
         }
         return max; //returns the largest object
         
         }
     /**
      * 
      * @param args Command the arguments
      * @return no value
      */
    public static void main (String[] args)
    {
        //test generic class Box
        /**
         * Repersents the box with generic value type
         * @author Navdeep Sidhu
         * @version 1.0
         * @since 13 June 2018
         */
        Box<Integer>integerBox = new Box<Integer>();
        integerBox.set(new Integer(10));
        System.out.printf("Integer Value :%d\n", integerBox.get());
        
        Box<String>StringBox = new Box<String>();
         StringBox.set(new String ("Hello World"));
         System.out.printf("String value :%s\n\n",StringBox.get());
        
        
    }          
    Integer[] intArray = { 1, 2 ,3 ,4, 5};
    System.out.println("Array IntegerArray Contains :");
    printArray(intArray);
    
    Double[] doubleArray = {1.1,2.2,3.3,4.4};
    System.out.println("\nArray doubleArray contains :");
    printArray(doubleArray);
    
    Character[] charArray = {'H','E','L','L','O'};
    System.out.println("\NArray characterArray contains ;");
    printArray(charArray);
}   
//test generic method maximum
System.out.printf ("Max of %d, %d and %d is %d \n\n",
3,4,5 maximum(3,4,5));

System.out.printf("Max of % if ,%if and %if is %\n\n",
6.6,8.8,7.7,maximum(6.6,8.8,7.7));

System.out.printf("Max of %s,%s and %s is %s\n","pear",
"apple","orange", maximum(:"pear","apple","orange"));



