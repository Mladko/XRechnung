/*
 * Mladen Sikiric
 * Höcker Project Managers GmbH
 */
package com.hoecker.xrechnung.XML;

import com.hoecker.xrechnung.pojos.Invoice;
import com.hoecker.xrechnung.pojos.InvoiceLine;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sikiric
 */
public class XMLSupplyChainTradeTransaction {

    private final List<XMLIncludedSupplyChainTradeLineItem> includedSupplyChainTradeLineItemList = new ArrayList<>();
    private final XMLApplicableHeaderTradeAgreement applicableHeaderTradeAgreement;
    private final XMLApplicableHeaderTradeDelivery applicableHeaderTradeDelivery;
    private final XMLApplicableHeaderTradeSettlement applicableHeaderTradeSettlement;

    public XMLSupplyChainTradeTransaction(Invoice i) {

        this.applicableHeaderTradeAgreement = new XMLApplicableHeaderTradeAgreement(i);
        this.applicableHeaderTradeDelivery = new XMLApplicableHeaderTradeDelivery(i);
        this.applicableHeaderTradeSettlement = new XMLApplicableHeaderTradeSettlement(i);
        if (i.getInvoiceLineList() != null && i.getInvoiceLineList().isEmpty()) {
            for (InvoiceLine il : i.getInvoiceLineList()) {
                this.includedSupplyChainTradeLineItemList.add(new XMLIncludedSupplyChainTradeLineItem(il));
            }
        }
    }

    public String getXML() {
        String xml = "    <rsm:SupplyChainTradeTransaction>\n";
        if (this.includedSupplyChainTradeLineItemList != null && !this.includedSupplyChainTradeLineItemList.isEmpty()) {
            for (XMLIncludedSupplyChainTradeLineItem includedSupplyChainTradeLineItem : this.includedSupplyChainTradeLineItemList) {
                xml = xml + includedSupplyChainTradeLineItem.getXML();
            }
        }
        xml = xml + this.applicableHeaderTradeAgreement.getXML();
        xml = xml + this.applicableHeaderTradeDelivery.getXML();
        xml = xml + this.applicableHeaderTradeSettlement.getXML();
        xml = xml + "    </rsm:SupplyChainTradeTransaction>\n";
        return xml;
    }
}
