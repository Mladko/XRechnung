/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoecker.xrechnung.pojos;

import java.util.List;

/**
 *
 * @author Sikiric
 */
public class Seller {
    //Attributes
    private final String sellerName;
    private String sellerTradingName;
    private List<String> sellerIdentifierList;
    private String sellerLegalRegistrationIdentifier;
    private String sellerVatIdentifier;
    private String sellerTaxRegistrationIdentifier;
    private String sellerAdditionalLegalInformation;
    private String sellerElectronicAddress;
    
    //Classes
    private final SellerPostalAddress sellerPostalAddress;
    private final SellerContact sellerContact;

    public Seller(String sellerName, SellerPostalAddress sellerPostalAddress, SellerContact sellerContact) {
        this.sellerName = sellerName;
        this.sellerContact = sellerContact;
        this.sellerPostalAddress = sellerPostalAddress;
    }

    //<editor-fold defaultstate="collapsed" desc="Getter & Setter">
    public String getSellerTradingName() {
        return sellerTradingName;
    }
    
    public String getSellerName() {
        return sellerName;
    }

    public SellerPostalAddress getSellerPostalAddress() {
        return sellerPostalAddress;
    }

    public SellerContact getSellerContact() {
        return sellerContact;
    }
         
    public void setSellerTradingName(String sellerTradingName) {
        this.sellerTradingName = sellerTradingName;
    }
    
    public List<String> getSellerIdentifierList() {
        return sellerIdentifierList;
    }
    
    public void setSellerIdentifierList(List<String> sellerIdentifierList) {
        this.sellerIdentifierList = sellerIdentifierList;
    }
    
    public String getSellerLegalRegistrationIdentifier() {
        return sellerLegalRegistrationIdentifier;
    }
    
    public void setSellerLegalRegistrationIdentifier(String sellerLegalRegistrationIdentifier) {
        this.sellerLegalRegistrationIdentifier = sellerLegalRegistrationIdentifier;
    }
    
    public String getSellerVatIdentifier() {
        return sellerVatIdentifier;
    }
    
    public void setSellerVatIdentifier(String sellerVatIdentifier) {
        this.sellerVatIdentifier = sellerVatIdentifier;
    }
    
    public String getSellerTaxRegistrationIdentifier() {
        return sellerTaxRegistrationIdentifier;
    }
    
    public void setSellerTaxRegistrationIdentifier(String sellerTaxRegistrationIdentifier) {
        this.sellerTaxRegistrationIdentifier = sellerTaxRegistrationIdentifier;
    }
    
    public String getSellerAdditionalLegalInformation() {
        return sellerAdditionalLegalInformation;
    }
    
    public void setSellerAdditionalLegalInformation(String sellerAdditionalLegalInformation) {
        this.sellerAdditionalLegalInformation = sellerAdditionalLegalInformation;
    }
    
    public String getSellerElectronicAddress() {
        return sellerElectronicAddress;
    }
    
    public void setSellerElectronicAddress(String sellerElectronicAddress) {
        this.sellerElectronicAddress = sellerElectronicAddress;
    }
    
//</editor-fold>
    
}
