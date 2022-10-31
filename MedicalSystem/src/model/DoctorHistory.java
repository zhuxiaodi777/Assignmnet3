/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author yongxingnie
 */
public class DoctorHistory {
    private List<DoctorProfile> doctorhistory;
    
    public DoctorHistory(){
        doctorhistory=new ArrayList<DoctorProfile>();
    }

    public List<DoctorProfile> getDoctorhistory() {
        return doctorhistory;
    }

    public void setDoctorhistory(List<DoctorProfile> doctorhistory) {
        this.doctorhistory = doctorhistory;
    }
    
    public DoctorProfile addProfile(){
        DoctorProfile doctor=new DoctorProfile();
        doctorhistory.add(doctor);
        return doctor;
    }
    
    public void removeDoctor(DoctorProfile doctor) {
        doctorhistory.remove(doctor);
    }
    
    public DoctorProfile searchDoctor(String email, String password) {
        for (DoctorProfile doctor : doctorhistory) {
            if ((doctor.getEmail().equals(email))&&((doctor.getPassword().equals(password)))) {
                return doctor;
            }
        }
        return null;
    }
}
