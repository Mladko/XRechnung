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
public class InvoiceLine {
    //Atttribute
    private String invoiceLineIdentifier;
    private String invoiceLineNote;
    private String invoiceLineObjectIdentifier;
    private String invoicedQuantity;
    private String invoicedQuantityUnitOfMeasureCode;
    private String referencedPurchaseOrderLineReference;
    private String invoiceLineBuyerAccountingReference;
    
    //Klasse
    private InvoiceLinePeriod invoiceLinePeriod;
    private InvoiceLineCharges invoiceLineCharges;
    private PriceDetails priceDetails;
    private LineVATinformation lineVATinformation;
    private ItemInformation itemInformation;

}
