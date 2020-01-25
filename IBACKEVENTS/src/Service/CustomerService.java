/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Customer;
import model.Event;

/**
 *
 * @author P D R Deshan
 */
public interface CustomerService {
    
    boolean validateCustomer(String email,String password) throws Exception;
    
    boolean addCustomer(Customer cus) throws SQLException;
    
    boolean updateCustomer(Customer cus)throws SQLException;
    
    boolean deleteCustomer(String email)throws SQLException;
    
    Customer getCustomer(String email)throws Exception;
    
    ArrayList<Customer> getCustomerList()throws SQLException;
    
    ArrayList<Customer> SearchCustomerDetails(String scontent)throws SQLException;
    
    boolean validatePassword(String pass,String cpass);
    
    int getEventCountCustomer(String email)throws SQLException;
    
    int getTotalCus()throws SQLException;
    
    ArrayList<Event> getCustomerEvents(String email)throws SQLException;
    
     ArrayList<Event> SearchCustomerEvents(String cemail,String scontent)throws SQLException;
}
