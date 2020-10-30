/*
 * Mladen Sikiric
 * Höcker Project Managers GmbH
 */
package com.hoecker.xrechnung.XML;

import com.hoecker.xrechnung.pojos.Invoice;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author Sikiric
 */
public class XMLApplicableHeaderTradeSettlement {

    private final String paymentTerms;
    private final String bankAssignedCreditorIdentifier;
    private final String remittanceInformation;
    private final String vatAccountingCurrencyCode;
    private final String invoiceCurrencyCode;
    private final String payeeIdentifier;
    private final String payeeName;   
    private final String invoicingPeriodStartDate;
    private final String invoicingPeriodEndDate;   
    private final String paymentDueDate;
    private final String mandateReferenceIdentifier;   
    private final XMLSpecifiedTradeSettlementPaymentMeans specifiedTradeSettlementPaymentMeans;
    private final XMLApplicableTradeTax applicableTradeTax;
    private final XMLSpecifiedTradeCharge specifiedTradeCharge;
    private final XMLSpecifiedTradeAllowance specifiedTradeAllowance;
    private final XMLSpecifiedTradeSettlementHeaderMonetarySummation specifiedTradeSettlementHeaderMonetarySummation;

    public XMLApplicableHeaderTradeSettlement(Invoice i) {
      
        this.bankAssignedCreditorIdentifier = i.getPaymentInstructions().getDirectDebt().getBankAssignedCreditorIdentifier();
        this.remittanceInformation = i.getPaymentInstructions().getRemittanceInformation();
        this.vatAccountingCurrencyCode = i.getVatAccountingCurrencyCode();
        this.invoiceCurrencyCode = i.getInvoiceCurrencyCode();
        this.payeeIdentifier = i.getPayee().getPayeeIdentifier();
        this.payeeName = i.getPayee().getPayeeName();
        DateFormat formatter = new SimpleDateFormat("yyyyMMdd");           
        this.invoicingPeriodStartDate = formatter.format(i.getInvoiceLineList().get(0).getInvoiceLinePeriod().getInvoiceLineLeriodStartDate());
        this.invoicingPeriodEndDate = formatter.format(i.getInvoiceLineList().get(0).getInvoiceLinePeriod().getInvoiceLineLeriodEndDate());
        this.paymentTerms = i.getPaymentTerms();
        this.paymentDueDate = formatter.format(i.getPaymendDueDate());
        this.mandateReferenceIdentifier = i.getPaymentInstructions().getDirectDebt().getMandateReferenceIdentifier();   
        this.specifiedTradeAllowance = new XMLSpecifiedTradeAllowance(i);
        this.specifiedTradeCharge = new XMLSpecifiedTradeCharge(i);
        this.specifiedTradeSettlementHeaderMonetarySummation = new XMLSpecifiedTradeSettlementHeaderMonetarySummation(i);
        this.specifiedTradeSettlementPaymentMeans = new XMLSpecifiedTradeSettlementPaymentMeans(i);
        this.applicableTradeTax = new XMLApplicableTradeTax(i);
    }
    
    public String getXML() {
        String xml = "        <ram:ApplicableHeaderTradeSettlement>\n";
        xml = xml + "            <ram:CreditorReferenceID>" + this.getBankAssignedCreditorIdentifier() + "</ram:CreditorReferenceID>\n"
                + "            <ram:PaymentReference>" + this.getRemittanceInformation() + "</ram:PaymentReference>\n"
                + "            <ram:TaxCurrencyCode>" + this.getVatAccountingCurrencyCode() + "</ram:TaxCurrencyCode>\n"
                + "            <ram:InvoiceCurrencyCode>" + this.getInvoiceCurrencyCode() + "</ram:InvoiceCurrencyCode>\n"
                + "            <ram:PayeeTradeParty>\n"
                + "                <ram:ID>" + this.getPayeeIdentifier() + "</ram:ID>\n"                                
                + "                <ram:Name>" + this.getPayeeName() + "</ram:Name>\n"
                + "            </ram:PayeeTradeParty>\n";                
        xml = xml + this.specifiedTradeSettlementPaymentMeans.getXML();
        xml = xml + this.applicableTradeTax.getXML();
        xml = xml + "            <ram:BillingSpecifiedPeriod>  \n"
                + "                <ram:StartDateTime>\n"
                + "                    <udt:DateTimeString format=\"102\">" + this.getInvoicingPeriodStartDate() + "</udt:DateTimeString>\n"
                + "                </ram:StartDateTime>\n"
                + "                <ram:EndDateTime>\n"
                + "                    <udt:DateTimeString format=\"102\">" + this.getInvoicingPeriodEndDate() + "</udt:DateTimeString>\n"
                + "                </ram:EndDateTime>\n"
                + "            </ram:BillingSpecifiedPeriod>        \n";
        xml = xml + this.specifiedTradeCharge.getXML();
        xml = xml + this.specifiedTradeAllowance.getXML();
        xml = xml + "            <ram:SpecifiedTradePaymentTerms>                \n"
                + "                <ram:Description>" + this.getPaymentTerms() + "</ram:Description>\n"
                + "                <ram:DueDateDateTime>\n"
                + "                    <udt:DateTimeString format=\"102\">" + this.getPaymentDueDate() + "</udt:DateTimeString>\n"
                + "                </ram:DueDateDateTime>            \n"
                + "                <ram:DirectDebitMandateID>" + this.getMandateReferenceIdentifier() + "</ram:DirectDebitMandateID>\n"
                + "            </ram:SpecifiedTradePaymentTerms>\n";
        
        return xml;
    }

    public String getPaymentTerms() {
        return paymentTerms;
    }

    public String getBankAssignedCreditorIdentifier() {
        return bankAssignedCreditorIdentifier;
    }

    public String getRemittanceInformation() {
        return remittanceInformation;
    }

    public String getVatAccountingCurrencyCode() {
        return vatAccountingCurrencyCode;
    }

    public String getInvoiceCurrencyCode() {
        return invoiceCurrencyCode;
    }

    public String getPayeeIdentifier() {
        return payeeIdentifier;
    }

    public String getPayeeName() {
        return payeeName;
    }

    public String getInvoicingPeriodStartDate() {
        return invoicingPeriodStartDate;
    }

    public String getInvoicingPeriodEndDate() {
        return invoicingPeriodEndDate;
    }

    public String getPaymentDueDate() {
        return paymentDueDate;
    }

    public String getMandateReferenceIdentifier() {
        return mandateReferenceIdentifier;
    }  

    public XMLSpecifiedTradeSettlementPaymentMeans getSpecifiedTradeSettlementPaymentMeans() {
        return specifiedTradeSettlementPaymentMeans;
    }

    public XMLApplicableTradeTax getApplicableTradeTax() {
        return applicableTradeTax;
    }

    public XMLSpecifiedTradeCharge getSpecifiedTradeCharge() {
        return specifiedTradeCharge;
    }

    public XMLSpecifiedTradeAllowance getSpecifiedTradeAllowance() {
        return specifiedTradeAllowance;
    }

    public XMLSpecifiedTradeSettlementHeaderMonetarySummation getSpecifiedTradeSettlementHeaderMonetarySummation() {
        return specifiedTradeSettlementHeaderMonetarySummation;
    }

}
