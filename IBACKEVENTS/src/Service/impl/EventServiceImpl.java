/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.impl;

import Service.EventService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Event;
import util.dbConnection;

/**
 *
 * @author P D R Deshan
 */
public class EventServiceImpl implements EventService{

     Connection con = dbConnection.getConnection();
     
    @Override
    public boolean addEvent(Event evnt) throws Exception{
         String sql = "INSERT INTO Event(Name,Type,S_time,Duration,C_Email,date) VALUES (?,?,?,?,?,?)";

        PreparedStatement stm1 = con.prepareStatement(sql);
        stm1.setObject(1, evnt.getName());
        stm1.setObject(2, evnt.getType());
        stm1.setObject(3, evnt.getStime());
        stm1.setObject(4, evnt.getDuration());
        stm1.setObject(5, evnt.getCemail());
        stm1.setObject(6, evnt.getDate());
       

		

	return stm1.executeUpdate()>0;
    }

    @Override
    public boolean updateEvent(Event evnt) throws SQLException {
        
        String sql="Update Event set name='"+evnt.getName()+"' ,type='"+evnt.getType()+"' , S_Time='"+evnt.getStime()+"', duration='"+evnt.getDuration()+"' , date='"+evnt.getDate()+"'  where eid='"+evnt.getEid()+"'" ;
		
		
		Statement stm= con.createStatement();
		
		return stm.executeUpdate(sql)>0;
    }

    @Override
    public boolean deleteEvent(String eid) throws SQLException {
        
         String sql="Delete From Event where Eid='"+eid+"'";
		Statement stm= con.createStatement();
		
		return stm.executeUpdate(sql)>0;
        
    }

    @Override
    public Event getCustEvent(String email) {
         Event evnt = null;
        
       
        try {
            String sql="SELECT * from Event where eid ='"+email+"'";
            Statement stm= con.createStatement();
            ResultSet rlt = stm.executeQuery(sql);
            
            while (rlt.next()) {
                
                String eid = rlt.getString("eid");
                String name = rlt.getString("name");
                String type = rlt.getString("type");
                String stime = rlt.getString("s_time");
                String duration = rlt.getString("duration");
                String date = rlt.getString("date");

                evnt = new Event(eid, name, type, stime, duration, email, date);
                        

                

            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CustomerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
	
        return evnt;
    }
    



    @Override
    public int getTotalEventCount() throws SQLException {
        
        ResultSet rc1 = null;
    	int rowCount= 0;
    	Statement stat = con.createStatement();
    	String sql="SELECT COUNT(*) AS rowcount1 FROM Event ";
    	rc1 = stat.executeQuery(sql);

    	if (rc1.next()) {
    		
    	        rowCount = rc1.getInt("rowcount1");
    	        
    	}
    	
    	return rowCount;
    
    
        
        
    }

    @Override
    public ArrayList<Event> getAllEventList() throws SQLException {
          Event evnt = null;
        
          ArrayList<Event> list = new ArrayList<>();
          
        
            String sql="SELECT * from Event ";
            Statement stm= con.createStatement();
            ResultSet rlt = stm.executeQuery(sql);
            
            while (rlt.next()) {
                
                String eid = rlt.getString("eid");
                String name = rlt.getString("name");
                String type = rlt.getString("type");
                String stime = rlt.getString("s_time");
                String duration = rlt.getString("duration");
                String date = rlt.getString("date");
                String email = rlt.getString("C_email");

                evnt = new Event(eid, name, type, stime, duration, email, date);
                        
                list.add(evnt);
                

            }
            
       
	
        return list;
    }

  
    
}
