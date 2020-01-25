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
public class Event_Service {
    
   
    private String ServiceID;
    private String Sname;
    private String info;
    private String SupplierName;
    private String qty;
    private String UnitPrice;
    private String SupplierEmail;

    public Event_Service(String ServiceID, String Sname, String info, String SupplierName, String qty, String UnitPrice, String SupplierEmail) {
        this.ServiceID = ServiceID;
        this.Sname = Sname;
        this.info = info;
        this.SupplierName = SupplierName;
        this.qty = qty;
        this.UnitPrice = UnitPrice;
        this.SupplierEmail = SupplierEmail;
    }

    public String getServiceID() {
        return ServiceID;
    }

    public void setServiceID(String ServiceID) {
        this.ServiceID = ServiceID;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String Sname) {
        this.Sname = Sname;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getSupplierName() {
        return SupplierName;
    }

    public void setSupplierName(String SupplierName) {
        this.SupplierName = SupplierName;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(String UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    public String getSupplierEmail() {
        return SupplierEmail;
    }

    public void setSupplierEmail(String SupplierEmail) {
        this.SupplierEmail = SupplierEmail;
    }
    

   
}
