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
    
    private ArrayList<UserProfile> userHistory;
    
    public UserHistory(){
        
        this.userHistory= new ArrayList<UserProfile>();
        
    }

    public ArrayList<UserProfile> getHistory() {
        return userHistory;
    }

    public void setHistory(ArrayList<UserProfile> history) {
        this.userHistory = history;
    }
    
    
    public UserProfile addNewUser(){
        
        UserProfile userprofile = new UserProfile();
        userHistory.add(userprofile);
        return userprofile;
    }
    
    public void deleteUser(UserProfile userProfile) {
        userHistory.remove(userProfile);
         
    }
    
}
