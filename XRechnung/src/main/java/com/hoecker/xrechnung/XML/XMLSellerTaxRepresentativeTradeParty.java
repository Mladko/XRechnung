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
public class XMLSellerTaxRepresentativeTradeParty {

    private final String sellerTaxRepresentativeName;
    private final String sellerTaxRepresentativeVATidentifier;
    private final String taxRepresentativePostcode;
    private final String taxRepresentativeAddressline1;
    private final String taxRepresentativeAddressline2;
    private final String taxRepresentativeAddressline3;
    private final String taxRepresentativeCity;
    private final String taxRepresentativeCountryCode;
    private final String taxRepresentativeCountrySubdivision;

    public XMLSellerTaxRepresentativeTradeParty(Invoice i) {
        this.sellerTaxRepresentativeName = i.getSellerTaxRepresentativeParty().getRepresentativeName();
        this.sellerTaxRepresentativeVATidentifier = i.getSellerTaxRepresentativeParty().getRepresentativeVATidentifier();
        this.taxRepresentativePostcode = i.getSellerTaxRepresentativeParty().getSellerTaxRepresentativePostalAddress().getRepresentativePostCode();
        this.taxRepresentativeAddressline1 = i.getSellerTaxRepresentativeParty().getSellerTaxRepresentativePostalAddress().getRepresentativeAddressLine1();
        this.taxRepresentativeAddressline2 = i.getSellerTaxRepresentativeParty().getSellerTaxRepresentativePostalAddress().getRepresentativeAddressLine2();
        this.taxRepresentativeAddressline3 = i.getSellerTaxRepresentativeParty().getSellerTaxRepresentativePostalAddress().getRepresentativeAddressLine3();
        this.taxRepresentativeCity = i.getSellerTaxRepresentativeParty().getSellerTaxRepresentativePostalAddress().getRepresentativeCity();
        this.taxRepresentativeCountryCode = i.getSellerTaxRepresentativeParty().getSellerTaxRepresentativePostalAddress().getRepresentativeCountryCode();
        this.taxRepresentativeCountrySubdivision = i.getSellerTaxRepresentativeParty().getSellerTaxRepresentativePostalAddress().getRepresentativeCountrySubdivision();
    }

    String getXML() {
        String xml = "";
        if (!this.getSellerTaxRepresentativeName().equals("") || !this.getSellerTaxRepresentativeVATidentifier().equals("")
                || !this.getTaxRepresentativePostcode().equals("") || !this.getTaxRepresentativeAddressline1().equals("")
                || !this.getTaxRepresentativeAddressline2().equals("") || !this.getTaxRepresentativeAddressline3().equals("")
                || !this.getTaxRepresentativeCity().equals("") || !this.getTaxRepresentativeCountryCode().equals("")
                || !this.getTaxRepresentativeCountrySubdivision().equals("")) {
            xml = xml + "            <ram:SellerTaxRepresentativeTradeParty>\n"
                    + "                <ram:Name>" + this.getSellerTaxRepresentativeName() + "</ram:Name>\n"
                    + "                <ram:SpecifiedLegalOrganization>  \n"
                    + "                    <ram:ID schemeID=\"VA\">" + this.getSellerTaxRepresentativeVATidentifier() + "</ram:ID>\n"
                    + "                </ram:SpecifiedLegalOrganization>\n"
                    + "                <ram:PostalTradeAddress>\n";
            if (!this.getTaxRepresentativePostcode().equals("")) {
                xml = xml + "                    <ram:PostcodeCode>" + this.getTaxRepresentativePostcode() + "</ram:PostcodeCode>\n";
            }
            if (!this.getTaxRepresentativeAddressline1().equals("")) {
                xml = xml + "                    <ram:LineOne>" + this.getTaxRepresentativeAddressline1() + "</ram:LineOne>\n";
            }
            if (!this.getTaxRepresentativeAddressline2().equals("")) {
                xml = xml + "                    <ram:LineTwo>" + this.getTaxRepresentativeAddressline2() + "</ram:LineTwo>\n";
            }
            if (!this.getTaxRepresentativeAddressline3().equals("")) {
                xml = xml + "                    <ram:LineThree>" + this.getTaxRepresentativeAddressline3() + "</ram:LineThree>\n";
            }
            if (!this.getTaxRepresentativeCity().equals("")) {
                xml = xml + "                    <ram:CityName>" + this.getTaxRepresentativeCity() + "</ram:CityName>\n";
            }
            xml = xml + "                    <ram:CountryID>" + this.getTaxRepresentativeCountryCode() + "</ram:CountryID>\n";
            if (!this.getTaxRepresentativeCountrySubdivision().equals("")) {
                xml = xml + "                    <ram:CountrySubDivisionName>" + this.getTaxRepresentativeCountrySubdivision() + "</ram:CountrySubDivisionName>\n";
            }
            xml = xml + "                </ram:PostalTradeAddress>\n"
                    + "            </ram:SellerTaxRepresentativeTradeParty>\n";
        }
        return xml;
    }

    public String getSellerTaxRepresentativeName() {
        return sellerTaxRepresentativeName;
    }

    public String getSellerTaxRepresentativeVATidentifier() {
        return sellerTaxRepresentativeVATidentifier;
    }

    public String getTaxRepresentativePostcode() {
        return taxRepresentativePostcode;
    }

    public String getTaxRepresentativeAddressline1() {
        return taxRepresentativeAddressline1;
    }

    public String getTaxRepresentativeAddressline2() {
        return taxRepresentativeAddressline2;
    }

    public String getTaxRepresentativeAddressline3() {
        return taxRepresentativeAddressline3;
    }

    public String getTaxRepresentativeCity() {
        return taxRepresentativeCity;
    }

    public String getTaxRepresentativeCountryCode() {
        return taxRepresentativeCountryCode;
    }

    public String getTaxRepresentativeCountrySubdivision() {
        return taxRepresentativeCountrySubdivision;
    }

}
