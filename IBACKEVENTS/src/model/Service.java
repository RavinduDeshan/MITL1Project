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
public class Service {
    
    private String Sid;
    private String name;
    private String desc;
 

    public Service(String Sid, String name, String desc) {
        this.Sid = Sid;
        this.name = name;
        this.desc = desc;
   
    }
      public Service(String name, String desc) {
        
        this.name = name;
        this.desc = desc;
   
    }

    

    public String getSid() {
        return Sid;
    }

    public void setSid(String Sid) {
        this.Sid = Sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

   

   
    
}
