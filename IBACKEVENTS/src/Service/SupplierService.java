/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;


import java.sql.SQLException;
import java.util.ArrayList;
import model.Supplier;

/**
 *
 * @author P D R Deshan
 */
public interface SupplierService {
    
    boolean validateSupplier(String email,String password)throws SQLException;
    
    boolean addSupplier(Supplier cus)throws SQLException;
    
    boolean addServiceToSupplier(String sid,String SupplierId, String info , double price)throws SQLException;
    
    boolean updateSupplier(Supplier cus)throws SQLException;
    
    boolean deleteSupplier(String email)throws SQLException;
    
    Supplier getSupplier(String email)throws SQLException;
    
    ArrayList<Supplier> getSupplierList() throws SQLException;
    
    int getSupplierCount() throws SQLException;
    
}
