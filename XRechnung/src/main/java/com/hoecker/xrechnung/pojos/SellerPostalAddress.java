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

    private String sellerAddressLine1 = "";
    private String sellerAddressLine2 = "";
    private String sellerAddressLine3 = "";
    private final String sellerCity;
    private final String sellerPostCode;
    private String sellerCountrySubdivision = "";
    private final String sellerCountryCode;

    public SellerPostalAddress(String sellerCity, String sellerPostCode, String sellerCountryCode) {
        this.sellerCity = sellerCity;
        this.sellerPostCode = sellerPostCode;
        this.sellerCountryCode = sellerCountryCode;
    }
    
//<editor-fold defaultstate="collapsed" desc="Getter & Setter">
    
    public String getSellerCity() {
        return sellerCity;
    }
    
    public String getSellerPostCode() {
        return sellerPostCode;
    }
    
    public String getSellerCountryCode() {
        return sellerCountryCode;
    }
    
    public String getSellerAddressLine1() {
        return sellerAddressLine1;
    }
    
    public void setSellerAddressLine1(String sellerAddressLine1) {
        this.sellerAddressLine1 = sellerAddressLine1;
    }
    
    public String getSellerAddressLine2() {
        return sellerAddressLine2;
    }
    
    public void setSellerAddressLine2(String sellerAddressLine2) {
        this.sellerAddressLine2 = sellerAddressLine2;
    }
    
    public String getSellerAddressLine3() {
        return sellerAddressLine3;
    }
    
    public void setSellerAddressLine3(String sellerAddressLine3) {
        this.sellerAddressLine3 = sellerAddressLine3;
    }
    
    public String getSellerCountrySubdivision() {
        return sellerCountrySubdivision;
    }
    
    public void setSellerCountrySubdivision(String sellerCountrySubdivision) {
        this.sellerCountrySubdivision = sellerCountrySubdivision;
    }
    
//</editor-fold>
    
}
