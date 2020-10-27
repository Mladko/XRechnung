/*
 * Mladen Sikiric
 * Höcker Project Managers GmbH
 */
package com.hoecker.xrechnung.XML;

import com.hoecker.xrechnung.pojos.InvoiceLine;

/**
 *
 * @author Sikiric
 */
public class XMLAssociatedDocumentLineDocument {

    private final String invoiceLineIdentifier;
    private final String invoiceLineNote;

    public XMLAssociatedDocumentLineDocument(InvoiceLine il) {
        this.invoiceLineIdentifier = il.getInvoiceLineIdentifier();
        this.invoiceLineNote = il.getInvoiceLineNote();
    }

    public String getInvoiceLineIdentifier() {
        return invoiceLineIdentifier;
    }

    public String getInvoiceLineNote() {
        return invoiceLineNote;
    }

    public String getXML() {
        String xml = "<ram:AssociatedDocumentLineDocument>\n"
                + "                <ram:LineID>" + this.getInvoiceLineIdentifier() + "</ram:LineID>\n";
        if (this.getInvoiceLineNote() != null && !this.getInvoiceLineNote().equals("")) {
            xml = xml + "                <ram:IncludedNote>\n"
                    + "                    <ram:Content>" + this.getInvoiceLineNote() + "</ram:Content>\n"
                    + "                </ram:IncludedNote>\n";
        }
        xml = xml + "            </ram:AssociatedDocumentLineDocument>\n";
        return xml;
    }

}
