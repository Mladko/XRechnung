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
public class ItemAttributes {
    
    private final String itemAttributeName;
    private final String itemAttributeValue;

    public ItemAttributes(String itemAttributeName, String itemAttributeValue) {
        this.itemAttributeName = itemAttributeName;
        this.itemAttributeValue = itemAttributeValue;
    }

    public String getItemAttributeName() {
        return itemAttributeName;
    }

    public String getItemAttributeValue() {
        return itemAttributeValue;
    }
    
}
