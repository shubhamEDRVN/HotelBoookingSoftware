/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.hotel;

/**
 *
 * @author Asus
 */
public class Room {
    private int roomno;
    private String status;
    private String capacity;
    private double amount;
    private String features;

    public Room() {
    }

    public Room(int roomno, String status, String capacity, double amount, String features) {
        this.roomno = roomno;
        this.status = status;
        this.capacity = capacity;
        this.amount = amount;
        this.features = features;
    }

    public int getRoomno() {
        return roomno;
    }

    public void setRoomno(int roomno) {
        this.roomno = roomno;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }
    
}
