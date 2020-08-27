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
public class ProcessControl {

    private String businessProcessType;
    private final String specificationidentifier;

    public ProcessControl(String specificationidentifier) {
        this.specificationidentifier = specificationidentifier;
    }

    public String getSpecificationidentifier() {
        return specificationidentifier;
    }

    public String getBusinessProcessType() {
        return businessProcessType;
    }

    public void setBusinessProcessType(String businessProcessType) {
        this.businessProcessType = businessProcessType;
    }

}
