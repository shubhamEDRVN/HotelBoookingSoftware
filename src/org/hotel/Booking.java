/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.hotel;

/**
 *
 * @author Asus
 */
public class Booking {
    private String bookingid;
    private int roomno;
    private String fullname;
    private long contact;
    private String email;
    private int age;
    private String gender;

    public Booking() {
    }

    public Booking(String bookingid, int roomno, String fullname, long contact, String email, int age, String gender) {
        this.bookingid = bookingid;
        this.roomno = roomno;
        this.fullname = fullname;
        this.contact = contact;
        this.email = email;
        this.age = age;
        this.gender = gender;
    }

    public String getBookingid() {
        return bookingid;
    }

    public void setBookingid(String bookingid) {
        this.bookingid = bookingid;
    }

    public int getRoomno() {
        return roomno;
    }

    public void setRoomno(int roomno) {
        this.roomno = roomno;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
}
