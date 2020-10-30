/*
 * Mladen Sikiric
 * Höcker Project Managers GmbH
 */
package com.hoecker.xrechnung.XML;

import com.hoecker.xrechnung.pojos.Invoice;
import java.util.List;

/**
 *
 * @author Sikiric
 */
public class XMLBuyerTradeParty {
    private final String buyerIdentifier;  
    private final String buyerName;
    private final String buyerLegalRegistrationIdentifier;
    private final String buyerTradingName;
    private final String buyerContactPoint;
    private final String buyerContactTelephonenumber;
    private final String buyerContactEmailaddress;
    private final String buyerPostcode;
    private final String buyerAddressline1;
    private final String buyerAddressline2;
    private final String buyerAddressline3;
    private final String buyerCity;
    private final String buyerCountryCodes;
    private final String buyerCountrySubdivision;
    private final String buyerElectronicaddress;
    private final String buyerElectronicaddressIdentificationSchemeIdentifier;
    private final String buyerVATidentifier;
    
    public XMLBuyerTradeParty(Invoice i) {
        this.buyerIdentifier = i.getBuyer().getBuyerIdentifier();
        this.buyerName = i.getBuyer().getBuyerName();        
        this.buyerLegalRegistrationIdentifier = i.getBuyer().getBuyerLegalRegistrationIdentifier();
        this.buyerTradingName = i.getBuyer().getBuyerTradingName();
        this.buyerContactPoint = i.getBuyer().getBuyerContact().getContactPoint();
        this.buyerContactTelephonenumber = i.getBuyer().getBuyerContact().getContactTelephoneNumber();
        this.buyerContactEmailaddress = i.getBuyer().getBuyerContact().getContactEmailAddress();
        this.buyerPostcode = i.getBuyer().getBuyerPostalAddress().getPostCode();
        this.buyerAddressline1 = i.getBuyer().getBuyerPostalAddress().getAddressLine1();
        this.buyerAddressline2 = i.getBuyer().getBuyerPostalAddress().getAddressLine2();
        this.buyerAddressline3 = i.getBuyer().getBuyerPostalAddress().getAddressLine3();
        this.buyerCity = i.getBuyer().getBuyerPostalAddress().getCity();
        this.buyerCountryCodes = i.getBuyer().getBuyerPostalAddress().getCountryCode();
        this.buyerCountrySubdivision = i.getBuyer().getBuyerPostalAddress().getCountrySubdivision();
        this.buyerElectronicaddress = i.getBuyer().getBuyerEletcronicAddress();
        this.buyerElectronicaddressIdentificationSchemeIdentifier = "EM";
        this.buyerVATidentifier = i.getBuyer().getBuyerVATidentifier();
    }
    public String getXML() {
       String xml = "<ram:BuyerTradeParty>\n";
        if (!this.buyerIdentifier.equals("")) {            
            xml = xml + "                <ram:ID>" + this.buyerIdentifier + "</ram:ID>\n";
        }
        xml = xml + "                <ram:Name>" + this.getBuyerName() + "</ram:Name>\n";       
        if (!this.getBuyerTradingName().equals("")) {
            xml = xml + "                <ram:SpecifiedLegalOrganization>\n"
                    + "                    <ram:TradingBusinessName>" + this.getBuyerTradingName() + "</ram:TradingBusinessName>\n"
                    + "                </ram:SpecifiedLegalOrganization>\n";
        }
        xml = xml + "                <ram:DefinedTradeContact>\n"
                + "                    <ram:PersonName>" + this.getBuyerContactPoint() + "</ram:PersonName>\n"
                + "                    <ram:TelephoneUniversalCommunication>\n"
                + "                        <ram:CompleteNumber>" + this.getBuyerContactTelephonenumber() + "</ram:CompleteNumber>\n"
                + "                    </ram:TelephoneUniversalCommunication>\n"
                + "                    <ram:EmailURIUniversalCommunication>\n"
                + "                        <ram:URIID>" + this.getBuyerContactEmailaddress() + "</ram:URIID>\n"
                + "                    </ram:EmailURIUniversalCommunication>\n"
                + "                </ram:DefinedTradeContact>\n";
        xml = xml + "                <ram:PostalTradeAddress>\n"
                + "                    <ram:PostcodeCode>" + this.getBuyerPostcode() + "</ram:PostcodeCode>\n";
        if (!this.getBuyerAddressline1().equals("")) {
            xml = xml + "                    <ram:LineOne>" + this.getBuyerAddressline1() + "</ram:LineOne>\n";
        }
        if (!this.getBuyerAddressline2().equals("")) {
            xml = xml + "                    <ram:LineTwo>" + this.getBuyerAddressline2() + "</ram:LineTwo>\n";
        }
        if (!this.getBuyerAddressline3().equals("")) {
            xml = xml + "                    <ram:LineThree>" + this.getBuyerAddressline3() + "</ram:LineThree>\n";
        }
        xml = xml + "                    <ram:CityName>" + this.getBuyerCity() + "</ram:CityName>\n"
                + "                    <ram:CountryID>" + this.getBuyerCountryCodes() + "</ram:CountryID>\n";
        if (!this.getBuyerCountrySubdivision().equals("")) {
            xml = xml + "                    <ram:CountrySubDivisionName>" + this.getBuyerCountrySubdivision() + "</ram:CountrySubDivisionName>\n";
        }
        xml = xml + "                </ram:PostalTradeAddress>\n";
        if (!this.getBuyerElectronicaddress().equals("")) {
            xml = xml + "                <ram:URIUniversalCommunication>\n"
                    + "                    <ram:URIID schemeID=\"" + this.getBuyerElectronicaddressIdentificationSchemeIdentifier() + "\">"
                    + this.getBuyerElectronicaddress() + "</ram:URIID>\n"
                    + "                </ram:URIUniversalCommunication>  \n";
        }
        if (!this.getBuyerVATidentifier().equals("")) {
            xml = xml + "                <ram:SpecifiedTaxRegistration>\n"
                    + "                    <ram:ID schemeID=\"VA\">" + this.getBuyerVATidentifier() + "</ram:ID>\n"
                    + "                </ram:SpecifiedTaxRegistration>   \n";
        }        
        xml = xml + "            </ram:BuyerTradeParty>\n";
       return xml;
    }

