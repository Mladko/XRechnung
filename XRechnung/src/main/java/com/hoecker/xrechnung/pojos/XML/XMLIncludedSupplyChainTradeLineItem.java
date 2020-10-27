/*
 * Mladen Sikiric
 * Höcker Project Managers GmbH
 */
package com.hoecker.xrechnung.pojos.XML;

import java.util.List;

/**
 *
 * @author Sikiric
 */
public class XMLIncludedSupplyChainTradeLineItem {

    private XMLAssociatedDocumentLineDocument associatedDocumentLineDocument;  
    private XMLSpecifiedTradeProduct specifiedTradeProduct;
    private XMLSpecifiedLineTradeAgreement specifiedLineTradeAgreement;
    private XMLSpecifiedLineTradeDelivery specifiedLineTradeDelivery;
    private XMLSpecifiedLineTradeSettlement specifiedLineTradeSettlement;
    
    public String getXML() {
        String xml = "        <ram:IncludedSupplyChainTradeLineItem>\n";
        xml = xml + associatedDocumentLineDocument.getXML();
        xml = xml + specifiedTradeProduct.getXML();
        xml = xml + specifiedLineTradeAgreement.getXML();
        xml = xml + specifiedLineTradeDelivery.getXML();
        xml = xml + specifiedLineTradeSettlement.getXML();
        xml = "        </ram:IncludedSupplyChainTradeLineItem>\n";
        return xml;
    }

}
