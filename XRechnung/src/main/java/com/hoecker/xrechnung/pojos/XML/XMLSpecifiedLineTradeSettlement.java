/*
 * Mladen Sikiric
 * Höcker Project Managers GmbH
 */
package com.hoecker.xrechnung.pojos.XML;

import com.hoecker.xrechnung.pojos.InvoiceLine;
import com.hoecker.xrechnung.pojos.InvoiceLineAllowances;
import com.hoecker.xrechnung.pojos.InvoiceLineCharges;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 *
 * @author Sikiric
 */
public class XMLSpecifiedLineTradeSettlement {

    private final String invoicedItemVATtypeCode;
    private final String invoicedItemVATcategoryCode;
    private final String invoicedItemVATrate;
    private final String invoiceLinePeriodStartDate;
    private final String invoiceLinePeriodEndDate;
    private final List<InvoiceLineAllowances> invoiceLineAllowancesList;
    private final List<InvoiceLineCharges> invoiceLineChargesList;
    private final String invoiceLineNetAmount;
//    private final String invoiceLineObjectIdentifier;
//    private final String invoiceLineObjectTypeCode;
//    private final String invoiceLineObjectIdentifierSchemeIdentifier;
    private final String invoiceLineBuyerAccountingReference;

    public XMLSpecifiedLineTradeSettlement(InvoiceLine il) {
        DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        this.invoicedItemVATtypeCode = "VAT";
        this.invoicedItemVATcategoryCode = il.getLineVATinformation().getInvoicedItemVATcategoryCode();
        this.invoicedItemVATrate = il.getLineVATinformation().getInvoicedItemVATrate();
        this.invoiceLinePeriodStartDate = formatter.format(il.getInvoiceLinePeriod().getInvoiceLineLeriodStartDate());
        this.invoiceLinePeriodEndDate = formatter.format(il.getInvoiceLinePeriod().getInvoiceLineLeriodEndDate());
        this.invoiceLineAllowancesList = il.getInvoiceLineAllowancesList();
        this.invoiceLineChargesList = il.getInvoiceLineChargesList();
        this.invoiceLineNetAmount = il.getInvoicedLineNetAmount();
        this.invoiceLineBuyerAccountingReference = il.getInvoiceLineBuyerAccountingReference();
    }

