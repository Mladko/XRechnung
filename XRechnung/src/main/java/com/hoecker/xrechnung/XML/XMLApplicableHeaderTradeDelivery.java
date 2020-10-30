/*
 * Mladen Sikiric
 * Höcker Project Managers GmbH
 */
package com.hoecker.xrechnung.XML;

import com.hoecker.xrechnung.pojos.Invoice;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import org.apache.commons.lang.RandomStringUtils;

/**
 *
 * @author Sikiric
 */
public class XMLApplicableHeaderTradeDelivery {

    private final String deliverToLocationIdentifier;
    //private final String deliverToLocationIdentifierIdentificationSchemeIdentifier;
    private final String deliverToPartyname;
    private final String deliverToPostcode;
    private final String deliverToAddressline1;
    private final String deliverToAddressline2;
    private final String deliverToAddressline3;
    private final String deliverToCity;
    private final String deliverToCountryCode;
    private final String deliverToCountrySubdivision;
    private final String actualDeliveryDate;
    private final String despatchAdviceReference;
    private final String receivingAdviceReference;

    public XMLApplicableHeaderTradeDelivery(Invoice i) {
        this.deliverToLocationIdentifier = i.getDeliveryInformation().getDeliverToLocationIdentifier();
        this.deliverToPartyname = i.getDeliveryInformation().getDeliverToPartyName();
        this.deliverToPostcode = i.getDeliveryInformation().getDeliverToAddress().getDeliverToPostCode();
        this.deliverToAddressline1 = i.getDeliveryInformation().getDeliverToAddress().getDeliverToAddressLine1();
        this.deliverToAddressline2 = i.getDeliveryInformation().getDeliverToAddress().getDeliverToAddressLine2();
        this.deliverToAddressline3 = i.getDeliveryInformation().getDeliverToAddress().getDeliverToAddressLine3();
        this.deliverToCity = i.getDeliveryInformation().getDeliverToAddress().getDeliverToCity();
        this.deliverToCountryCode = i.getDeliveryInformation().getDeliverToAddress().getDeliverToCountryCode();
        this.deliverToCountrySubdivision = i.getDeliveryInformation().getDeliverToAddress().getDeliverToCountrySubdivision();
        DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        this.actualDeliveryDate = formatter.format(i.getDeliveryInformation().getActualDeliveryDate());
        this.despatchAdviceReference = i.getDesptachAdviceReference();
        this.receivingAdviceReference = i.getReceivingAdvieReference();
    }

    public String getXML() {
        String xml = "        <ram:ApplicableHeaderTradeDelivery>\n"
                + "            <ram:ShipToTradeParty>\n";
        if (!this.getDeliverToLocationIdentifier().equals("")) {
            xml = xml + "                <ram:ID>" + this.getDeliverToLocationIdentifier() + "</ram:ID>\n";
        }
        if (!this.getDeliverToPartyname().equals("")) {
            xml = xml + "                <ram:Name>" + this.getDeliverToPartyname() + "</ram:Name>\n";
        }
        if (!this.getDeliverToPostcode().equals("") && !this.getDeliverToCity().equals("") && !this.getDeliverToCountryCode().equals("")) {
            xml = xml + "                <ram:PostalTradeAddress>\n"
                    + "                    <ram:PostcodeCode>" + this.getDeliverToPostcode() + "</ram:PostcodeCode>\n";
            if (!this.getDeliverToAddressline1().equals("")) {
                xml = xml + "                    <ram:LineOne>" + this.getDeliverToAddressline1() + "</ram:LineOne>\n";
            }
            if (!this.getDeliverToAddressline2().equals("")) {
                xml = xml + "                    <ram:LineTwo>" + this.getDeliverToAddressline2() + "</ram:LineTwo>\n";
            }
            if (!this.getDeliverToAddressline3().equals("")) {
                xml = xml + "                    <ram:LineThree>" + this.getDeliverToAddressline3() + "</ram:LineThree>\n";
            }
            xml = xml + "                    <ram:CityName>" + this.getDeliverToCity() + "</ram:CityName>\n"
                    + "                    <ram:CountryID>" + this.getDeliverToCountryCode() + "</ram:CountryID>\n";
            if (!this.getDeliverToCountrySubdivision().equals("")) {
                xml = xml + "                    <ram:CountrySubDivisionName>" + this.getDeliverToCountrySubdivision() + "</ram:CountrySubDivisionName>\n";
            }
            xml = xml + "                </ram:PostalTradeAddress>\n";
        }
        xml = xml + "            </ram:ShipToTradeParty>\n";
        if (!this.getActualDeliveryDate().equals("")) {
            xml = xml + "            <ram:ActualDeliverySupplyChainEvent>\n"
                    + "            <ram:ActualDeliverySupplyChainEvent>\n"
                    + "                <ram:OccurrenceDateTime>\n"
                    + "                    <udt:DateTimeString format=\"102\">" + this.getActualDeliveryDate() + "</udt:DateTimeString>\n"
                    + "                </ram:OccurrenceDateTime>\n"
                    + "            </ram:ActualDeliverySupplyChainEvent>\n";
        }
        if (!this.getDespatchAdviceReference().equals("")) {
            xml = xml + "            <ram:DespatchAdviceReferencedDocument>\n"
                    + "                <ram:IssuerAssignedID>" + this.getDespatchAdviceReference() + "</ram:IssuerAssignedID>\n"
                    + "            </ram:DespatchAdviceReferencedDocument>\n";
        }
        if (!this.getReceivingAdviceReference().equals("")) {
            xml = xml + "            <ram:ReceivingAdviceReferencedDocument>\n"
                    + "                <ram:IssuerAssignedID>" + this.getReceivingAdviceReference() + "</ram:IssuerAssignedID>       \n"
                    + "            </ram:ReceivingAdviceReferencedDocument>\n";
        }
        xml = xml + "        </ram:ApplicableHeaderTradeDelivery>\n";
        return xml;
    }

    public String getDeliverToLocationIdentifier() {
        return deliverToLocationIdentifier;
    }

    public String getDeliverToPartyname() {
        return deliverToPartyname;
    }

    public String getDeliverToPostcode() {
        return deliverToPostcode;
    }

    public String getDeliverToAddressline1() {
        return deliverToAddressline1;
    }

    public String getDeliverToAddressline2() {
        return deliverToAddressline2;
    }

    public String getDeliverToAddressline3() {
        return deliverToAddressline3;
    }

    public String getDeliverToCity() {
        return deliverToCity;
    }

    public String getDeliverToCountryCode() {
        return deliverToCountryCode;
    }

    public String getDeliverToCountrySubdivision() {
        return deliverToCountrySubdivision;
    }

    public String getActualDeliveryDate() {
        return actualDeliveryDate;
    }

    public String getDespatchAdviceReference() {
        return despatchAdviceReference;
    }

    public String getReceivingAdviceReference() {
        return receivingAdviceReference;
    }

}
