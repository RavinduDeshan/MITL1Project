/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Event;

/**
 *
 * @author P D R Deshan
 */
public interface EventService {
    
  
    
    boolean addEvent(Event evnt)throws Exception;
    
    boolean updateEvent(Event evnt)throws Exception;
    
    boolean deleteEvent(String email)throws Exception;
    
    Event getCustEvent(String email)throws Exception;
    
    
    
    ArrayList<Event> getAllEventList()throws Exception;
    
    int getTotalEventCount()throws Exception;
    
   
    
}
