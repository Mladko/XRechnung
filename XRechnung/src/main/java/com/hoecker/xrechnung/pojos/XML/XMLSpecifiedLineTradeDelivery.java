/*
 * Mladen Sikiric
 * Höcker Project Managers GmbH
 */
package com.hoecker.xrechnung.pojos.XML;

import com.hoecker.xrechnung.pojos.InvoiceLine;

/**
 *
 * @author Sikiric
 */
public class XMLSpecifiedLineTradeDelivery {
    private final String invoicedQuantity;
    private final String invoicedQuantityUnitOfMeasure;

    public XMLSpecifiedLineTradeDelivery(InvoiceLine il) {
        this.invoicedQuantity = il.getInvoicedQuantity();
        this.invoicedQuantityUnitOfMeasure = il.getInvoicedQuantityUnitOfMeasureCode();
    }
    
    public String getXML() {
        String xml = "            <ram:SpecifiedLineTradeDelivery>     \n"
                + "                <ram:BilledQuantity unitCode=\"" + this.getInvoicedQuantityUnitOfMeasure() + "\">"
                                   + this.getInvoicedQuantity() + "</ram:BilledQuantity>\n"
                + "            </ram:SpecifiedLineTradeDelivery>\n";
        return xml;
    }

    public String getInvoicedQuantity() {
        return invoicedQuantity;
    }

    public String getInvoicedQuantityUnitOfMeasure() {
        return invoicedQuantityUnitOfMeasure;
    }

}
