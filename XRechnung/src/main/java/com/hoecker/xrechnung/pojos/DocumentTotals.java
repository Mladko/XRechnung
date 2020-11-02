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
public class DocumentTotals {

    private final String sumInvoiceLineNetAmount;
    private String sumOfAllowancesOnDocumentLevel = "";
    private String sumChargesOnDocumentLevel = "";
    private final String invoiceTotalAmountWithoutVAT;
    private String invoiceTotalVATamount = "";
    private String invoiveTotalVATamountInAccountingCurrency = "";
    private String invoiceTotalAmountWithVAT = "";
    private String paidAmount = "";
    private String roundingAmount = "";
    private final String amountDueForPayment;

    public DocumentTotals(String sumInvoiceLineNetAmount, String invoiceTotalAmountWithoutVAT, String amountDueForPayment) {
        this.sumInvoiceLineNetAmount = sumInvoiceLineNetAmount;
        this.invoiceTotalAmountWithoutVAT = invoiceTotalAmountWithoutVAT;
        this.amountDueForPayment = amountDueForPayment;
    }

    //<editor-fold defaultstate="collapsed" desc="Getter & Setter">
    public String getSumInvoiceLineNetAmount() {
        return sumInvoiceLineNetAmount;
    }
    
    public String getSumOfAllowancesOnDocumentLevel() {
        return sumOfAllowancesOnDocumentLevel;
    }
    
    public void setSumOfAllowancesOnDocumentLevel(String sumOfAllowancesOnDocumentLevel) {
        this.sumOfAllowancesOnDocumentLevel = sumOfAllowancesOnDocumentLevel;
    }
    
    public String getSumChargesOnDocumentLevel() {
        return sumChargesOnDocumentLevel;
    }
    
    public void setSumChargesOnDocumentLevel(String sumChargesOnDocumentLevel) {
        this.sumChargesOnDocumentLevel = sumChargesOnDocumentLevel;
    }
    
    public String getInvoiceTotalAmountWithoutVAT() {
        return invoiceTotalAmountWithoutVAT;
    }
    
    public String getInvoiceTotalVATamount() {
        return invoiceTotalVATamount;
    }
    
    public void setInvoiceTotalVATamount(String invoiceTotalVATamount) {
        this.invoiceTotalVATamount = invoiceTotalVATamount;
    }
    
    public String getInvoiveTotalVATamountInAccountingCurrency() {
        return invoiveTotalVATamountInAccountingCurrency;
    }
    
    public void setInvoiveTotalVATamountInAccountingCurrency(String invoiveTotalVATamountInAccountingCurrency) {
        this.invoiveTotalVATamountInAccountingCurrency = invoiveTotalVATamountInAccountingCurrency;
    }
    
    public String getInvoiceTotalAmountWithVAT() {
        return invoiceTotalAmountWithVAT;
    }
    
    public void setInvoiceTotalAmountWithVAT(String invoiceTotalAmountWithVAT) {
        this.invoiceTotalAmountWithVAT = invoiceTotalAmountWithVAT;
    }
    
    public String getPaidAmount() {
        return paidAmount;
    }
    
    public void setPaidAmount(String paidAmount) {
        this.paidAmount = paidAmount;
    }
    
    public String getRoundingAmount() {
        return roundingAmount;
    }
    
    public void setRoundingAmount(String roundingAmount) {
        this.roundingAmount = roundingAmount;
    }
    
    public String getAmountDueForPayment() {
        return amountDueForPayment;
    }
//</editor-fold>
}
