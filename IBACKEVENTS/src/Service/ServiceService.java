/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Event_Service;
import model.Service;
import model.Service_Supplier;

/**
 *
 * @author P D R Deshan
 */
public interface ServiceService {
    
    
    
    boolean addService(Service srv)throws SQLException;
    
    boolean updateService(Service srv)throws SQLException;
    
    boolean deleteServiceToEvent(String sid, String eid , String supEmail)throws SQLException;
    boolean deleteService(String sid)throws SQLException;
    
    boolean AddServiceToEvent(String sid,String eid,String SupEmail, int qty)throws SQLException;
    
    boolean AddServiceToSupplier(String sid,String supemail, String info , String Price)throws SQLException;
    
    Service getService(String email)throws SQLException;
    
    ArrayList<Service_Supplier> getServiceList()throws SQLException;
    
     ArrayList<Service> getAllServiceList()throws SQLException;
    
    ArrayList<Event_Service> getEventServiceList(String Eid)throws SQLException;
    
    int getTotalServiceCount()throws Exception;
    
}
