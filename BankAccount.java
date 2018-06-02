/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author navdeep
 */
public class BankAccount extends Bank{
    String AccountNo;
    String OwnerName;
    String BalanceAmount;
    
    BankAccount()
    {
        super();
        this.AccountNo = "AC########";
        this.BalanceAmount = "A000000";
        this.OwnerName = "Unknown";
    }
    BankAccount(String bankname,String bankID ,String AccountNo,String OwnerName,String BalanceAmount)
    {
        super(bankname,bankID);
        this.AccountNo = AccountNo;
        this.BalanceAmount = BalanceAmount;
        this.OwnerName = OwnerName ;
    }
    public String toString()
    {
        String personalDetails = super.toString();
        String data = "\n AccountNo :" + this.AccountNo + "\nOwnerName:"+this.OwnerName + "\nBalanceAmount :"+this.BalanceAmount;
        return personalDetails + data;
    }    
}   
            

