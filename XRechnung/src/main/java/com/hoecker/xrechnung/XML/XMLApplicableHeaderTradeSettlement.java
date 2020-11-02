/*
 * Mladen Sikiric
 * Höcker Project Managers GmbH
 */
package com.hoecker.xrechnung.XML;

import com.hoecker.xrechnung.pojos.Invoice;

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
//        DateFormat formatter = new SimpleDateFormat("yyyyMMdd");           
        this.invoicingPeriodStartDate = i.getInvoiceLineList().get(0).getInvoiceLinePeriod().getInvoiceLineLeriodStartDate();
        this.invoicingPeriodEndDate = i.getInvoiceLineList().get(0).getInvoiceLinePeriod().getInvoiceLineLeriodEndDate();
        this.paymentTerms = i.getPaymentTerms();
        this.paymentDueDate = i.getPaymendDueDate();
        this.mandateReferenceIdentifier = i.getPaymentInstructions().getDirectDebt().getMandateReferenceIdentifier();
        this.specifiedTradeAllowance = new XMLSpecifiedTradeAllowance(i);
        this.specifiedTradeCharge = new XMLSpecifiedTradeCharge(i);
        this.specifiedTradeSettlementHeaderMonetarySummation = new XMLSpecifiedTradeSettlementHeaderMonetarySummation(i);
        this.specifiedTradeSettlementPaymentMeans = new XMLSpecifiedTradeSettlementPaymentMeans(i);
        this.applicableTradeTax = new XMLApplicableTradeTax(i);
    }

    public String getXML() {
        String xml = "";
        if (!this.getBankAssignedCreditorIdentifier().equals("") || !this.getRemittanceInformation().equals("")
                || !this.getVatAccountingCurrencyCode().equals("") || !this.getInvoiceCurrencyCode().equals("")
                || !this.getPayeeIdentifier().equals("") || !this.getPayeeName().equals("")
                || !this.getInvoicingPeriodStartDate().equals("") || !this.getInvoicingPeriodEndDate().equals("")
                || !this.specifiedTradeSettlementPaymentMeans.getXML().equals("") || !this.applicableTradeTax.getXML().equals("")
                || !this.specifiedTradeCharge.getXML().equals("") || !this.specifiedTradeAllowance.getXML().equals("")) {
            xml = xml + "        <ram:ApplicableHeaderTradeSettlement>\n";
            if (!this.getBankAssignedCreditorIdentifier().equals("")) {
                xml = xml + "            <ram:CreditorReferenceID>" + this.getBankAssignedCreditorIdentifier() + "</ram:CreditorReferenceID>\n";
            }
            if (!this.getRemittanceInformation().equals("")) {
                xml = xml + "            <ram:PaymentReference>" + this.getRemittanceInformation() + "</ram:PaymentReference>\n";
            }
            if (!this.getVatAccountingCurrencyCode().equals("")) {
                xml = xml + "            <ram:TaxCurrencyCode>" + this.getVatAccountingCurrencyCode() + "</ram:TaxCurrencyCode>\n";
            }
            if (!this.getInvoiceCurrencyCode().equals("")) {
                xml = xml + "            <ram:InvoiceCurrencyCode>" + this.getInvoiceCurrencyCode() + "</ram:InvoiceCurrencyCode>\n";
            }
            if (!this.getPayeeIdentifier().equals("") || !this.getPayeeName().equals("")) {
                xml = xml + "            <ram:PayeeTradeParty>\n";
                if (!this.getPayeeIdentifier().equals("")) {
                    xml = xml + "                <ram:ID>" + this.getPayeeIdentifier() + "</ram:ID>\n";
                }
                if (!this.getPayeeName().equals("")) {
                    xml = xml + "                <ram:Name>" + this.getPayeeName() + "</ram:Name>\n";
                }
                xml = xml + "            </ram:PayeeTradeParty>\n";
            }
            if (!this.specifiedTradeSettlementPaymentMeans.getXML().equals("")) {
                xml = xml + this.specifiedTradeSettlementPaymentMeans.getXML();
            }
            if (!this.applicableTradeTax.getXML().equals("")) {
                xml = xml + this.applicableTradeTax.getXML();
            }
            if (!this.getInvoicingPeriodStartDate().equals("") || !this.getInvoicingPeriodEndDate().equals("")) {
                xml = xml + "            <ram:BillingSpecifiedPeriod>  \n";
                if (!this.getInvoicingPeriodStartDate().equals("")) {
                    xml = xml + "                <ram:StartDateTime>\n"
                            + "                    <udt:DateTimeString format=\"102\">" + this.getInvoicingPeriodStartDate() + "</udt:DateTimeString>\n"
                            + "                </ram:StartDateTime>\n";
                }
                if (!this.getInvoicingPeriodEndDate().equals("")) {
                    xml = xml + "                <ram:EndDateTime>\n"
                            + "                    <udt:DateTimeString format=\"102\">" + this.getInvoicingPeriodEndDate() + "</udt:DateTimeString>\n"
                            + "                </ram:EndDateTime>\n";
                }
                xml = xml + "            </ram:BillingSpecifiedPeriod>\n";
            }
            if (!this.specifiedTradeCharge.getXML().equals("")) {
                xml = xml + this.specifiedTradeCharge.getXML();
            }
            if (!this.specifiedTradeAllowance.getXML().equals("")) {
                xml = xml + this.specifiedTradeAllowance.getXML();
            }
            if (!this.getPaymentTerms().equals("") || !this.getPaymentDueDate().equals("")
                    || !this.getMandateReferenceIdentifier().equals("")) {
                xml = xml + "            <ram:SpecifiedTradePaymentTerms>\n";
                if (!this.getPaymentTerms().equals("")) {
                    xml = xml + "                <ram:Description>" + this.getPaymentTerms() + "</ram:Description>\n";
                }
                if (!this.getPaymentDueDate().equals("")) {
                    xml = xml + "                <ram:DueDateDateTime>\n"
                            + "                    <udt:DateTimeString format=\"102\">" + this.getPaymentDueDate() + "</udt:DateTimeString>\n"
                            + "                </ram:DueDateDateTime>            \n";
                }
                if (!this.getMandateReferenceIdentifier().equals("")) {
                    xml = xml + "                <ram:DirectDebitMandateID>" + this.getMandateReferenceIdentifier() + "</ram:DirectDebitMandateID>\n";
                }
                xml = xml + "            </ram:SpecifiedTradePaymentTerms>\n";
            }
            xml = xml + "        </ram:ApplicableHeaderTradeSettlement>\n";
        }
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
