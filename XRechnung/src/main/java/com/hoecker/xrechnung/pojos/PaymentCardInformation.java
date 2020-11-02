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
public class PaymentCardInformation {
    
    private final String paymentCardPrimaryAccountNumber;
    private String paymendCardHolderName = "";

    public PaymentCardInformation(String paymentCardPrimaryAccountNumber) {
        this.paymentCardPrimaryAccountNumber = paymentCardPrimaryAccountNumber;
    }

    public String getPaymendCardHolderName() {
        return paymendCardHolderName;
    }

    public void setPaymendCardHolderName(String paymendCardHolderName) {
        this.paymendCardHolderName = paymendCardHolderName;
    }

    public String getPaymentCardPrimaryAccountNumber() {
        return paymentCardPrimaryAccountNumber;
    }
    
}
