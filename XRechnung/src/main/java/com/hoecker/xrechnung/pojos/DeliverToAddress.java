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
public class DeliverToAddress {

    private String deliverToAddressLine1 = "";
    private String deliverToAddressLine2 = "";
    private String deliverToAddressLine3 = "";
    private final String deliverToCity;
    private final String deliverToPostCode;
    private String deliverToCountrySubdivision = "";
    private final String deliverToCountryCode;

    public DeliverToAddress(String deliverToCity, String deliverToPostCode, String deliverToCountryCode) {
        this.deliverToCity = deliverToCity;
        this.deliverToPostCode = deliverToPostCode;
        this.deliverToCountryCode = deliverToCountryCode;
    }

    //<editor-fold defaultstate="collapsed" desc="Getter & Setter">
    public String getDeliverToAddressLine1() {
        return deliverToAddressLine1;
    }
    
    public void setDeliverToAddressLine1(String deliverToAddressLine1) {
        this.deliverToAddressLine1 = deliverToAddressLine1;
    }
    
    public String getDeliverToAddressLine2() {
        return deliverToAddressLine2;
    }
    
    public void setDeliverToAddressLine2(String deliverToAddressLine2) {
        this.deliverToAddressLine2 = deliverToAddressLine2;
    }
    
    public String getDeliverToAddressLine3() {
        return deliverToAddressLine3;
    }
    
    public void setDeliverToAddressLine3(String deliverToAddressLine3) {
        this.deliverToAddressLine3 = deliverToAddressLine3;
    }
    
    public String getDeliverToCity() {
        return deliverToCity;
    }
    
    public String getDeliverToPostCode() {
        return deliverToPostCode;
    }
    
    public String getDeliverToCountrySubdivision() {
        return deliverToCountrySubdivision;
    }
    
    public void setDeliverToCountrySubdivision(String deliverToCountrySubdivision) {
        this.deliverToCountrySubdivision = deliverToCountrySubdivision;
    }
    
    public String getDeliverToCountryCode() {
        return deliverToCountryCode;
    }
//</editor-fold>
    
}
