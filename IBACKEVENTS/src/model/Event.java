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
public class Event {
    
    private String Eid;

    private String name;
   
    private String type;
    private String stime;
    private String duration;
    private String cemail;
    private String date;

    public Event(String Eid, String name, String type, String stime, String duration, String cemail,String date) {
        this.Eid = Eid;
        this.name = name;
        this.type = type;
        this.stime = stime;
        this.duration = duration;
        this.cemail = cemail;
        this.date = date;
    }

    public Event(String name, String type, String stime, String duration, String cemail,String date) {
        this.name = name;
        this.type = type;
        this.stime = stime;
        this.duration = duration;
        this.cemail = cemail;
        this.date = date;
    }

    public String getEid() {
        return Eid;
    }

    public void setEid(String Eid) {
        this.Eid = Eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStime() {
        return stime;
    }

    public void setStime(String stime) {
        this.stime = stime;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getCemail() {
        return cemail;
    }

    public void setCemail(String cemail) {
        this.cemail = cemail;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
     
    
    
}
