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
public class SellerPostalAddress {

    private final String sellerContactPoint;
    private final String sellecrContactTelephoneNumber;
    private final String sellerContactEmailaddress;

    public SellerPostalAddress(String sellerContactPoint, String sellecrContactTelephoneNumber, String sellerContactEmailaddress) {
        this.sellerContactPoint = sellerContactPoint;
        this.sellecrContactTelephoneNumber = sellecrContactTelephoneNumber;
        this.sellerContactEmailaddress = sellerContactEmailaddress;
    }

    public String getSellerContactPoint() {
        return sellerContactPoint;
    }

    public String getSellecrContactTelephoneNumber() {
        return sellecrContactTelephoneNumber;
    }

    public String getSellerContactEmailaddress() {
        return sellerContactEmailaddress;
    }
    
    
}
