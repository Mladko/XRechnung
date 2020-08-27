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
public class InvoiceLine {
    //Atttribute
    private final String invoiceLineIdentifier;
    private String invoiceLineNote;
    private String invoiceLineObjectIdentifier;
    private final String invoicedQuantity;
    private final String invoicedQuantityUnitOfMeasureCode;
    private final String invoicedLineNetAmount;
    private String referencedPurchaseOrderLineReference;
    private String invoiceLineBuyerAccountingReference;
    
    //Klassen
    private InvoiceLinePeriod invoiceLinePeriod;
    private List<InvoiceLineAllowances> invoiceLineAllowancesList;
    private List<InvoiceLineCharges> invoiceLineChargesList;
    private final PriceDetails priceDetails;
    private final LineVATinformation lineVATinformation;
    private final ItemInformation itemInformation;

    public InvoiceLine(String invoiceLineIdentifier, String invoicedQuantity, String invoicedQuantityUnitOfMeasureCode, String invoicedLineNetAmount, PriceDetails priceDetails, LineVATinformation lineVATinformation, ItemInformation itemInformation) {
        this.invoiceLineIdentifier = invoiceLineIdentifier;
        this.invoicedQuantity = invoicedQuantity;
        this.invoicedQuantityUnitOfMeasureCode = invoicedQuantityUnitOfMeasureCode;
        this.invoicedLineNetAmount = invoicedLineNetAmount;
        this.priceDetails = priceDetails;
        this.lineVATinformation = lineVATinformation;
        this.itemInformation = itemInformation;
    }
//<editor-fold defaultstate="collapsed" desc="Getter & Setter">

    public List<InvoiceLineAllowances> getInvoiceLineAllowancesList() {
        return invoiceLineAllowancesList;
    }

    public void setInvoiceLineAllowancesList(List<InvoiceLineAllowances> invoiceLineAllowancesList) {
        this.invoiceLineAllowancesList = invoiceLineAllowancesList;
    }

    public List<InvoiceLineCharges> getInvoiceLineChargesList() {
        return invoiceLineChargesList;
    }

    public void setInvoiceLineChargesList(List<InvoiceLineCharges> invoiceLineChargesList) {
        this.invoiceLineChargesList = invoiceLineChargesList;
    }
    
    public String getInvoiceLineNote() {
        return invoiceLineNote;
    }
    
    public String getInvoiceLineIdentifier() {
        return invoiceLineIdentifier;
    }
    
    public String getInvoicedQuantity() {
        return invoicedQuantity;
    }
    
    public String getInvoicedQuantityUnitOfMeasureCode() {
        return invoicedQuantityUnitOfMeasureCode;
    }
    
    public String getInvoicedLineNetAmount() {
        return invoicedLineNetAmount;
    }
    
    public PriceDetails getPriceDetails() {
        return priceDetails;
    }
    
    public LineVATinformation getLineVATinformation() {
        return lineVATinformation;
    }
    
    public ItemInformation getItemInformation() {
        return itemInformation;
    }
    
    public void setInvoiceLineNote(String invoiceLineNote) {
        this.invoiceLineNote = invoiceLineNote;
    }
    
    public String getInvoiceLineObjectIdentifier() {
        return invoiceLineObjectIdentifier;
    }
    
    public void setInvoiceLineObjectIdentifier(String invoiceLineObjectIdentifier) {
        this.invoiceLineObjectIdentifier = invoiceLineObjectIdentifier;
    }
    
    public String getReferencedPurchaseOrderLineReference() {
        return referencedPurchaseOrderLineReference;
    }
    
    public void setReferencedPurchaseOrderLineReference(String referencedPurchaseOrderLineReference) {
        this.referencedPurchaseOrderLineReference = referencedPurchaseOrderLineReference;
    }
    
    public String getInvoiceLineBuyerAccountingReference() {
        return invoiceLineBuyerAccountingReference;
    }
    
    public void setInvoiceLineBuyerAccountingReference(String invoiceLineBuyerAccountingReference) {
        this.invoiceLineBuyerAccountingReference = invoiceLineBuyerAccountingReference;
    }
    
    public InvoiceLinePeriod getInvoiceLinePeriod() {
        return invoiceLinePeriod;
    }
    
    public void setInvoiceLinePeriod(InvoiceLinePeriod invoiceLinePeriod) {
        this.invoiceLinePeriod = invoiceLinePeriod;
    }
    
//</editor-fold>

}
