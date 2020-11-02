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
public class LineVATinformation {

    private final String invoicedItemVATcategoryCode;
    private String invoicedItemVATrate = "";

    public LineVATinformation(String invoicedItemVATcategoryCode) {
        this.invoicedItemVATcategoryCode = invoicedItemVATcategoryCode;
    }

    public String getInvoicedItemVATcategoryCode() {
        return invoicedItemVATcategoryCode;
    }

    public String getInvoicedItemVATrate() {
        return invoicedItemVATrate;
    }

    public void setInvoicedItemVATrate(String invoicedItemVATrate) {
        this.invoicedItemVATrate = invoicedItemVATrate;
    }

}
