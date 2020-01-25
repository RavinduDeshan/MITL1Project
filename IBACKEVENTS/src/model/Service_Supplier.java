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
public class Service_Supplier {
    
    private String sid;
    private String servname;
    private String email;
    private String supplyname;
    private String type;
    private double price;
    private String info;

    public Service_Supplier(String sid, String servname, String email, String supplyname, String type, double price, String info) {
        this.sid = sid;
        this.servname = servname;
        this.email = email;
        this.supplyname = supplyname;
        this.type = type;
        this.price = price;
        this.info = info;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getServname() {
        return servname;
    }

    public void setServname(String servname) {
        this.servname = servname;
    }

    public String getSupplyEmail() {
        return email;
    }

    public void setSupplyEmail(String supplyid) {
        this.email = supplyid;
    }

    public String getSupplyname() {
        return supplyname;
    }

    public void setSupplyname(String supplyname) {
        this.supplyname = supplyname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    
    
    
    
          
}
