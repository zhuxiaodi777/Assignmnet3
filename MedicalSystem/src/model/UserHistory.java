/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author judy
 */
public class UserHistory {
    

    private ArrayList<UserProfile> userHistory;

    private List<UserProfile> history;

    
    public UserHistory(){
        
        this.userHistory= new ArrayList<UserProfile>();
        
    }

    public ArrayList<UserProfile> getUserHistory() {
        return userHistory;
    }

    public void setUserHistory(ArrayList<UserProfile> userHistory) {
        this.userHistory = userHistory;
    }



    public List<UserProfile> getHistory() {
        return history;
    }

    public void setHistory(List<UserProfile> history) {
        this.history = history;

    }
    
    
    public UserProfile addNewUser(){
        
        UserProfile userprofile = new UserProfile();
        userHistory.add(userprofile);
        return userprofile;
    }
    
    public void deleteUser(UserProfile userProfile) {
        userHistory.remove(userProfile);
         
    }
    
    
    public UserProfile searchUser(String email, String password) {
        for (UserProfile userProfile : userHistory) {
            if ((userProfile.getEmailAddress().equals(email))&&((userProfile.getPassword().equals(password)))) {
                return userProfile;
            }
        }
        return null;
    }
    
}
