/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
import java.util.List;



public class HospitalHistory {
    private List<HospitalProfile> hospitalhistory;
    
    public HospitalHistory(){
        hospitalhistory=new ArrayList<HospitalProfile>();
    }

    public List<HospitalProfile> getHospitalhistory() {
        return hospitalhistory;
    }

    public void setHospitalhistory(List<HospitalProfile> hospitalhistory) {
        this.hospitalhistory = hospitalhistory;
    }

   
    public HospitalProfile addProfile(){
        HospitalProfile hp=new HospitalProfile();
        hospitalhistory.add(hp);
        return hp;
    }
    
    public void removeHospital(HospitalProfile hospital) {
        hospitalhistory.remove(hospital);
    }
    
    public HospitalProfile searchHospital(String email, String password) {
        for (HospitalProfile hospital : hospitalhistory) {
            if ((hospital.getEmailAddress().equals(email))&&((hospital.getPassword().equals(password)))) {
                return hospital;
            }
        }
        return null;
    }
}