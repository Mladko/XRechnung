/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoecker.xrechnung.pojos;

/**
 *
 * @author Sikiric
 */
public class SellerTaxRepresentativeParty {
    //Attribute
    private final String representativeName;
    private final String representativeVATidentifier;
    
    //Klassen
    private final SellerTaxRepresentativePostalAddress sellerTaxRepresentativePostalAddress;

    public SellerTaxRepresentativeParty(String representativeName, String representativeVATidentifier, SellerTaxRepresentativePostalAddress sellerTaxRepresentativePostalAddress) {
        this.representativeName = representativeName;
        this.representativeVATidentifier = representativeVATidentifier;
        this.sellerTaxRepresentativePostalAddress = sellerTaxRepresentativePostalAddress;
    }

    public String getRepresentativeName() {
        return representativeName;
    }

    public String getRepresentativeVATidentifier() {
        return representativeVATidentifier;
    }

    public SellerTaxRepresentativePostalAddress getSellerTaxRepresentativePostalAddress() {
        return sellerTaxRepresentativePostalAddress;
    }
    
}
