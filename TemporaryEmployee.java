/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author navdeep
 */
public class TemporaryEmployee extends Employee{
    String designation;
    float hourlyRate;
    
    public TemporaryEmployee()
    {
        super();
        this.designation ="Unknown";
        this.hourlyRate = 0.0f;
    }
    public TemporaryEmployee (String name,String address,int age,String eID,String joiningDate,int deptNo ,String designation, float hourlyRate)
    {
        super(name,address,age,eID,joiningDate,deptNo);
        this.designation = designation;
        this.hourlyRate = hourlyRate;
    }
    public String toString(){
        return(super.toString()+"\nDesignation :"+ 
                this.designation + "\nhourlyRate:"+
                this.hourlyRate);
        
    }
    
}
