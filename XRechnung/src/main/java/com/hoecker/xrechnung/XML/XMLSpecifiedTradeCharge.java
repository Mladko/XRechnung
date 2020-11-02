/*
 * Mladen Sikiric
 * Höcker Project Managers GmbH
 */
package com.hoecker.xrechnung.XML;

import com.hoecker.xrechnung.pojos.DocumentLevelCharges;
import com.hoecker.xrechnung.pojos.Invoice;
import com.hoecker.xrechnung.utils.InvoiceHelper;
import java.util.List;

/**
 *
 * @author Sikiric
 */
public class XMLSpecifiedTradeCharge {

    private final List<DocumentLevelCharges> documentLevelChargesList;

    public XMLSpecifiedTradeCharge(Invoice i) {
        this.documentLevelChargesList = i.getDocumentLevelChargesList();
    }

    public String getXML() {
        String xml = "";
        if (this.documentLevelChargesList != null && !this.documentLevelChargesList.isEmpty()) {
            for (DocumentLevelCharges dc : documentLevelChargesList) {
                xml = xml + "            <ram:SpecifiedTradeAllowanceCharge>\n"
                        + "                <ram:ChargeIndicator>\n"
                        + "                    <udt:Indicator>true</udt:Indicator>\n"
                        + "                </ram:ChargeIndicator>\n";
                if (!InvoiceHelper.returnEmptyStringOnNull(dc.getDocumentLevelChargePercentage()).equals("")) {
                    xml = xml + "                <ram:CalculationPercent>" + dc.getDocumentLevelChargePercentage() + "</ram:CalculationPercent>\n";
                }
                if (!InvoiceHelper.returnEmptyStringOnNull(dc.getDocumentLevelChargeBaseAmount()).equals("")) {
                    xml = xml + "                <ram:BasisAmount>" + dc.getDocumentLevelChargeBaseAmount() + "</ram:BasisAmount>\n";
                }
                xml = xml + "                <ram:ActualAmount>" + dc.getDocumentLevelChargeAmount() + "</ram:ActualAmount>\n";
                if (!InvoiceHelper.returnEmptyStringOnNull(dc.getDocumentLevelChargeReasonCode()).equals("")) {
                    xml = xml + "                <ram:ReasonCode>" + dc.getDocumentLevelChargeReasonCode() + "</ram:ReasonCode>\n";
                }
                if (!InvoiceHelper.returnEmptyStringOnNull(dc.getDocumentLevelChargeReason()).equals("")) {
                    xml = xml + "                <ram:Reason>" + dc.getDocumentLevelChargeReason() + "</ram:Reason>\n";
                }
                if (!InvoiceHelper.returnEmptyStringOnNull(dc.getDocumentLevelChargeVATcategoryCode()).equals("") || !InvoiceHelper.returnEmptyStringOnNull(dc.getDocumentLevelChargeVATrate()).equals("")) {
                    xml = xml + "                <ram:CategoryTradeTax>\n"
                            + "                    <ram:TypeCode>VAT</ram:TypeCode>\n";
                    if (!InvoiceHelper.returnEmptyStringOnNull(dc.getDocumentLevelChargeVATcategoryCode()).equals("")) {
                        xml = xml + "                    <ram:CategoryCode>" + dc.getDocumentLevelChargeVATcategoryCode() + "</ram:CategoryCode>\n";
                    }
                    if (!InvoiceHelper.returnEmptyStringOnNull(dc.getDocumentLevelChargeVATrate()).equals("")) {
                        xml = xml + "                    <ram:RateApplicablePercent>" + dc.getDocumentLevelChargeVATrate() + "</ram:RateApplicablePercent>\n";
                    }
                    xml = xml + "                </ram:CategoryTradeTax>\n";
                }               
            }
            xml = xml + "            </ram:SpecifiedTradeAllowanceCharge>\n";
        }        
        return xml;
    }

}