    public String getBuyerIdentifier() {
        return buyerIdentifier;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public String getBuyerLegalRegistrationIdentifier() {
        return buyerLegalRegistrationIdentifier;
    }

    public String getBuyerTradingName() {
        return buyerTradingName;
    }

    public String getBuyerContactPoint() {
        return buyerContactPoint;
    }

    public String getBuyerContactTelephonenumber() {
        return buyerContactTelephonenumber;
    }

    public String getBuyerContactEmailaddress() {
        return buyerContactEmailaddress;
    }

    public String getBuyerPostcode() {
        return buyerPostcode;
    }

    public String getBuyerAddressline1() {
        return buyerAddressline1;
    }

    public String getBuyerAddressline2() {
        return buyerAddressline2;
    }

    public String getBuyerAddressline3() {
        return buyerAddressline3;
    }

    public String getBuyerCity() {
        return buyerCity;
    }

    public String getBuyerCountryCodes() {
        return buyerCountryCodes;
    }

    public String getBuyerCountrySubdivision() {
        return buyerCountrySubdivision;
    }

    public String getBuyerElectronicaddress() {
        return buyerElectronicaddress;
    }

    public String getBuyerElectronicaddressIdentificationSchemeIdentifier() {
        return buyerElectronicaddressIdentificationSchemeIdentifier;
    }

    public String getBuyerVATidentifier() {
        return buyerVATidentifier;
    }
    
}
