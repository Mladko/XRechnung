/*
 * Mladen Sikiric
 * Höcker Project Managers GmbH
 */
package com.hoecker.xrechnung.controller;

import com.hoecker.xrechnung.XML.XMLExchangedDocumentContext;
import com.hoecker.xrechnung.XML.XMLExchangedDocument;
import com.hoecker.xrechnung.XML.XMLSupplyChainTradeTransaction;
import com.hoecker.xrechnung.pojos.Buyer;
import com.hoecker.xrechnung.pojos.BuyerPostalAddress;
import com.hoecker.xrechnung.pojos.DocumentTotals;
import com.hoecker.xrechnung.pojos.Invoice;
import com.hoecker.xrechnung.pojos.InvoiceLine;
import com.hoecker.xrechnung.pojos.ItemInformation;
import com.hoecker.xrechnung.pojos.LineVATinformation;
import com.hoecker.xrechnung.pojos.PaymentInstructions;
import com.hoecker.xrechnung.pojos.PriceDetails;
import com.hoecker.xrechnung.pojos.ProcessControl;
import com.hoecker.xrechnung.pojos.Seller;
import com.hoecker.xrechnung.pojos.SellerPostalAddress;
import com.hoecker.xrechnung.pojos.SellerContact;
import com.hoecker.xrechnung.pojos.VatBreakdown;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sikiric
 */
public class XRechnungXML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        OutputStream outputStream = null;
        try {
            // TODO code application logic here
            Invoice i = XRechnungXML.createInvoice();
            String xml = XRechnungXML.createXMLfromInvoice(i);
            System.out.println(xml);
            outputStream = new FileOutputStream("D:\\invoice.xml");
            try (OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8")) {
                outputStreamWriter.write(xml);
            }
            outputStream.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(XRechnungXML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(XRechnungXML.class.getName()).log(Level.SEVERE, null, ex);        
        }

    }

    private static Invoice createInvoice() {

        ProcessControl processControl = new ProcessControl("urn:cen.eu:en16931:2017");
        SellerPostalAddress sellerContact = new SellerPostalAddress("Oberhausen", "46119", "DE");
        SellerContact sellerPostalAddress = new SellerContact("Name des Kontakts", "Telefonnummer des Kontakts", "Emailadresse des Kontakts");
        Seller seller = new Seller("Firmenname", sellerContact, sellerPostalAddress);
        BuyerPostalAddress buyerPostalAddress = new BuyerPostalAddress("Name des Kontakts", "Telefonnummer des Kontakts", "Emailadresse des Kontakts");
        Buyer buyer = new Buyer("Firmenname", buyerPostalAddress);
        PaymentInstructions paymentInstructions = new PaymentInstructions("58");
        DocumentTotals documentTotals = new DocumentTotals("100.00", "100.00", "116.00");
        List<VatBreakdown> vatBreakdownList = new ArrayList<>();
        VatBreakdown vatBreakdown = new VatBreakdown("100.00", "116.00", "S", "16.00");
        vatBreakdownList.add(vatBreakdown);
        List<InvoiceLine> invoiceLineList = new ArrayList<>();
        PriceDetails priceDetails = new PriceDetails("100.00");
        LineVATinformation lineVATinformation = new LineVATinformation("S");
        ItemInformation itemInformation = new ItemInformation("Name des Produkts");
        InvoiceLine invoiceLine = new InvoiceLine("Bezeichner der Rechnungsposition", "1", "Liter",
                "100", priceDetails, lineVATinformation, itemInformation);
        invoiceLineList.add(invoiceLine);
        Invoice i = new Invoice("Rechnungsnummer", "20201030", "380", "EUR", "Hier steht der Empfänger",
                processControl, seller, buyer, paymentInstructions, documentTotals, vatBreakdownList, invoiceLineList);

        return i;
    }

    /*
    Aufruf der XMLKlassen zum Erzeugen des XMLs
     */
    public static String createXMLfromInvoice(Invoice i) {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
                + "<rsm:CrossIndustryInvoice xmlns:ram=\"urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100\"\n"
                + " xmlns:qdt=\"urn:un:unece:uncefact:data:standard:QualifiedDataType:100\"\n"
                + " xmlns:udt=\"urn:un:unece:uncefact:data:standard:UnqualifiedDataType:100\"\n"
                + " xmlns:rsm=\"urn:un:unece:uncefact:data:standard:CrossIndustryInvoice:100\"\n"
                + " xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"> \n";

        XMLExchangedDocumentContext xmlExchangeDocumentContext = new XMLExchangedDocumentContext(i);
        XMLExchangedDocument xmlExchangeDocument = new XMLExchangedDocument(i);
        XMLSupplyChainTradeTransaction xmlSupplyChainTradeTransaction = new XMLSupplyChainTradeTransaction(i);

        xml = xml + xmlExchangeDocumentContext.getXML();
        xml = xml + xmlExchangeDocument.getXML();
        xml = xml + xmlSupplyChainTradeTransaction.getXML();

        xml = xml + "</rsm:CrossIndustryInvoice>";
        return xml;
    }
}
