/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;


/**
 *
 * @author yongxingnie
 */
public class DoctorHistory {
     private ArrayList<DoctorProfile> doctorhistory;
    
    public DoctorHistory(){
        this.doctorhistory=new ArrayList<DoctorProfile>();
    }

    public ArrayList<DoctorProfile> getDoctorhistory() {
        return doctorhistory;
    }

    public void setDoctorhistory(ArrayList<DoctorProfile> doctorhistory) {
        this.doctorhistory = doctorhistory;
    }
    
    public DoctorProfile addProfile(){
        DoctorProfile doctor=new DoctorProfile();
        doctorhistory.add(doctor);
        return doctor;
    }
}
