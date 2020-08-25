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
public class PaymentInstructions {
    //Attribute
    private String paymentMeansTypeCode;
    private String paymentMeansText;
    private String remittanceInformation;
    
    //Klassen
    private CreditTransfer creditTransfer;
    private PaymentCardInformation paymentCardInformation;
    private DirectDebt directDebt;

}
