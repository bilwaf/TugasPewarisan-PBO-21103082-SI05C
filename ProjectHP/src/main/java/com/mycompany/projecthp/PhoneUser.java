/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projecthp;

/**
 *
 * @author ASUS ZenBook
 * 21103082
 * NABILA WAFAA' YULISTYANINGRUM
 * S1SI05C
 */

public class PhoneUser {
    private Phone phone;

    public PhoneUser(Phone phone) {
        this.phone = phone;
    }
    
    void turnOnThePhone()
    {
        this.phone.powerOn();
    }
    
    void turnOffThePhone(){
        this.phone.powerOff();
    }
    
    void makeVolumeUp(){
        this.phone.volumeUp();
    }
    
    void makeVolumeDown(){
        this.phone.volumeDown();
    }
   
}
