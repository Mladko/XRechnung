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
public class XMLSellerTradeParty {

    private final List<String> sellerIdentifierList;
    private final String sellerName;
    private final String sellerAdditionalLegalInformation;
    private final String sellerLegalRegistrationIdentifier;
    private final String sellerTradingName;
    private final String sellerContactPoint;
    private final String sellerContactTelephonenumber;
    private final String sellerContactEmailaddress;
    private final String sellerPostcode;
    private final String sellerAddressline1;
    private final String sellerAddressline2;
    private final String sellerAddressline3;
    private final String sellerCity;
    private final String sellerCountryCodes;
    private final String sellerCountrySubdivision;
    private final String sellerElectronicaddress;
    private final String sellerElectronicaddressIdentificationSchemeIdentifier;
    private final String sellerVATidentifier;
    private final String sellerTaxregistrationIdentifier;

    public XMLSellerTradeParty(Invoice i) {
        this.sellerIdentifierList = i.getSeller().getSellerIdentifierList();
        this.sellerName = i.getSeller().getSellerName();
        this.sellerAdditionalLegalInformation = i.getSeller().getSellerAdditionalLegalInformation();
        this.sellerLegalRegistrationIdentifier = i.getSeller().getSellerLegalRegistrationIdentifier();
        this.sellerTradingName = i.getSeller().getSellerTradingName();
        this.sellerContactPoint = i.getSeller().getSellerContact().getSellerContactPoint();
        this.sellerContactTelephonenumber = i.getSeller().getSellerContact().getSellecrContactTelephoneNumber();
        this.sellerContactEmailaddress = i.getSeller().getSellerContact().getSellerContactEmailaddress();
        this.sellerPostcode = i.getSeller().getSellerPostalAddress().getSellerPostCode();
        this.sellerAddressline1 = i.getSeller().getSellerPostalAddress().getSellerAddressLine1();
        this.sellerAddressline2 = i.getSeller().getSellerPostalAddress().getSellerAddressLine2();
        this.sellerAddressline3 = i.getSeller().getSellerPostalAddress().getSellerAddressLine3();
        this.sellerCity = i.getSeller().getSellerPostalAddress().getSellerCity();
        this.sellerCountryCodes = i.getSeller().getSellerPostalAddress().getSellerCountryCode();
        this.sellerCountrySubdivision = i.getSeller().getSellerPostalAddress().getSellerCountrySubdivision();
        this.sellerElectronicaddress = i.getSeller().getSellerElectronicAddress();
        this.sellerElectronicaddressIdentificationSchemeIdentifier = "EM";
        this.sellerVATidentifier = i.getSeller().getSellerVatIdentifier();
        this.sellerTaxregistrationIdentifier = i.getSeller().getSellerTaxRegistrationIdentifier();
    }

