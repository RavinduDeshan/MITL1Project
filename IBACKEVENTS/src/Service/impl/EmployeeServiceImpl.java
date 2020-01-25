/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.impl;

import Service.EmployeeService;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Customer;
import model.Employee;
import util.dbConnection;

/**
 *
 * @author P D R Deshan
 */
public class EmployeeServiceImpl implements EmployeeService{

    Connection con = dbConnection.getConnection();
    
    @Override
    public boolean validateEmployee(String email, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addEmployee(Employee emp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateEmployee(Employee emp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteEmployee(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Employee getEmployee(String eemail) {
         Employee cus = null;
        try {
            String sql="SELECT * from Employee where Email ='"+eemail+"'";
            Statement stm= con.createStatement();
            ResultSet rlt = stm.executeQuery(sql);
            
            while (rlt.next()) {
            String email = rlt.getString("email");
            String type = rlt.getString("type");
            String fname = rlt.getString("fname");
            String lname = rlt.getString("lname");
            String mname = rlt.getString("mname");
            String username = rlt.getString("username");
            String password = rlt.getString("password");
            String address = rlt.getString("address");
            String mobile = rlt.getString("mobile");
            
            
            
            
            
            
            cus = new Employee(username, password, address, mobile, email, fname, mname, lname, type);
            
            }
            
        } catch (Exception ex) {
            Logger.getLogger(CustomerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
	
        return cus;
    }
    
}
