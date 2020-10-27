/*
 * Mladen Sikiric
 * Höcker Project Managers GmbH
 */
package com.hoecker.xrechnung.XML;

import com.hoecker.xrechnung.pojos.InvoiceLine;

/**
 *
 * @author Sikiric
 */
public class XMLSpecifiedLineTradeAgreement {

    private final String referencedPurchaseOrderLineReference;
    private final String itemNetPrice;
    private final String itemPriceDiscount;
    private final String itemPriceBaseQuantity;
    private final String itemPriceBaseQuantityUnitOfMeasureCode;

    public XMLSpecifiedLineTradeAgreement(InvoiceLine il) {
        this.referencedPurchaseOrderLineReference = il.getReferencedPurchaseOrderLineReference();
        this.itemNetPrice = il.getPriceDetails().getItemNetPrice();
        this.itemPriceDiscount = il.getPriceDetails().getItemPriceDiscount();
        this.itemPriceBaseQuantity = il.getPriceDetails().getItemPriceBaseQuantity();
        this.itemPriceBaseQuantityUnitOfMeasureCode = il.getPriceDetails().getItemPriceBaseQuantityUnitOfMeasure();
    }

    public String getXML() {
        String xml = "            <ram:SpecifiedLineTradeAgreement>\n";
        if (!this.getReferencedPurchaseOrderLineReference().equals("")) {
            xml = xml + "                <ram:BuyerOrderReferencedDocument>\n"
                    + "                    <ram:LineID>" + this.getReferencedPurchaseOrderLineReference() + "</ram:LineID>\n"
                    + "                </ram:BuyerOrderReferencedDocument>\n";
        }
        xml = xml + "                <ram:NetPriceProductTradePrice>\n"
                + "                    <ram:ChargeAmount>" + this.getItemNetPrice() + "</ram:ChargeAmount>\n";
        if (!this.getItemPriceBaseQuantityUnitOfMeasureCode().equals("") && !this.getItemPriceBaseQuantity().equals("")) {
            xml = xml + "                    <ram:BasisQuantity unitCode=\"" + this.getItemPriceBaseQuantityUnitOfMeasureCode() + "\">"
                    + this.getItemPriceBaseQuantity() + "</ram:BasisQuantity>\n";
        }
        xml = xml + "                </ram:NetPriceProductTradePrice>\n"
                + "            </ram:SpecifiedLineTradeAgreement>\n";
        return xml;
    }

    public String getReferencedPurchaseOrderLineReference() {
        return referencedPurchaseOrderLineReference;
    }

    public String getItemNetPrice() {
        return itemNetPrice;
    }

    public String getItemPriceDiscount() {
        return itemPriceDiscount;
    }

    public String getItemPriceBaseQuantity() {
        return itemPriceBaseQuantity;
    }

    public String getItemPriceBaseQuantityUnitOfMeasureCode() {
        return itemPriceBaseQuantityUnitOfMeasureCode;
    }

}
