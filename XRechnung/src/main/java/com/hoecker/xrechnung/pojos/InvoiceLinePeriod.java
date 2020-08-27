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
    
    private final Date invoiceLineLeriodStartDate;
    private final Date invoiceLineLeriodEndDate;

    public InvoiceLinePeriod(Date invoiceLineLeriodStartDate, Date invoiceLineLeriodEndDate) {
        this.invoiceLineLeriodStartDate = invoiceLineLeriodStartDate;
        this.invoiceLineLeriodEndDate = invoiceLineLeriodEndDate;
    }

    public Date getInvoiceLineLeriodStartDate() {
        return invoiceLineLeriodStartDate;
    }

    public Date getInvoiceLineLeriodEndDate() {
        return invoiceLineLeriodEndDate;
    }
    
 }
