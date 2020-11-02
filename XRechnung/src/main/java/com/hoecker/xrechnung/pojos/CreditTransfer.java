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
public class CreditTransfer {

    private final String paymentAccountIdentifier;
    private String paymentAccountName = "";
    private String paymentServiceProviderIdentifier = "";

    public CreditTransfer(String paymentAccountIdentifier) {
        this.paymentAccountIdentifier = paymentAccountIdentifier;
    }

    public String getPaymentAccountIdentifier() {
        return paymentAccountIdentifier;
    }

    public String getPaymentAccountName() {
        return paymentAccountName;
    }

    public void setPaymentAccountName(String paymentAccountName) {
        this.paymentAccountName = paymentAccountName;
    }

    public String getPaymentServiceProviderIdentifier() {
        return paymentServiceProviderIdentifier;
    }

    public void setPaymentServiceProviderIdentifier(String paymentServiceProviderIdentifier) {
        this.paymentServiceProviderIdentifier = paymentServiceProviderIdentifier;
    }

    
    
}
