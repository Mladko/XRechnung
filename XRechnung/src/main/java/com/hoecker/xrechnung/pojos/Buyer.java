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
    private String buyerName;
    private String buyerTradingName;
    private String buyerIdentifier;
    private String buyerLegalRegistrationIdentifier;
    private String buyerVATidentifier;
    private String buyerEletcronicAddress;

    //Klassen
    private BuyerPostalAddress buyerPostalAddress;
    private BuyerContact buyerContact;
}
