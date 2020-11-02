/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoecker.xrechnung.pojos;

import java.util.Date;

/**
 *
 * @author Sikiric
 */
public class InvoiceLinePeriod {
    
    private final String invoiceLineLeriodStartDate;
    private final String invoiceLineLeriodEndDate;

    public InvoiceLinePeriod(String invoiceLineLeriodStartDate, String invoiceLineLeriodEndDate) {
        this.invoiceLineLeriodStartDate = invoiceLineLeriodStartDate;
        this.invoiceLineLeriodEndDate = invoiceLineLeriodEndDate;
    }

    public String getInvoiceLineLeriodStartDate() {
        return invoiceLineLeriodStartDate;
    }

    public String getInvoiceLineLeriodEndDate() {
        return invoiceLineLeriodEndDate;
    }
    
 }