    public String getXML() {
        String xml = "            <ram:SellerTradeParty>\n";
        if (this.getSellerIdentifierList() != null && !this.getSellerIdentifierList().isEmpty()) {
            String ids = "";
            for (String id : this.getSellerIdentifierList()) {
                ids = ids + id;
            }
            xml = xml + "                <ram:ID>" + ids + "</ram:ID>\n";
        }
        xml = xml + "                <ram:Name>" + this.getSellerName() + "</ram:Name>\n";
        if (!this.getSellerAdditionalLegalInformation().equals("")) {
            xml = xml + "                <ram:Description>" + this.getSellerAdditionalLegalInformation() + "</ram:Description>\n";
        }
        if (!this.getSellerTradingName().equals("")) {
            xml = xml + "                <ram:SpecifiedLegalOrganization>\n"
                    + "                    <ram:TradingBusinessName>" + this.getSellerTradingName() + "</ram:TradingBusinessName>\n"
                    + "                </ram:SpecifiedLegalOrganization>\n";
        }
        xml = xml + "                <ram:DefinedTradeContact>\n"
                + "                    <ram:PersonName>" + this.getSellerContactPoint() + "</ram:PersonName>\n"
                + "                    <ram:TelephoneUniversalCommunication>\n"
                + "                        <ram:CompleteNumber>" + this.getSellerContactTelephonenumber() + "</ram:CompleteNumber>\n"
                + "                    </ram:TelephoneUniversalCommunication>\n"
                + "                    <ram:EmailURIUniversalCommunication>\n"
                + "                        <ram:URIID>" + this.getSellerContactEmailaddress() + "</ram:URIID>\n"
                + "                    </ram:EmailURIUniversalCommunication>\n"
                + "                </ram:DefinedTradeContact>\n";
        xml = xml + "                <ram:PostalTradeAddress>\n"
                + "                    <ram:PostcodeCode>" + this.getSellerPostcode() + "</ram:PostcodeCode>\n";
        if (!this.getSellerAddressline1().equals("")) {
            xml = xml + "                    <ram:LineOne>" + this.getSellerAddressline1() + "</ram:LineOne>\n";
        }
        if (!this.getSellerAddressline2().equals("")) {
            xml = xml + "                    <ram:LineTwo>" + this.getSellerAddressline2() + "</ram:LineTwo>\n";
        }
        if (!this.getSellerAddressline3().equals("")) {
            xml = xml + "                    <ram:LineThree>" + this.getSellerAddressline3() + "</ram:LineThree>\n";
        }
        xml = xml + "                    <ram:CityName>" + this.getSellerCity() + "</ram:CityName>\n"
                + "                    <ram:CountryID>" + this.getSellerCountryCodes() + "</ram:CountryID>\n";
        if (!this.getSellerCountrySubdivision().equals("")) {
            xml = xml + "                    <ram:CountrySubDivisionName>" + this.getSellerCountrySubdivision() + "</ram:CountrySubDivisionName>\n";
        }
        xml = xml + "                </ram:PostalTradeAddress>\n";
        if (!this.getSellerElectronicaddress().equals("")) {
            xml = xml + "                <ram:URIUniversalCommunication>\n"
                    + "                    <ram:URIID schemeID=\"" + this.getSellerElectronicaddressIdentificationSchemeIdentifier() + "\">"
                    + this.getSellerElectronicaddress() + "</ram:URIID>\n"
                    + "                </ram:URIUniversalCommunication>  \n";
        }
        if (!this.getSellerVATidentifier().equals("")) {
            xml = xml + "                <ram:SpecifiedTaxRegistration>\n"
                    + "                    <ram:ID schemeID=\"VA\">" + this.getSellerVATidentifier() + "</ram:ID>\n"
                    + "                </ram:SpecifiedTaxRegistration>   \n";
        }
        if (!this.getSellerTaxregistrationIdentifier().equals("")) {
            xml = xml + "                <ram:SpecifiedTaxRegistration>                    \n"
                    + "                    <ram:ID schemeID=\"FC\">" + this.getSellerTaxregistrationIdentifier() + "</ram:ID>\n"
                    + "                </ram:SpecifiedTaxRegistration>   \n";
        }
        xml = xml + "            </ram:SellerTradeParty>\n";
        return xml;
    }

    public List<String> getSellerIdentifierList() {
        return sellerIdentifierList;
    }

    public String getSellerName() {
        return sellerName;
    }

    public String getSellerAdditionalLegalInformation() {
        return sellerAdditionalLegalInformation;
    }

    public String getSellerLegalRegistrationIdentifier() {
        return sellerLegalRegistrationIdentifier;
    }

    public String getSellerTradingName() {
        return sellerTradingName;
    }

    public String getSellerContactPoint() {
        return sellerContactPoint;
    }

    public String getSellerContactTelephonenumber() {
        return sellerContactTelephonenumber;
    }

    public String getSellerContactEmailaddress() {
        return sellerContactEmailaddress;
    }

    public String getSellerPostcode() {
        return sellerPostcode;
    }

    public String getSellerAddressline1() {
        return sellerAddressline1;
    }

    public String getSellerAddressline2() {
        return sellerAddressline2;
    }

    public String getSellerAddressline3() {
        return sellerAddressline3;
    }

    public String getSellerCity() {
        return sellerCity;
    }

    public String getSellerCountryCodes() {
        return sellerCountryCodes;
    }

    public String getSellerCountrySubdivision() {
        return sellerCountrySubdivision;
    }

    public String getSellerElectronicaddress() {
        return sellerElectronicaddress;
    }

    public String getSellerElectronicaddressIdentificationSchemeIdentifier() {
        return sellerElectronicaddressIdentificationSchemeIdentifier;
    }

    public String getSellerVATidentifier() {
        return sellerVATidentifier;
    }

    public String getSellerTaxregistrationIdentifier() {
        return sellerTaxregistrationIdentifier;
    }

}
