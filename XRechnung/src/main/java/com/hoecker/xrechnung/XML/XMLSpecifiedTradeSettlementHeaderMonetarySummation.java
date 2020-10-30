/*
 * Mladen Sikiric
 * Höcker Project Managers GmbH
 */
package com.hoecker.xrechnung.XML;

import com.hoecker.xrechnung.pojos.CreditTransfer;
import com.hoecker.xrechnung.pojos.Invoice;
import java.util.List;

/**
 *
 * @author Sikiric
 */
public class XMLSpecifiedTradeSettlementHeaderMonetarySummation {

    private final String paymentMeansTypeCode;
    private final String paymentMeansText;
    private final String paymentCardPrimaryAccountNumber;
    private final String paymentCardHolderName;
    private final String debitedAccountIdentifier;
    private final List<CreditTransfer> creditTransferList;

    public XMLSpecifiedTradeSettlementHeaderMonetarySummation(Invoice i) {
        this.paymentMeansTypeCode = i.getPaymentInstructions().getPaymentMeansTypeCode();
        this.paymentMeansText = i.getPaymentInstructions().getPaymentMeansText();
        this.paymentCardPrimaryAccountNumber = i.getPaymentInstructions().getPaymentCardInformation().getPaymentCardPrimaryAccountNumber();
        this.paymentCardHolderName = i.getPaymentInstructions().getPaymentCardInformation().getPaymendCardHolderName();
        this.debitedAccountIdentifier = i.getPaymentInstructions().getDirectDebt().getDebitedAccountIdentifier();
        this.creditTransferList = i.getPaymentInstructions().getCreditTransferList();
    }

    public String getXML() {
        String xml = "            <ram:SpecifiedTradeSettlementPaymentMeans>\n"
                + "                <ram:TypeCode>" + this.getPaymentMeansTypeCode() + "</ram:TypeCode>\n"
                + "                <ram:Information>" + this.getPaymentMeansText() + "</ram:Information>\n"
                + "                <ram:ApplicableTradeSettlementFinancialCard>   \n"
                + "                    <ram:ID>" + this.getPaymentCardPrimaryAccountNumber() + "</ram:ID>\n"
                + "                    <ram:CardholderName>" + this.getPaymentCardHolderName() + "</ram:CardholderName>\n"
                + "                </ram:ApplicableTradeSettlementFinancialCard>\n"
                + "                <ram:PayerPartyDebtorFinancialAccount>\n"
                + "                    <ram:IBANID>" + this.getDebitedAccountIdentifier() + "</ram:IBANID>\n"
                + "                </ram:PayerPartyDebtorFinancialAccount>\n";

        if (creditTransferList != null && !creditTransferList.isEmpty()) {
            for (CreditTransfer creditTransfer : creditTransferList) {
                xml = xml + "                <ram:PayeePartyCreditorFinancialAccount>\n"
                        + "                    <ram:IBANID>" + creditTransfer.getPaymentAccountIdentifier() + "</ram:IBANID>\n";
                if (!creditTransfer.getPaymentAccountName().equals("")) {
                    xml = xml + "                    <ram:AccountName>" + creditTransfer.getPaymentAccountName() + "</ram:AccountName>\n";
                }
                xml = xml + "                </ram:PayeePartyCreditorFinancialAccount>\n";
                if (!creditTransfer.getPaymentServiceProviderIdentifier().equals("")) {
                    xml = xml + "                <ram:PayeeSpecifiedCreditorFinancialInstitution>\n"
                            + "                    <ram:BICID>" + creditTransfer.getPaymentServiceProviderIdentifier() + "</ram:BICID>\n"
                            + "                </ram:PayeeSpecifiedCreditorFinancialInstitution>\n";
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

}
