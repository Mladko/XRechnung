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
public class Buyer {
    //Attribute
    private final String buyerName;
    private String buyerTradingName;
    private String buyerIdentifier;
    private String buyerLegalRegistrationIdentifier;
    private String buyerVATidentifier;
    private String buyerEletcronicAddress;

    //Klassen
    private final BuyerPostalAddress buyerPostalAddress;
    private BuyerContact buyerContact;

    public Buyer(String buyerName, BuyerPostalAddress buyerPostalAddress) {
        this.buyerName = buyerName;
        this.buyerPostalAddress = buyerPostalAddress;
    }
    
    public String getBuyerName() {
        return buyerName;
    }

    //<editor-fold defaultstate="collapsed" desc="Getter & Setter">
    public BuyerPostalAddress getBuyerPostalAddress() {    
        return buyerPostalAddress;
    }

    public String getBuyerTradingName() {
        return buyerTradingName;
    }
    
    public void setBuyerTradingName(String buyerTradingName) {
        this.buyerTradingName = buyerTradingName;
    }
    
    public String getBuyerIdentifier() {
        return buyerIdentifier;
    }
    
    public void setBuyerIdentifier(String buyerIdentifier) {
        this.buyerIdentifier = buyerIdentifier;
    }
    
    public String getBuyerLegalRegistrationIdentifier() {
        return buyerLegalRegistrationIdentifier;
    }
    
    public void setBuyerLegalRegistrationIdentifier(String buyerLegalRegistrationIdentifier) {
        this.buyerLegalRegistrationIdentifier = buyerLegalRegistrationIdentifier;
    }
    
    public String getBuyerVATidentifier() {
        return buyerVATidentifier;
    }
    
    public void setBuyerVATidentifier(String buyerVATidentifier) {
        this.buyerVATidentifier = buyerVATidentifier;
    }
    
    public String getBuyerEletcronicAddress() {
        return buyerEletcronicAddress;
    }
    
    public void setBuyerEletcronicAddress(String buyerEletcronicAddress) {
        this.buyerEletcronicAddress = buyerEletcronicAddress;
    }
    
    public BuyerContact getBuyerContact() {
        return buyerContact;
    }
    
    public void setBuyerContact(BuyerContact buyerContact) {
        this.buyerContact = buyerContact;
    }
//</editor-fold>
    
}
