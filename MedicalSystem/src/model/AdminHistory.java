/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
import java.util.List;



public class AdminHistory {
    private List<AdminProfile> AdminHistory;
    
    public AdminHistory(){
        AdminHistory=new ArrayList<AdminProfile>();
    }

    public List<AdminProfile> getAdminHistory() {
        return AdminHistory;
    }

    public void setAdminHistory(List<AdminProfile> AdminHistory) {
        this.AdminHistory = AdminHistory;
    }

   
    
    public AdminProfile addProfile(){
        AdminProfile admin=new AdminProfile();
        AdminHistory.add(admin);
        return admin;
    }
    
    public void removeAdmin(AdminProfile admin) {
        AdminHistory.remove(admin);
    }
    
    public AdminProfile searchDoctor(String email, String password) {
        for (AdminProfile admin : AdminHistory) {
            if ((admin.getEmailAddress().equals(email))&&((admin.getPassword().equals(password)))) {
                return admin;
            }
        }
        return null;
    }
}
