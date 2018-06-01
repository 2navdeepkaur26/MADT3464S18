/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class activity {
    public static void main(String args[])
    {
        System.out.println("For 5 Lines");
        for (int i=1; i<=5; i++)
        {
            for(int j=1; j<=5; j++)
        {
         if(i==1 || j ==1 || i==5 || j==5)   
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
    }
    }

