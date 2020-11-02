/*
 * Mladen Sikiric
 * Höcker Project Managers GmbH
 */
package com.hoecker.xrechnung.XML;

import com.hoecker.xrechnung.pojos.InvoiceLine;
import com.hoecker.xrechnung.pojos.ItemAttributes;
import com.hoecker.xrechnung.utils.InvoiceHelper;
import java.util.List;

/**
 *
 * @author Sikiric
 */
public class XMLSpecifiedTradeProduct {

    private final String invoiceLineIdentifier;
    private final String invoiceLineNote;
    //private final String itemStandardIdentifier;
    //private final String itemStandardIdentifierIdentificationSchemeIdentifier;
    private final String itemSellersIdentifier;
    private final String itemBuyersIdentifier;
    private final String itemName;
    private final String itemDescreption;
    private final List<ItemAttributes> itemAttributesList;
    //private final String itemClassificationIdentifier;
    //private final String itemClassificationIdentifierIdentificationSchemeIdentifier;
    //private final String schemeVersionIdentifer;
    private final String itemCountryOfOrigin;

    public XMLSpecifiedTradeProduct(InvoiceLine il) {
        this.invoiceLineIdentifier = il.getInvoiceLineIdentifier();
        this.invoiceLineNote = il.getInvoiceLineNote();
        this.itemSellersIdentifier = il.getItemInformation().getItemSellersIdentifier();
        this.itemBuyersIdentifier = il.getItemInformation().getItemBuyersIdentifier();
        this.itemName = il.getItemInformation().getItemName();
        this.itemDescreption = il.getItemInformation().getItemDescription();
        this.itemAttributesList = il.getItemInformation().getItemAttributesList();
        this.itemCountryOfOrigin = il.getItemInformation().getItemCountryOfOrigin();
    }

    public String getXML() {
        String xml = "            <ram:SpecifiedTradeProduct>\n";
        if (!InvoiceHelper.returnEmptyStringOnNull(this.getItemSellersIdentifier()).equals("")) {
            xml = xml + "                <ram:SellerAssignedID>" + this.getItemSellersIdentifier() + "</ram:SellerAssignedID>\n";
        }
        if (!InvoiceHelper.returnEmptyStringOnNull(this.getItemBuyersIdentifier()).equals("")) {
            xml = xml + "                <ram:BuyerAssignedID>" + this.getItemBuyersIdentifier() + "</ram:BuyerAssignedID>\n";
        }
        xml = xml + "                <ram:Name>" + this.getItemName() + "</ram:Name>\n";
        if (!InvoiceHelper.returnEmptyStringOnNull(this.getItemDescreption()).equals("")) {
            xml = xml + "                <ram:Description>" + this.getItemDescreption() + "</ram:Description>\n";
        }
        if (itemAttributesList != null && !itemAttributesList.isEmpty()) {
            for (ItemAttributes ia : itemAttributesList) {
                xml = xml + "                <ram:ApplicableProductCharacteristic>\n"
                        + "                    <ram:Description>" + ia.getItemAttributeName() + "</ram:Description>\n"
                        + "                    <ram:Value>" + ia.getItemAttributeValue() + "</ram:Value>                                                                                \n"
                        + "                </ram:ApplicableProductCharacteristic>\n";
            }
        }
        if (!InvoiceHelper.returnEmptyStringOnNull(this.getItemCountryOfOrigin()).equals("")) {
            xml = xml + "                <ram:OriginTradeCountry>\n"
                    + "                    <ram:ID>" + this.getItemCountryOfOrigin() + "</ram:ID>\n"
                    + "                </ram:OriginTradeCountry>\n";
        }
        xml = xml + "            </ram:SpecifiedTradeProduct>\n";
        return xml;
    }

    public String getInvoiceLineIdentifier() {
        return invoiceLineIdentifier;
    }

    public String getInvoiceLineNote() {
        return invoiceLineNote;
    }

    public String getItemSellersIdentifier() {
        return itemSellersIdentifier;
    }

    public String getItemBuyersIdentifier() {
        return itemBuyersIdentifier;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDescreption() {
        return itemDescreption;
    }

    public List<ItemAttributes> getItemAttributesList() {
        return itemAttributesList;
    }

    public String getItemCountryOfOrigin() {
        return itemCountryOfOrigin;
    }

}
