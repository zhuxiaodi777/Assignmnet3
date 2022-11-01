/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class HospitalProfile {

   
    private String HospitalName;
    private String CommId;
    private String EmailAddress;
    private String Password;
    private String Address;
    private static int count=0;

// columns is pending


    public HospitalProfile() {
        count++;
    }

    public String getHospitalName() {
        return HospitalName;
    }

    public void setHospitalName(String HospitalName) {
        this.HospitalName = HospitalName;
    }

    public String getCommId() {
        return CommId;
    }

    public void setCommId(String CommId) {
        this.CommId = CommId;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        HospitalProfile.count = count;
    }
    


    
}
