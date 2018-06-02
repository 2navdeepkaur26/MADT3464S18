/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NAVDEEP SIDHU
 */
public class nksidhuD4 {
    public static void main(String[]args){
        //TODO code application logic here 
        Employee emp1 = new Employee ("Rutvi", "TORONTO", 23 ,"E101","12 May 2017",10);
//        emp1.name = "Rutvi";
//        emp1.address = "Toronto";
//        emp1.age = 23;
        System.out.println("Name :" + emp1.name +"\nAddress :"+
                emp1.address + "\nAge :" + emp1.age);
        System.out.println(emp1.toString());
    
        TemporaryEmployee tE1 = new TemporaryEmployee("Sukhwinder", "Brampton" ,22,"T123","01 May 2018",20,"iOS Developer",80.50f);
        System.out.println(tE1.toString());
    }
}