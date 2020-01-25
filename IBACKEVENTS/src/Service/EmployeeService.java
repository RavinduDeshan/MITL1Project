/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.sql.SQLException;
import model.Employee;



/**
 *
 * @author P D R Deshan
 */
public interface EmployeeService {
    
    boolean validateEmployee(String email,String password) throws SQLException;
    
    boolean addEmployee(Employee emp)throws SQLException;
    
    boolean updateEmployee(Employee emp)throws SQLException;
    
    boolean deleteEmployee(String email)throws SQLException;
    
    Employee getEmployee(String email)throws SQLException;
    
}
