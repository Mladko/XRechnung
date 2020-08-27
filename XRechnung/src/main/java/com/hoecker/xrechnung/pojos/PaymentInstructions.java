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
public class PaymentInstructions {
    //Attribute
    private final String paymentMeansTypeCode;
    private String paymentMeansText;
    private String remittanceInformation;
    
    //Klassen
    private List<CreditTransfer> creditTransferList;
    private PaymentCardInformation paymentCardInformation;
    private DirectDebt directDebt;

    public PaymentInstructions(String paymentMeansTypeCode) {
        this.paymentMeansTypeCode = paymentMeansTypeCode;
    }
//<editor-fold defaultstate="collapsed" desc="Getter & Setter">
    
    public String getPaymentMeansTypeCode() {
        return paymentMeansTypeCode;
    }
    
    public List<CreditTransfer> getCreditTransferList() {
        return creditTransferList;
    }
    
    public void setCreditTransferList(List<CreditTransfer> creditTransferList) {
        this.creditTransferList = creditTransferList;
    }
    
    public String getPaymentMeansText() {
        return paymentMeansText;
    }
    
    public void setPaymentMeansText(String paymentMeansText) {
        this.paymentMeansText = paymentMeansText;
    }
    
    public String getRemittanceInformation() {
        return remittanceInformation;
    }
    
    public void setRemittanceInformation(String remittanceInformation) {
        this.remittanceInformation = remittanceInformation;
    }
    
    public PaymentCardInformation getPaymentCardInformation() {
        return paymentCardInformation;
    }
    
    public void setPaymentCardInformation(PaymentCardInformation paymentCardInformation) {
        this.paymentCardInformation = paymentCardInformation;
    }
    
    public DirectDebt getDirectDebt() {
        return directDebt;
    }
    
    public void setDirectDebt(DirectDebt directDebt) {
        this.directDebt = directDebt;
    }
//</editor-fold>

}
