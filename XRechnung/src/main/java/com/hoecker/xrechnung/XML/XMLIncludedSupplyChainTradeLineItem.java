/*
 * Mladen Sikiric
 * Höcker Project Managers GmbH
 */
package com.hoecker.xrechnung.XML;

import com.hoecker.xrechnung.pojos.InvoiceLine;
import java.util.List;

/**
 *
 * @author Sikiric
 */
public class XMLIncludedSupplyChainTradeLineItem {

    private final XMLAssociatedDocumentLineDocument associatedDocumentLineDocument;  
    private final XMLSpecifiedTradeProduct specifiedTradeProduct;
    private final XMLSpecifiedLineTradeAgreement specifiedLineTradeAgreement;
    private final XMLSpecifiedLineTradeDelivery specifiedLineTradeDelivery;
    private final XMLSpecifiedLineTradeSettlement specifiedLineTradeSettlement;

    public XMLIncludedSupplyChainTradeLineItem(InvoiceLine il) {
        this.associatedDocumentLineDocument = new XMLAssociatedDocumentLineDocument(il);
        this.specifiedTradeProduct = new XMLSpecifiedTradeProduct(il);
        this.specifiedLineTradeAgreement = new XMLSpecifiedLineTradeAgreement(il);
        this.specifiedLineTradeDelivery = new XMLSpecifiedLineTradeDelivery(il);
        this.specifiedLineTradeSettlement = new XMLSpecifiedLineTradeSettlement(il);
    }        
    
    public String getXML() {
        String xml = "        <ram:IncludedSupplyChainTradeLineItem>\n";
        xml = xml + this.associatedDocumentLineDocument.getXML();
        xml = xml + this.specifiedTradeProduct.getXML();
        xml = xml + this.specifiedLineTradeAgreement.getXML();
        xml = xml + this.specifiedLineTradeDelivery.getXML();
        xml = xml + this.specifiedLineTradeSettlement.getXML();
        xml = xml + "        </ram:IncludedSupplyChainTradeLineItem>\n";
        return xml;
    }

}
