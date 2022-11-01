/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
import java.util.List;



public class CommHistory {
    private List<CommProfile> commhistory;
    
    public CommHistory(){
        commhistory=new ArrayList<CommProfile>();
    }

    public List<CommProfile> getCommhistory() {
        return commhistory;
    }

    public void setCommhistory(List<CommProfile> commhistory) {
        this.commhistory = commhistory;
    }
    
    public CommProfile addProfile(){
        CommProfile comm=new CommProfile();
        commhistory.add(comm);
        return comm;
    }
    
    public void removeComm(CommProfile comm) {
        commhistory.remove(comm);
    }
    
    public CommProfile searchComm(String email, String password) {
        for (CommProfile comm : commhistory) {
            if ((comm.getEmailAddress().equals(email))&&((comm.getPassword().equals(password)))) {
                return comm;
            }
        }
        return null;
    }
}