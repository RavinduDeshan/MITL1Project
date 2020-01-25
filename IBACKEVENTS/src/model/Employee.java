/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author P D R Deshan
 */
public class Employee extends User{
    private String Type;

    public Employee(String Username, String Password, String Address, String Mobile, String Email, String Fname, String Mname, String Lname,String Type) {
        super(Username, Password, Address, Mobile, Email, Fname, Mname, Lname);
        this.Type=Type;
        
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }
    
    
    
    
    
}
