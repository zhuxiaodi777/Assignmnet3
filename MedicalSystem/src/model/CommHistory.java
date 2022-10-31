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
public class CommHistory {
    
    private ArrayList<CommProfile> history;
    
    public CommHistory(){
        
        this.history= new ArrayList<CommProfile>();
        
    }

    public ArrayList<CommProfile> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<CommProfile> history) {
        this.history = history;
    }
    
    
    public CommProfile addNewUser(){
        
        CommProfile newComm = new CommProfile();
        history.add(newComm);
        return newComm;
    }
    
//    public void deleteEmplo(UserProfile ep) {
//        history.remove(ep);
//         
//    }
    
}
