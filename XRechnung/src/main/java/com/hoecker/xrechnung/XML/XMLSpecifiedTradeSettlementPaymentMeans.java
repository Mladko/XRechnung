/*
 * Mladen Sikiric
 * Höcker Project Managers GmbH
 */
package com.hoecker.xrechnung.XML;

import com.hoecker.xrechnung.pojos.CreditTransfer;
import com.hoecker.xrechnung.pojos.Invoice;
import com.hoecker.xrechnung.utils.InvoiceHelper;
import java.util.List;

/**
 *
 * @author Sikiric
 */
class XMLSpecifiedTradeSettlementPaymentMeans {

    private final String paymentMeansTypeCode;
    private final String paymentMeansText;
    private final String paymentCardPrimaryAccountNumber;
    private final String paymentCardHolderName;
    private final String debitedAccountIdentifier;
    private final List<CreditTransfer> creditTransferList;

    public XMLSpecifiedTradeSettlementPaymentMeans(Invoice i) {
        this.paymentMeansTypeCode = i.getPaymentInstructions().getPaymentMeansTypeCode();
        this.paymentMeansText = i.getPaymentInstructions().getPaymentMeansText();
        this.paymentCardPrimaryAccountNumber = i.getPaymentInstructions().getPaymentCardInformation().getPaymentCardPrimaryAccountNumber();
        this.paymentCardHolderName = i.getPaymentInstructions().getPaymentCardInformation().getPaymendCardHolderName();
        this.debitedAccountIdentifier = i.getPaymentInstructions().getDirectDebt().getDebitedAccountIdentifier();
        this.creditTransferList = i.getPaymentInstructions().getCreditTransferList();
    }

    public String getXML() {
        String xml = "            <ram:SpecifiedTradeSettlementPaymentMeans>\n"
                + "                <ram:TypeCode>" + this.getPaymentMeansTypeCode() + "</ram:TypeCode>\n";
        if (!InvoiceHelper.returnEmptyStringOnNull(this.getPaymentMeansText()).equals("")) {
            xml = xml + "                <ram:Information>" + this.getPaymentMeansText() + "</ram:Information>\n";
        }
        if (!InvoiceHelper.returnEmptyStringOnNull(this.getPaymentCardPrimaryAccountNumber()).equals("")) {
            xml = xml + "                <ram:ApplicableTradeSettlementFinancialCard>\n"
                    + "                    <ram:ID>" + this.getPaymentCardPrimaryAccountNumber() + "</ram:ID>\n";
            if (!InvoiceHelper.returnEmptyStringOnNull(this.getPaymentCardPrimaryAccountNumber()).equals("")) {
                xml = xml + "                    <ram:CardholderName>" + this.getPaymentCardHolderName() + "</ram:CardholderName>\n";
            }
            xml = xml + "                </ram:ApplicableTradeSettlementFinancialCard>\n";
        }
        if (!InvoiceHelper.returnEmptyStringOnNull(this.getDebitedAccountIdentifier()).equals("")) {
            xml = xml + "                <ram:PayerPartyDebtorFinancialAccount>\n"
                    + "                    <ram:IBANID>" + this.getDebitedAccountIdentifier() + "</ram:IBANID>\n"
                    + "                </ram:PayerPartyDebtorFinancialAccount>\n";

            if (this.creditTransferList != null && !this.creditTransferList.isEmpty()) {
                for (CreditTransfer ct : creditTransferList) {
                    xml = xml + "                <ram:PayeePartyCreditorFinancialAccount>\n"
                            + "                    <ram:IBANID>" + ct.getPaymentAccountIdentifier() + "</ram:IBANID>\n";
                    if (!InvoiceHelper.returnEmptyStringOnNull(ct.getPaymentAccountName()).equals("")) {
                        xml = xml + "                    <ram:AccountName>" + ct.getPaymentAccountName() + "</ram:AccountName>\n";
                    }
                    xml = xml + "                </ram:PayeePartyCreditorFinancialAccount>\n";
                    if (!InvoiceHelper.returnEmptyStringOnNull(ct.getPaymentServiceProviderIdentifier()).equals("")) {
                        xml = xml + "                <ram:PayeeSpecifiedCreditorFinancialInstitution>\n"
                                + "                    <ram:BICID>" + ct.getPaymentServiceProviderIdentifier() + "</ram:BICID>\n"
                                + "                </ram:PayeeSpecifiedCreditorFinancialInstitution>\n";
                    }
                }
            }
        }
        xml = xml + "            </ram:SpecifiedTradeSettlementPaymentMeans>\n";
        return xml;
    }

    public String getPaymentMeansTypeCode() {
        return paymentMeansTypeCode;
    }

    public String getPaymentMeansText() {
        return paymentMeansText;
    }

    public String getPaymentCardPrimaryAccountNumber() {
        return paymentCardPrimaryAccountNumber;
    }

    public String getPaymentCardHolderName() {
        return paymentCardHolderName;
    }

    public String getDebitedAccountIdentifier() {
        return debitedAccountIdentifier;
    }

    public List<CreditTransfer> getCreditTransferList() {
        return creditTransferList;
    }

}
