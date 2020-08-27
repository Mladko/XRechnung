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
public class InvoicingPeriod {

    private final Date periodStartDate;
    private final Date periodEndDate;

    public InvoicingPeriod(Date periodStartDate, Date periodEndDate) {
        this.periodStartDate = periodStartDate;
        this.periodEndDate = periodEndDate;
    }

    public Date getPeriodStartDate() {
        return periodStartDate;
    }

    public Date getPeriodEndDate() {
        return periodEndDate;
    }

    
}
