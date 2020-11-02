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
public class InvoiceNote {
    private String paymentTerms = "";
    private final String invoiceNote;

    public InvoiceNote(String invoiceNote) {
        this.invoiceNote = invoiceNote;
    }

    public String getPaymentTerms() {
        return paymentTerms;
    }

    public void setPaymentTerms(String paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    public String getInvoiceNote() {
        return invoiceNote;
    }
    
    
}
