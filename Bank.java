
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author navdeep
 */
public class Bank {
    
        String bankname;
        String bankID;
        
  //default constructor     
Bank()
{
    this.bankname ="Unknown";
    this.bankID ="I#####";
}

 //parametrized constructor
Bank(String bankname,String bankID)
{
    this.bankname = bankname;
    this.bankID = bankID;
}
void setbankname()
{
    System.out.println("bankname :"+ bankname);
}
String getbankname()
{ 
    return bankname;
}
void  setbankID()
{
    System.out.println("bankID :" + bankID);
}
String getbankID()
{
    return bankID ;
}
public String toString (){
    String data = "bankname :" + "\n bankID:" + bankID;
          return data;
}
}


       