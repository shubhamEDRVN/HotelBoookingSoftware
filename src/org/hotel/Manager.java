/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.hotel;

/**
 *
 * @author Asus
 */
public class Manager {
    private String manid;
    private String password;
    private String fullname;
    private long contact;
    private String email;
    private String gender;
    private String dob;
    private String address;
    private String qualification;

    public Manager() {
    }

    public Manager(String manid, String password, String fullname, long contact, String email, String gender, String dob, String address, String qualification) {
        this.manid = manid;
        this.password = password;
        this.fullname = fullname;
        this.contact = contact;
        this.email = email;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.qualification = qualification;
    }

    public String getManid() {
        return manid;
    }

    public void setManid(String manid) {
        this.manid = manid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    
    
}
