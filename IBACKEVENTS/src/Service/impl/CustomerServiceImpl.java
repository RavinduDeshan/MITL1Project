/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.impl;

import Service.CustomerService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Customer;
import model.Event;
import model.User;
import util.dbConnection;

/**
 *
 * @author P D R Deshan
 */
public class CustomerServiceImpl implements CustomerService{
    
    Connection con = dbConnection.getConnection();
    
     @Override
    public boolean addCustomer(Customer cus) throws SQLException{
       
        
        String sql = "INSERT INTO Customer VALUES (?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement stm1 = con.prepareStatement(sql);
        
        stm1.setObject(1, cus.getEmail());
        stm1.setObject(2, cus.getFname());
        stm1.setObject(3, cus.getMname());
        stm1.setObject(4, cus.getLname());
        stm1.setObject(5, cus.getAddress());
        stm1.setObject(6, cus.getMobile());
        stm1.setObject(7, cus.getCompany());
        stm1.setObject(8, cus.getDesignation());
        stm1.setObject(9, cus.getUsername());
        stm1.setObject(10, cus.getPassword());

		

	return stm1.executeUpdate()>0;

        
        
    }


    @Override
    public boolean validateCustomer(String email, String password) throws Exception {
        
        
        return false;
        
            
    }

   
    @Override
    public boolean updateCustomer(Customer cus) throws SQLException{
        
        
            
            
            String sql="Update Customer set fname='"+cus.getFname()+"' ,mname='"+cus.getMname()+"' , lname='"+cus.getLname()+"', username='"+cus.getUsername()+"', password='"+cus.getPassword()+"', company='"+cus.getCompany()+"', designation='"+cus.getDesignation()+"', address='"+cus.getAddress()+"' , mobile='"+cus.getMobile()+"'  where email='"+cus.getEmail()+"'" ;
		
		
		Statement stm= con.createStatement();
		
		return stm.executeUpdate(sql)>0;
            
            
        
    }

    @Override
    public boolean deleteCustomer(String email) throws SQLException{
        
        String sql="Delete From Customer where email='"+email+"'";
		Statement stm= con.createStatement();
		
		return stm.executeUpdate(sql)>0;
       
    }

