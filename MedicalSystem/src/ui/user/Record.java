/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.user;
import model.*;
import javax.swing.Icon;
/**
 *
 * @author yongxingnie
 */
public class Record {
    private String name;
    private String ID;
    //unique ID
    private String community;
    private String city;
    private String hospital;
    private String email;
    private Icon photo;
    private String specialty;
    private String password;
    
//    private EncounterHistory encounterHistory;
//    
//    public Record(){
//        encounterHistory=new EncounterHistory();
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Icon getPhoto() {
        return photo;
    }

    public void setPhoto(Icon photo) {
        this.photo = photo;
    }
    
    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public EncounterHistory getEncounterHistory() {
//        return encounterHistory;
//    }
//
//    public void setEncounterHistory(EncounterHistory encounterHistory) {
//        this.encounterHistory = encounterHistory;
//    }

    @Override
    public String toString(){
        return name;
    }
    
    private String RecordDate;

    public String getRecordDate() {
        return RecordDate;
    }

    public void setRecordDate(String RecordDate) {
        this.RecordDate = RecordDate;
    }
}
