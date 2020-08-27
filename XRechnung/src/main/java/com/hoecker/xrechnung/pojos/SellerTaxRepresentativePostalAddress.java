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
public class SellerTaxRepresentativePostalAddress {

    private String representativeAddressLine1;
    private String representativeAddressLine2;
    private String representativeAddressLine3;
    private String representativeCity;
    private String representativePostCode;
    private String representativeCountrySubdivision;
    private final String representativeCountryCode;

    public SellerTaxRepresentativePostalAddress(String representativeCountryCode) {
        this.representativeCountryCode = representativeCountryCode;
    }

    //<editor-fold defaultstate="collapsed" desc="Getter & Setter">
    public String getRepresentativeCountryCode() {
        return representativeCountryCode;
    }
    
    public String getRepresentativeAddressLine1() {
        return representativeAddressLine1;
    }
    
    public void setRepresentativeAddressLine1(String representativeAddressLine1) {
        this.representativeAddressLine1 = representativeAddressLine1;
    }
    
    public String getRepresentativeAddressLine2() {
        return representativeAddressLine2;
    }
    
    public void setRepresentativeAddressLine2(String representativeAddressLine2) {
        this.representativeAddressLine2 = representativeAddressLine2;
    }
    
    public String getRepresentativeAddressLine3() {
        return representativeAddressLine3;
    }
    
    public void setRepresentativeAddressLine3(String representativeAddressLine3) {
        this.representativeAddressLine3 = representativeAddressLine3;
    }
    
    public String getRepresentativeCity() {
        return representativeCity;
    }
    
    public void setRepresentativeCity(String representativeCity) {
        this.representativeCity = representativeCity;
    }
    
    public String getRepresentativePostCode() {
        return representativePostCode;
    }
    
    public void setRepresentativePostCode(String representativePostCode) {
        this.representativePostCode = representativePostCode;
    }
    
    public String getRepresentativeCountrySubdivision() {
        return representativeCountrySubdivision;
    }
    
    public void setRepresentativeCountrySubdivision(String representativeCountrySubdivision) {
        this.representativeCountrySubdivision = representativeCountrySubdivision;
    }
    
//</editor-fold>
}
