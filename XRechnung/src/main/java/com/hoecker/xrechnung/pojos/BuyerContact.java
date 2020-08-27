/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoecker.xrechnung.pojos;

/**
 *
 * @author Sikiric
 */
public class BuyerContact {

    private final String contactPoint;
    private final String contactTelephoneNumber;
    private final String contactEmailAddress;

    public BuyerContact(String contactPoint, String contactTelephoneNumber, String contactEmailAddress) {
        this.contactPoint = contactPoint;
        this.contactTelephoneNumber = contactTelephoneNumber;
        this.contactEmailAddress = contactEmailAddress;
    }

    public String getContactPoint() {
        return contactPoint;
    }

    public String getContactTelephoneNumber() {
        return contactTelephoneNumber;
    }

    public String getContactEmailAddress() {
        return contactEmailAddress;
    }
   
    
}
