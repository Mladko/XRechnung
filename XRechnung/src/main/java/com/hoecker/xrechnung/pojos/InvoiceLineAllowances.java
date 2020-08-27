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
public class InvoiceLineAllowances {
    
    private final String invoiceLineAllowanceAmount;
    private String invoiceLineAllowanceBaseAmount;
    private String invoiceLineAllowancePercentage;
    private String invoiceLineAllowanceReason;
    private String invoiceLineAllowanceReasonCode;
    
    public InvoiceLineAllowances(String invoiceLineAllowanceAmount) {
        this.invoiceLineAllowanceAmount = invoiceLineAllowanceAmount;
    }

    //<editor-fold defaultstate="collapsed" desc="Getter & Setter">
    public String getInvoiceLineAllowanceBaseAmount() {
        return invoiceLineAllowanceBaseAmount;
    }
    
    public String getInvoiceLineAllowanceAmount() {
        return invoiceLineAllowanceAmount;
    }
    
    public void setInvoiceLineAllowanceBaseAmount(String invoiceLineAllowanceBaseAmount) {
        this.invoiceLineAllowanceBaseAmount = invoiceLineAllowanceBaseAmount;
    }
    
    public String getInvoiceLineAllowancePercentage() {
        return invoiceLineAllowancePercentage;
    }
    
    public void setInvoiceLineAllowancePercentage(String invoiceLineAllowancePercentage) {
        this.invoiceLineAllowancePercentage = invoiceLineAllowancePercentage;
    }
    
    public String getInvoiceLineAllowanceReason() {
        return invoiceLineAllowanceReason;
    }
    
    public void setInvoiceLineAllowanceReason(String invoiceLineAllowanceReason) {
        this.invoiceLineAllowanceReason = invoiceLineAllowanceReason;
    }
    
    public String getInvoiceLineAllowanceReasonCode() {
        return invoiceLineAllowanceReasonCode;
    }
    
    public void setInvoiceLineAllowanceReasonCode(String invoiceLineAllowanceReasonCode) {
        this.invoiceLineAllowanceReasonCode = invoiceLineAllowanceReasonCode;
    }
//</editor-fold>
    
    
}
