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
public class Customer extends User{
    
    private String Company;
    private String Designation;

    public Customer(String Username, String Password, String Address, String Mobile, String Email, String Fname, String Mname, String Lname,String Company,String Designation) {
        super(Username, Password, Address, Mobile, Email, Fname, Mname, Lname);
        this.Company=Company;
        this.Designation=Designation;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String Company) {
        this.Company = Company;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

  

   
    
    
    
    
}
