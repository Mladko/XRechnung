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
public class Payee {

    private final String payeeName;
    private String payeeIdentifier = "";
    private String payeeLegalRegistrationIdentifier = "";

    public Payee(String payeeName) {
        this.payeeName = payeeName;
    }

    public String getPayeeIdentifier() {
        return payeeIdentifier;
    }

    public void setPayeeIdentifier(String payeeIdentifier) {
        this.payeeIdentifier = payeeIdentifier;
    }

    public String getPayeeLegalRegistrationIdentifier() {
        return payeeLegalRegistrationIdentifier;
    }

    public void setPayeeLegalRegistrationIdentifier(String payeeLegalRegistrationIdentifier) {
        this.payeeLegalRegistrationIdentifier = payeeLegalRegistrationIdentifier;
    }

    public String getPayeeName() {
        return payeeName;
    }
    
}
