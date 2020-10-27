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
public class XMLSupplyChainTradeTransaction {

    private List<XMLIncludedSupplyChainTradeLineItem> includedSupplyChainTradeLineItemList;
    private XMLApplicableHeaderTradeAgreement applicableHeaderTradeAgreement;
    private XMLApplicableHeaderTradeDelivery applicableHeaderTradeDelivery;
    private XMLApplicableHeaderTradeSettlement applicableHeaderTradeSettlement;

    public String getXML() {
        String xml = "    <rsm:SupplyChainTradeTransaction>\n";
        if (includedSupplyChainTradeLineItemList != null && !includedSupplyChainTradeLineItemList.isEmpty()) {
            for (XMLIncludedSupplyChainTradeLineItem includedSupplyChainTradeLineItem : includedSupplyChainTradeLineItemList){
                xml = xml + includedSupplyChainTradeLineItem.getXML();
            }
        }
        xml = xml + XMLApplicableHeaderTradeAgreement.getXML();
        xml = xml + XMLApplicableHeaderTradeDelivery.getXML();
        xml = xml + XMLApplicableHeaderTradeSettlement.getXML();
        xml = xml + "    </rsm:SupplyChainTradeTransaction>\n";
        return xml;
    }
}
