/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author judy
 */
public class UserHistory {
    
    private ArrayList<UserProfile> history;
    
    public UserHistory(){
        
        this.history= new ArrayList<UserProfile>();
        
    }

    public ArrayList<UserProfile> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<UserProfile> history) {
        this.history = history;
    }
    
    
    public UserProfile addNewUser(){
        
        UserProfile newEmployee = new UserProfile();
        history.add(newEmployee);
        return newEmployee;
    }
    
//    public void deleteEmplo(UserProfile ep) {
//        history.remove(ep);
//         
//    }
    
}
