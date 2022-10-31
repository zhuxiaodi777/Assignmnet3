/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.user;
import model.*;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author yongxingnie
 */
public class RecordHistory {
    private List<Record> recordhistory;
    
    public RecordHistory(){
        recordhistory=new ArrayList<Record>();
    }

    public List<Record> getRecordhistory() {
        return recordhistory;
    }

    public void setRecordhistory(List<Record> recordhistory) {
        this.recordhistory = recordhistory;
    }

    
    public Record addrecord(){
        Record record=new Record();
        recordhistory.add(record);
        return record;
    }
    
    public void removeDoctor(DoctorProfile doctor) {
        recordhistory.remove(doctor);
    }
    
//    public DoctorProfile searchDoctor(String email, String password) {
//        for (DoctorProfile doctor : doctorhistory) {
//            if ((doctor.getEmail().equals(email))&&((doctor.getPassword().equals(password)))) {
//                return doctor;
//            }
//        }
//        return null;
//    }
}
