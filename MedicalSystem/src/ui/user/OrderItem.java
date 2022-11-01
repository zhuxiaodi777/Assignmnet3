/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.user;

import model.DoctorHistory;
import model.DoctorProfile;

/**
 *
 * @author judy
 */
public class OrderItem {
    
    DoctorProfile doctorProfile;
    String recordDate;

    public OrderItem(DoctorProfile doctorProfile, String recordDate) {
        this.doctorProfile = doctorProfile;
        this.recordDate = recordDate;
        
    }

    public DoctorProfile getDoctorProfile() {
        return doctorProfile;
    }

    public void setDoctorProfile(DoctorProfile doctorProfile) {
        this.doctorProfile = doctorProfile;
    }

    public String getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(String recordDate) {
        this.recordDate = recordDate;
    }
    
    @Override
    public String toString() {
        
        return this.doctorProfile.toString();
        
    }


}
