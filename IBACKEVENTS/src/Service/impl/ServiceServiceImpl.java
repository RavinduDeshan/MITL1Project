/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.impl;

import Service.ServiceService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Customer;
import model.Event_Service;
import model.Service;
import model.Service_Supplier;
import util.dbConnection;

/**
 *
 * @author P D R Deshan
 */
public class ServiceServiceImpl implements ServiceService{

         Connection con = dbConnection.getConnection();
         
    @Override
    public boolean addService(Service srv) throws SQLException {
        String sql = "INSERT INTO Service(name,Description) VALUES (?,?)";

        PreparedStatement stm1 = con.prepareStatement(sql);
        
        
        stm1.setObject(1, srv.getName());
        stm1.setObject(2, srv.getDesc());
       

		

	return stm1.executeUpdate()>0;
    }

    @Override
    public boolean updateService(Service srv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteServiceToEvent(String sid, String eid,String supEmail) {
        
             try {
                 String sql="Delete From Event_Service where Service_Id='"+sid+"' and Event_ID='"+eid+"'and Supplier_Email='"+supEmail+"'";
                 Statement stm= con.createStatement();
                 
                 return stm.executeUpdate(sql)>0;
             } catch (SQLException ex) {
                 Logger.getLogger(ServiceServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
             }
        return false;
    }

    @Override
    public Service getService(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Service_Supplier> getServiceList() throws SQLException {
        
        Service_Supplier srv;
        
        ArrayList<Service_Supplier> list = new ArrayList<>();
        try {
            String sql="select se.S_id,se.Name,su.Username,su.Type,su.email,sp.Price,sp.Info from service se, supplier su , supplier_service sp where sp.SUPPLIER_Email= su.Email and sp.SERVICE_ID = se.S_id";
            Statement stm= con.createStatement();
            ResultSet rlt = stm.executeQuery(sql);
            
            while (rlt.next()) {
                String sid = rlt.getString("s_id");
                String name = rlt.getString("name");
                String username = rlt.getString("username");
                String type = rlt.getString("type");
                String priceT = rlt.getString("price");
                String info = rlt.getString("info");
                String supplierEmail = rlt.getString("email");
                
                Double price = Double.valueOf(priceT);
               
                 
                srv = new Service_Supplier(sid, name,supplierEmail, username, type, price, info);

                list.add(srv);

            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ServiceServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
	
        return list;
    }

    @Override
    public boolean AddServiceToEvent(String sid, String eid,String SupEmail,int qty) throws SQLException {
       
        System.out.println("//////////////Event id is :" + eid);
        String sql = "INSERT INTO event_service VALUES (?,?,?,?)";

        PreparedStatement stm1 = con.prepareStatement(sql);
        
        stm1.setObject(1, eid);
        stm1.setObject(2, sid);
        stm1.setObject(4, SupEmail);
        stm1.setObject(3,qty);
        

		

	return stm1.executeUpdate()>0;

        
        
    }

    @Override
    public ArrayList<Event_Service> getEventServiceList(String Eid) throws SQLException {
        
        Event_Service srv;
        
        ArrayList<Event_Service> list = new ArrayList<>();
        try {
            String sql="select es.Service_Id,s.name,ss.Info,supplier.Username,es.Qty,ss.price,supplier.email from supplier_service ss,event_service es, service s,supplier where (s.s_ID= es.Service_ID And s.s_ID=ss.SERVICE_ID  ) And (es.Service_Id=ss.SERVICE_ID AND es.Supplier_Email=ss.SUPPLIER_Email and ss.SUPPLIER_Email=supplier.Email) And es.Event_ID='"+Eid+"'";
            Statement stm= con.createStatement();
            ResultSet rlt = stm.executeQuery(sql);
            
          
            
            while (rlt.next()) {
                String sid = rlt.getString("service_id");
                String sname = rlt.getString("name");
                String info = rlt.getString("info");
                String Suppliername = rlt.getString("username");
                String qty = rlt.getString("qty");
                String price = rlt.getString("price");
                String semail = rlt.getString("email");
                
                
                
               
                 
                srv = new Event_Service(sid, sname, info, Suppliername, qty,price,semail);
                        
                       

                list.add(srv);

            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ServiceServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
	
        return list;
    }

    @Override
    public boolean AddServiceToSupplier(String sid, String supemail, String info, String Price) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Service> getAllServiceList() throws SQLException {
        
        Service srv;
        
        ArrayList<Service> list = new ArrayList<>();
        try {
            String sql="select * from service";
            Statement stm= con.createStatement();
            ResultSet rlt = stm.executeQuery(sql);
            
          
            
            while (rlt.next()) {
                String sid = rlt.getString("s_id");
                String name = rlt.getString("name");
                String desc = rlt.getString("description");
      
                
                
                
                
               
                 
                srv = new Service(sid,name,desc);
                        
                       

                list.add(srv);

            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ServiceServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
	
        return list;
        
    }

    @Override
    public int getTotalServiceCount() throws Exception {
        
         ResultSet rc1 = null;
    	int rowCount= 0;
    	Statement stat = con.createStatement();
    	String sql="SELECT COUNT(*) AS rowcount1 FROM Service ";
    	rc1 = stat.executeQuery(sql);

    	if (rc1.next()) {
    		
    	        rowCount = rc1.getInt("rowcount1");
    	        
    	}
    	
    	return rowCount;
    }

    @Override
    public boolean deleteService(String sid) throws SQLException {
        
        
       
                 String sql="Delete From Service where S_Id='"+sid+"'";
                 Statement stm= con.createStatement();
                 
                 return stm.executeUpdate(sql)>0;
            
        
    }
    


    
    
}
