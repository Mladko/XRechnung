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
public class InvoiceLineCharges {

    private final String invoiceLineChargeAmount;
    private String invoiceLineChargeBaseAmount;
    private String invoiceLineChargePercentage;
    private String invoiceLineChargeReason;
    private String invoiceLineChargeReasonCode;

    public InvoiceLineCharges(String invoiceLineChargeAmount) {
        this.invoiceLineChargeAmount = invoiceLineChargeAmount;
    }

    //<editor-fold defaultstate="collapsed" desc="Getter & Setter">
    public String getInvoiceLineChargeBaseAmount() {
        return invoiceLineChargeBaseAmount;
    }
    
    public void setInvoiceLineChargeBaseAmount(String invoiceLineChargeBaseAmount) {
        this.invoiceLineChargeBaseAmount = invoiceLineChargeBaseAmount;
    }
    
    public String getInvoiceLineChargePercentage() {
        return invoiceLineChargePercentage;
    }
    
    public void setInvoiceLineChargePercentage(String invoiceLineChargePercentage) {
        this.invoiceLineChargePercentage = invoiceLineChargePercentage;
    }
    
    public String getInvoiceLineChargeReason() {
        return invoiceLineChargeReason;
    }
    
    public void setInvoiceLineChargeReason(String invoiceLineChargeReason) {
        this.invoiceLineChargeReason = invoiceLineChargeReason;
    }
    
    public String getInvoiceLineChargeReasonCode() {
        return invoiceLineChargeReasonCode;
    }
    
    public void setInvoiceLineChargeReasonCode(String invoiceLineChargeReasonCode) {
        this.invoiceLineChargeReasonCode = invoiceLineChargeReasonCode;
    }
    
    public String getInvoiceLineChargeAmount() {
        return invoiceLineChargeAmount;
    }
//</editor-fold>
    
}
