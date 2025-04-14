/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.hotel;

/**
 *
 * @author Asus
 */
public class Admin {
    private String AdminId;
    private String Adminpass;

    public Admin() {
    }

    public Admin(String AdminId, String Adminpass) {
        this.AdminId = AdminId;
        this.Adminpass = Adminpass;
    }

    public String getAdminId() {
        return AdminId;
    }

    public void setAdminId(String AdminId) {
        this.AdminId = AdminId;
    }

    public String getAdminpass() {
        return Adminpass;
    }

    public void setAdminpass(String Adminpass) {
        this.Adminpass = Adminpass;
    }
}
