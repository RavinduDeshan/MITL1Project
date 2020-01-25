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
public class Supplier extends User{
    
    private String Company;
    private String Website;
    private String Type;

    public Supplier(String Company, String Website, String Type, String Username, String Password, String Address, String Mobile, String Email, String Fname, String Mname, String Lname) {
        super(Username, Password, Address, Mobile, Email, Fname, Mname, Lname);
        this.Company = Company;
        this.Website = Website;
        this.Type = Type;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String Company) {
        this.Company = Company;
    }

    public String getWebsite() {
        return Website;
    }

    public void setWebsite(String Website) {
        this.Website = Website;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

   
}