    public String getXML() {
        String xml = "            <ram:SpecifiedLineTradeSettlement>                \n"
                + "                <ram:ApplicableTradeTax>\n"
                + "                    <ram:TypeCode>" + this.getInvoicedItemVATtypeCode() + "</ram:TypeCode>\n"
                + "                    <ram:CategoryCode>" + this.getInvoicedItemVATcategoryCode() + "</ram:CategoryCode>\n";
        if (!this.getInvoicedItemVATrate().equals("")) {
            xml = xml + "                    <ram:RateApplicablePercent>" + this.getInvoicedItemVATrate() + "</ram:RateApplicablePercent>\n";
        }
        if (this.getInvoiceLinePeriodStartDate() != null && this.getInvoiceLinePeriodStartDate().equals("")
                && this.getInvoiceLinePeriodEndDate() != null && this.getInvoiceLinePeriodEndDate().equals("")) {
            xml = xml + "                <ram:BillingSpecifiedPeriod>   \n"
                    + "                    <ram:StartDateTime>\n"
                    + "                        <udt:DateTimeString format=\"102\">" + this.getInvoiceLinePeriodStartDate() + "</udt:DateTimeString>\n"
                    + "                    </ram:StartDateTime>\n"
                    + "                    <ram:EndDateTime>\n"
                    + "                        <udt:DateTimeString format=\"102\">" + this.getInvoiceLinePeriodEndDate() + "</udt:DateTimeString>\n"
                    + "                    </ram:EndDateTime>\n"
                    + "                </ram:BillingSpecifiedPeriod>\n";
        }
        if (this.invoiceLineChargesList != null && !this.invoiceLineChargesList.isEmpty()) {
            for (InvoiceLineCharges invoiceLineCharges : invoiceLineChargesList) {

                xml = xml + "                <ram:SpecifiedTradeAllowanceCharge>\n"
                        + "                    <ram:ChargeIndicator>                        \n"
                        + "                        <udt:Indicator>true</udt:Indicator>\n"
                        + "                    </ram:ChargeIndicator>\n";
                if (!invoiceLineCharges.getInvoiceLineChargePercentage().equals("")) {
                    xml = xml + "                    <ram:CalculationPercent>" + invoiceLineCharges.getInvoiceLineChargePercentage() + "</ram:CalculationPercent>\n";
                }
                if (!invoiceLineCharges.getInvoiceLineChargeBaseAmount().equals("")) {
                    xml = xml + "                    <ram:BasisAmount>" + invoiceLineCharges.getInvoiceLineChargeBaseAmount() + "</ram:BasisAmount>\n";
                }
                if (!invoiceLineCharges.getInvoiceLineChargeAmount().equals("")) {
                    xml = xml + "                    <ram:ActualAmount>" + invoiceLineCharges.getInvoiceLineChargeAmount() + "</ram:ActualAmount>\n";
                }
                if (!invoiceLineCharges.getInvoiceLineChargeReasonCode().equals("")) {
                    xml = xml + "                    <ram:ReasonCode>" + invoiceLineCharges.getInvoiceLineChargeReasonCode() + "</ram:ReasonCode>\n";
                }
                if (!invoiceLineCharges.getInvoiceLineChargeReason().equals("")) {
                    xml = xml + "                    <ram:Reason>" + invoiceLineCharges.getInvoiceLineChargeReason() + "</ram:Reason>\n";
                }
                xml = xml + "                </ram:SpecifiedTradeAllowanceCharge>\n";
            }
        }
        if (this.invoiceLineAllowancesList != null && !this.invoiceLineAllowancesList.isEmpty()) {
            for (InvoiceLineAllowances invoiceLineAllowances : invoiceLineAllowancesList) {
                xml = xml + "                <ram:SpecifiedTradeAllowanceCharge>\n"
                        + "                    <ram:ChargeIndicator>\n"
                        + "                        <udt:Indicator>true</udt:Indicator>\n"
                        + "                    </ram:ChargeIndicator>\n";
                if (!invoiceLineAllowances.getInvoiceLineAllowancePercentage().equals("")) {
                    xml = xml + "                    <ram:CalculationPercent>" + invoiceLineAllowances.getInvoiceLineAllowancePercentage() + "</ram:CalculationPercent>\n";
                }
                if (!invoiceLineAllowances.getInvoiceLineAllowanceBaseAmount().equals("")) {
                    xml = xml + "                    <ram:BasisAmount>" + invoiceLineAllowances.getInvoiceLineAllowanceBaseAmount() + "</ram:BasisAmount>\n";
                }
                if (!invoiceLineAllowances.getInvoiceLineAllowanceAmount().equals("")) {
                    xml = xml + "                    <ram:ActualAmount>" + invoiceLineAllowances.getInvoiceLineAllowanceAmount() + "</ram:ActualAmount>\n";
                }
                if (!invoiceLineAllowances.getInvoiceLineAllowanceReasonCode().equals("")) {
                    xml = xml + "                    <ram:ReasonCode>" + invoiceLineAllowances.getInvoiceLineAllowanceReasonCode() + "</ram:ReasonCode>\n";
                }
                if (!invoiceLineAllowances.getInvoiceLineAllowanceReason().equals("")) {
                    xml = xml + "                    <ram:Reason>" + invoiceLineAllowances.getInvoiceLineAllowanceReason() + "</ram:Reason>\n";
                }
                xml = xml + "                </ram:SpecifiedTradeAllowanceCharge>\n";
            }
        }
        xml = xml + "                <ram:SpecifiedTradeSettlementLineMonetarySummation>\n"
                + "                    <ram:LineTotalAmount>" + this.getInvoiceLineNetAmount() + "</ram:LineTotalAmount>\n"
                + "                </ram:SpecifiedTradeSettlementLineMonetarySummation>\n";
        if (!this.getInvoiceLineBuyerAccountingReference().equals("")) {
            xml = xml + "                <ram:ReceivableSpecifiedTradeAccountingAccount>\n"
                    + "                    <ram:ID>" + this.getInvoiceLineBuyerAccountingReference() + "</ram:ID>\n"
                    + "                </ram:ReceivableSpecifiedTradeAccountingAccount>\n";
        }
        xml = xml + "            </ram:SpecifiedLineTradeSettlement>\n";
        return xml;
    }

    public String getInvoicedItemVATtypeCode() {
        return invoicedItemVATtypeCode;
    }

    public String getInvoicedItemVATcategoryCode() {
        return invoicedItemVATcategoryCode;
    }

    public String getInvoicedItemVATrate() {
        return invoicedItemVATrate;
    }

    public String getInvoiceLinePeriodStartDate() {
        return invoiceLinePeriodStartDate;
    }

    public String getInvoiceLinePeriodEndDate() {
        return invoiceLinePeriodEndDate;
    }

    public List<InvoiceLineAllowances> getInvoiceLineAllowancesList() {
        return invoiceLineAllowancesList;
    }

    public List<InvoiceLineCharges> getInvoiceLineChargesList() {
        return invoiceLineChargesList;
    }

    public String getInvoiceLineNetAmount() {
        return invoiceLineNetAmount;
    }

    public String getInvoiceLineBuyerAccountingReference() {
        return invoiceLineBuyerAccountingReference;
    }

}
