/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class CommProfile {

   
    private String CommName;
    private String CommId;
    private String EmailAddress;
    private String Hospital;
    private String Address;
    private static int count=0;

// columns is pending


    public CommProfile() {
        count++;
    }
    

    private String Password;

    public String getCommName() {
        return CommName;
    }

    public void setCommName(String CommName) {
        this.CommName = CommName;
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

    public String getHospital() {
        return Hospital;
    }

    public void setHospital(String Hospital) {
        this.Hospital = Hospital;
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
        CommProfile.count = count;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }



    
}
