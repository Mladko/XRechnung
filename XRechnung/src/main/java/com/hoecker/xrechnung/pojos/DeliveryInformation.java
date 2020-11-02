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
public class DeliveryInformation {
    
    private final String deliverToPartyName;
    private final String deliverToLocationIdentifier;
    private final String actualDeliveryDate;
    
    private InvoicingPeriod invoicingPeriod;
    private DeliverToAddress deliverToAddress;

    public DeliveryInformation(String deliverToPartyName, String deliverToLocationIdentifier, String actualDeliveryDate) {
        this.deliverToPartyName = deliverToPartyName;
        this.deliverToLocationIdentifier = deliverToLocationIdentifier;
        this.actualDeliveryDate = actualDeliveryDate;
        this.invoicingPeriod = new InvoicingPeriod("", "");
        this.deliverToAddress = new DeliverToAddress("", "", "");
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
    
    public String getActualDeliveryDate() {
        return actualDeliveryDate;
    }
    
//</editor-fold>
    
    
}
