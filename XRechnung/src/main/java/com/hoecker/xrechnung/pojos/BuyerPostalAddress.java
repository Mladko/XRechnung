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
public class BuyerPostalAddress {

    private String addressLine1 = "";
    private String addressLine2 = "";
    private String addressLine3 = "";
    private final String city;
    private final String postCode;
    private String countrySubdivision = "";
    private final String countryCode;

    public BuyerPostalAddress(String city, String postCode, String countryCode) {
        this.city = city;
        this.postCode = postCode;
        this.countryCode = countryCode;
    }

    //<editor-fold defaultstate="collapsed" desc="Getter & Setter">

    public String getCity() {
        return city;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getCountryCode() {
        return countryCode;
    }
       
    public String getAddressLine1() {
        return addressLine1;
    }
    
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }
    
    public String getAddressLine2() {
        return addressLine2;
    }
    
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }
    
    public String getAddressLine3() {
        return addressLine3;
    }
    
    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }
    
    public String getCountrySubdivision() {
        return countrySubdivision;
    }
    
    public void setCountrySubdivision(String countrySubdivision) {
        this.countrySubdivision = countrySubdivision;
    }
    
//</editor-fold>
    
    
}
