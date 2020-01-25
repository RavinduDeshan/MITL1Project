/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.impl;

import Service.SupplierService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Event;
import model.Supplier;
import util.dbConnection;

/**
 *
 * @author P D R Deshan
 */
public class SupplierServiceImpl implements SupplierService{
    
    Connection con = dbConnection.getConnection();

    @Override
    public boolean validateSupplier(String email, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addSupplier(Supplier cus) throws SQLException {
        
        
         String sql = "INSERT INTO Supplier VALUES (?,?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement stm1 = con.prepareStatement(sql);
        
        stm1.setObject(1, cus.getEmail());
        stm1.setObject(2, cus.getFname());
        stm1.setObject(3, cus.getMname());
        stm1.setObject(4, cus.getLname());
        stm1.setObject(5, cus.getAddress());
        stm1.setObject(6, cus.getPassword());
        stm1.setObject(7, cus.getWebsite());
        stm1.setObject(8, cus.getType());
        stm1.setObject(9, cus.getCompany());
        stm1.setObject(10, cus.getUsername());
        stm1.setObject(11, cus.getMobile());
      
       
		

	return stm1.executeUpdate()>0;

    }

    @Override
    public boolean updateSupplier(Supplier cus) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteSupplier(String email) throws SQLException {
       String sql="Delete From Supplier where Email='"+email+"'";
		Statement stm= con.createStatement();
		
		return stm.executeUpdate(sql)>0;
    }

    @Override
    public Supplier getSupplier(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Supplier> getSupplierList() throws SQLException {
        Event evnt = null;
        
        ArrayList<Supplier> list = new ArrayList<>();
        
            String sql="SELECT * from Supplier ";
            Statement stm= con.createStatement();
            ResultSet rlt = stm.executeQuery(sql);
            
            while (rlt.next()) {
                
                String eid = rlt.getString("Email");
                String name = rlt.getString("Username");
                String type = rlt.getString("type");
                String fname = rlt.getString("fname");
                String mname = rlt.getString("mname");
                String lname = rlt.getString("lname");
                String website = rlt.getString("website");
                String password = rlt.getString("password");
                String address = rlt.getString("address");
                String mobile = rlt.getString("mobile");
                String company = rlt.getString("company");
                
                

                Supplier sup = new Supplier(company, website, type, name, password, address, mobile, eid, fname, mname, lname);
                        

               list.add(sup);

            }
    
            
            return list;
    }

    @Override
    public int getSupplierCount() throws SQLException {
         ResultSet rc1 = null;
    	int rowCount= 0;
    	Statement stat = con.createStatement();
    	String sql="SELECT COUNT(*) AS rowcount1 FROM Supplier ";
    	rc1 = stat.executeQuery(sql);

    	if (rc1.next()) {
    		
    	        rowCount = rc1.getInt("rowcount1");
    	        
    	}
    	
    	return rowCount;
    }

    @Override
    public boolean addServiceToSupplier(String sid, String SupplierId, String info, double price) throws SQLException {
        
        String sql = "INSERT INTO Supplier_Service VALUES (?,?,?,?)";

        PreparedStatement stm1 = con.prepareStatement(sql);
        
        stm1.setObject(1, sid);
        stm1.setObject(2, SupplierId);
        stm1.setObject(3, info);
        stm1.setObject(4, price);
       
      
       
		

	return stm1.executeUpdate()>0;

        
    }
}
