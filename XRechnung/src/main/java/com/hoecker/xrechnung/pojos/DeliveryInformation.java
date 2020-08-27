/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoecker.xrechnung.pojos;

import java.util.Date;

/**
 *
 * @author Sikiric
 */
public class DeliveryInformation {
    
    private final String deliverToPartyName;
    private final String deliverToLocationIdentifier;
    private final Date actualDeliveryDate;
    
    private InvoicingPeriod invoicingPeriod;
    private DeliverToAddress deliverToAddress;

    public DeliveryInformation(String deliverToPartyName, String deliverToLocationIdentifier, Date actualDeliveryDate) {
        this.deliverToPartyName = deliverToPartyName;
        this.deliverToLocationIdentifier = deliverToLocationIdentifier;
        this.actualDeliveryDate = actualDeliveryDate;
    }
//<editor-fold defaultstate="collapsed" desc="Getter & Setter">
    
    public InvoicingPeriod getInvoicingPeriod() {
        return invoicingPeriod;
    }
    
    public void setInvoicingPeriod(InvoicingPeriod invoicingPeriod) {
        this.invoicingPeriod = invoicingPeriod;
    }
    
    public DeliverToAddress getDeliverToAddress() {
        return deliverToAddress;
    }
    
    public void setDeliverToAddress(DeliverToAddress deliverToAddress) {
        this.deliverToAddress = deliverToAddress;
    }
    
    public String getDeliverToPartyName() {
        return deliverToPartyName;
    }
    
    public String getDeliverToLocationIdentifier() {
        return deliverToLocationIdentifier;
    }
    
    public Date getActualDeliveryDate() {
        return actualDeliveryDate;
    }
    
//</editor-fold>
    
    
}
