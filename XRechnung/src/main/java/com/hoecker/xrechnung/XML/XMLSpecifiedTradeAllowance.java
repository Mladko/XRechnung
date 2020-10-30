/*
 * Mladen Sikiric
 * Höcker Project Managers GmbH
 */
package com.hoecker.xrechnung.XML;

import com.hoecker.xrechnung.pojos.DocumentLevelAllowances;
import com.hoecker.xrechnung.pojos.Invoice;
import java.util.List;

/**
 *
 * @author Sikiric
 */
public class XMLSpecifiedTradeAllowance {

    private final List<DocumentLevelAllowances> documentLevelAllowancesList;

    public XMLSpecifiedTradeAllowance(Invoice i) {
        this.documentLevelAllowancesList = i.getDocumentLevelAllowancesList();
    }

    public String getXML() {
        String xml = "";
        if (this.documentLevelAllowancesList != null && !this.documentLevelAllowancesList.isEmpty()) {
            for (DocumentLevelAllowances ac : documentLevelAllowancesList) {
                xml = xml + "            <ram:SpecifiedTradeAllowanceCharge>\n"
                        + "                <ram:ChargeIndicator>\n"
                        + "                    <udt:Indicator>true</udt:Indicator>\n"
                        + "                </ram:ChargeIndicator>\n";
                if (!ac.getDocumentLevelAllowancesPercentages().equals("")) {
                    xml = xml + "                <ram:CalculationPercent>" + ac.getDocumentLevelAllowancesPercentages() + "</ram:CalculationPercent>\n";
                }
                if (!ac.getDocumentLevelAllowancesBaseAmount().equals("")) {
                    xml = xml + "                <ram:BasisAmount>" + ac.getDocumentLevelAllowancesBaseAmount()+ "</ram:BasisAmount>\n";
                }
                xml = xml + "                <ram:ActualAmount>" + ac.getDocumentLevelAllowancesAmount() + "</ram:ActualAmount>\n";
                if (!ac.getDocumentLevelAllowancesReasonCode().equals("")) {
                    xml = xml + "                <ram:ReasonCode>" + ac.getDocumentLevelAllowancesReasonCode() + "</ram:ReasonCode>\n";
                }
                if (!ac.getDocumentLevelAllowancesReason().equals("")) {
                    xml = xml + "                <ram:Reason>" + ac.getDocumentLevelAllowancesReason() + "</ram:Reason>\n";
                }
                if (!ac.getDocumentLevelAllowancesVATrate().equals("") || !ac.getDocumentLevelAllowancesVATrate().equals("")) {
                    xml = xml + "                <ram:CategoryTradeTax>\n"
                            + "                    <ram:TypeCode>VAT</ram:TypeCode>\n";
                    if (!ac.getDocumentLevelAllowancesVATcategoryCode().equals("")) {
                        xml = xml + "                    <ram:CategoryCode>" + ac.getDocumentLevelAllowancesVATcategoryCode() + "</ram:CategoryCode>\n";
                    }
                    if (!ac.getDocumentLevelAllowancesVATrate().equals("")) {
                        xml = xml + "                    <ram:RateApplicablePercent>" + ac.getDocumentLevelAllowancesVATrate() + "</ram:RateApplicablePercent>\n";
                    }
                    xml = xml + "                </ram:CategoryTradeTax>\n";
                }
            }
            xml = xml + "            </ram:SpecifiedTradeAllowanceCharge>\n";
        }
        return xml;
    }
}

