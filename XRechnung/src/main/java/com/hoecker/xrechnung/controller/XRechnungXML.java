/*
 * Mladen Sikiric
 * Höcker Project Managers GmbH
 */
package com.hoecker.xrechnung.controller;

import com.hoecker.xrechnung.XML.XMLApplicableHeaderTradeAgreement;
import com.hoecker.xrechnung.XML.XMLExchangedDocumentContext;
import com.hoecker.xrechnung.XML.XMLExchangedDocument;
import com.hoecker.xrechnung.XML.XMLSupplyChainTradeTransaction;
import com.hoecker.xrechnung.pojos.Buyer;
import com.hoecker.xrechnung.pojos.BuyerContact;
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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Sikiric
 */
public class XRechnungXML {  
          /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Invoice i = XRechnungXML.createInvoice();
        String xml = XRechnungXML.createXMLfromInvoice(i);
        System.out.println(xml);
    }    
    
    private static Invoice createInvoice() {              
        
        ProcessControl processControl = new ProcessControl("urn:cen.eu:en16931:2017");
        SellerPostalAddress sellerContact = new SellerPostalAddress("Stadt", "Postleitzahl", "Land");
        SellerContact sellerPostalAddress = new SellerContact("Name des Kontakts", "Telefonnummer des Kontakts", "Emailadresse des Kontakts"); 
        Seller seller = new Seller("Firmenname", sellerContact, sellerPostalAddress);
        BuyerPostalAddress buyerPostalAddress = new BuyerPostalAddress("Name des Kontakts", "Telefonnummer des Kontakts", "Emailadresse des Kontakts"); 
        Buyer buyer = new Buyer("Firmenname", buyerPostalAddress);
        PaymentInstructions paymentInstructions = new PaymentInstructions("UN/ECE 4461");
        DocumentTotals documentTotals = new DocumentTotals("Summe aller netto Rechnungsbeträge", "Der Gesamtbetrag der Rechnung ohne Umsatzsteuer", "Der ausstehende Betrag inklusive Umsatzsteuer");
        List<VatBreakdown> vatBreakdownList = new ArrayList<>();        
        VatBreakdown vatBreakdown = new VatBreakdown("Summe aller zu versteuernden Beträge", 
                "Die Berechnung erfolgt durch Multiplikation des VAT category taxable amount mit der VAT categoryrate der jeweiligen VAT category",
                "Codierte Bezeichnung einer Umsatzsteuerkategorie: S, Z, E, AE, K, G, O, L, M",
                "Der Umsatzsteuersatz, angegeben als für die betreffende Umsatzsteuerkategorie geltender Prozentsatz. Null falls ohne");
        vatBreakdownList.add(vatBreakdown);
        List<InvoiceLine> invoiceLineList = new ArrayList<>();
        PriceDetails priceDetails = new PriceDetails("NettoPreis der Produkts");
        LineVATinformation lineVATinformation = new LineVATinformation("Codierte Bezeichnung einer Umsatzsteuerkategorie: S, Z, E, AE, K, G, O, L, M");
        ItemInformation itemInformation = new ItemInformation("Name des Produkts");
        InvoiceLine invoiceLine = new InvoiceLine("Bezeichner der Rechnungsposition", "Menge", "Maßeinheit",
                "Der Gesamtbetrag der Rechnungsposition ohne Umsatzsteuer", priceDetails, lineVATinformation, itemInformation);
        invoiceLineList.add(invoiceLine);
        Invoice i = new Invoice("Rechnungsnummer", new Date(), "380", "EUR", "Hier steht der Empfänger",
                    processControl, seller, buyer, paymentInstructions, documentTotals, vatBreakdownList, invoiceLineList);
        
        return i;   
    }   
    
    /*
    Aufruf der XMLKlassen zum Erzeugen des XMLs
    */
    public static String createXMLfromInvoice(Invoice i) {
        String xml = "";
        
        XMLExchangedDocumentContext xmlExchangeDocumentContext = new XMLExchangedDocumentContext(i);
        XMLExchangedDocument xmlExchangeDocument = new XMLExchangedDocument(i);
        XMLSupplyChainTradeTransaction xmlSupplyChainTradeTransaction = new XMLSupplyChainTradeTransaction(i);  
        return xml;
    }
}