    @Override
    public Customer getCustomer(String email) throws Exception{
        
        Customer cus = null;
        try {
            String sql="SELECT * from Customer where Email ='"+email+"'";
            Statement stm= con.createStatement();
            ResultSet rlt = stm.executeQuery(sql);
            
            while (rlt.next()) {
            String username = rlt.getString("username");
            String password = rlt.getString("password");
            String address = rlt.getString("address");
            String mobile = rlt.getString("mobile");
            String fname = rlt.getString("fname");
            String mname = rlt.getString("mname");
            String lname = rlt.getString("lname");
            String company = rlt.getString("company");
            String designation = rlt.getString("designation");
            
            
            
            
            
            
            cus = new Customer(username, password, address, mobile, email, fname, mname, lname, company, designation);
            
            }
            
        } catch (Exception ex) {
            Logger.getLogger(CustomerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
	
        return cus;
    }

    @Override
    public ArrayList<Customer> getCustomerList() throws SQLException{
        
        Customer cus = null;
        
        ArrayList<Customer> list = new ArrayList<>();
        try {
            String sql="SELECT * from Customer";
            Statement stm= con.createStatement();
            ResultSet rlt = stm.executeQuery(sql);
            
            while (rlt.next()) {
                String email = rlt.getString("email");
                String username = rlt.getString("username");
                String password = rlt.getString("password");
                String address = rlt.getString("address");
                String mobile = rlt.getString("mobile");
                String fname = rlt.getString("fname");
                String mname = rlt.getString("mname");
                String lname = rlt.getString("lname");
                String company = rlt.getString("company");
                String designation = rlt.getString("designation");

                cus = new Customer(username, password, address, mobile, email, fname, mname, lname, company, designation);

                list.add(cus);

            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CustomerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
	
        return list;
        
    }

    @Override
    public ArrayList<Customer> SearchCustomerDetails(String scontent) throws SQLException {
        
        ArrayList<Customer> list = new ArrayList<>();
        Customer cus = null;
        
        try {
            String sql="select * from Customer where  email='" +scontent+"' and username like '%"+scontent+"%' or address like '%"+scontent+"%' or mobile like '%"+scontent+"%' or fname like '%"+scontent+"%' or mname like '%"+scontent+"%' or lname like '%"+scontent+"%'or designation like '%"+scontent+"%' or company like '%"+scontent+"%'" ;
            
            Statement stm= con.createStatement();
            ResultSet rlt = stm.executeQuery(sql);
            
            while (rlt.next()) {
                String email = rlt.getString("email");
                String username = rlt.getString("username");
                String password = rlt.getString("password");
                String address = rlt.getString("address");
                String mobile = rlt.getString("mobile");
                String fname = rlt.getString("fname");
                String mname = rlt.getString("mname");
                String lname = rlt.getString("lname");
                String company = rlt.getString("company");
                String designation = rlt.getString("designation");

                cus = new Customer(username, password, address, mobile, email, fname, mname, lname, company, designation);

                list.add(cus);

            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        return list;
    }

    @Override
    public boolean validatePassword(String pass, String cpass) {
        
        if(pass.equals(cpass)){
            
            if(pass.length()>=8){
                return true;
                
            }
            else
                return false;
        }
        else
            return false;
        
        
        
    }

    @Override
    public int getEventCountCustomer(String email) throws SQLException {
        
        ResultSet rc1 = null;
    	int rowCount= 0;
    	Statement stat = con.createStatement();
    	String sql="SELECT COUNT(*) AS rowcount1 FROM Event where c_email ='"+email+"'";
    	rc1 = stat.executeQuery(sql);

    	if (rc1.next()) {
    		
    	        rowCount = rc1.getInt("rowcount1");
    	        
    	}
    	
    	return rowCount;
    
    }

    @Override
    public ArrayList<Event> SearchCustomerEvents(String cemail,String scontent) throws SQLException {
        Event evnt = null;
        
        ArrayList<Event> list = new ArrayList<>();
        try {
            String sql="SELECT * from Event where C_email ='"+cemail+"' and (eid like '%"+scontent+"%' or name like '%"+scontent+"%' or type like '%"+scontent+"%' or s_time like '%"+scontent+"%' or duration like '%"+scontent+"%' or date like '%"+scontent+"%' )";
            Statement stm= con.createStatement();
            ResultSet rlt = stm.executeQuery(sql);
            
            while (rlt.next()) {
                
                String eid = rlt.getString("eid");
                String name = rlt.getString("name");
                String type = rlt.getString("type");
                String stime = rlt.getString("s_time");
                String duration = rlt.getString("duration");
                String date = rlt.getString("date");

                evnt = new Event(eid, name, type, stime, duration, cemail, date);
                        

                list.add(evnt);

            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CustomerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
	
        return list;
    }

    @Override
    public ArrayList<Event> getCustomerEvents(String cemail) throws SQLException {
        
        Event evnt = null;
        
        ArrayList<Event> list = new ArrayList<>();
        try {
            String sql="SELECT * from Event where C_email ='"+cemail+"'";
            Statement stm= con.createStatement();
            ResultSet rlt = stm.executeQuery(sql);
            
            while (rlt.next()) {
                
                String eid = rlt.getString("eid");
                String name = rlt.getString("name");
                String type = rlt.getString("type");
                String stime = rlt.getString("s_time");
                String duration = rlt.getString("duration");
                String date = rlt.getString("date");

                evnt = new Event(eid, name, type, stime, duration, cemail, date);
                        

                list.add(evnt);

            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CustomerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
	
        return list;
    }

    @Override
    public int getTotalCus() throws SQLException {
        ResultSet rc1 = null;
    	int rowCount= 0;
    	Statement stat = con.createStatement();
    	String sql="SELECT COUNT(*) AS rowcount1 FROM Customer";
    	rc1 = stat.executeQuery(sql);

    	if (rc1.next()) {
    		
    	        rowCount = rc1.getInt("rowcount1");
    	        
    	}
    	
    	return rowCount;
    }
    
}
