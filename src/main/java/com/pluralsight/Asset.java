package com.pluralsight;

import java.math.BigDecimal;

public class Asset {
    private String description;
    private String dateAcquired;
    BigDecimal originalCost;

    public Asset(String description, String dateAcquired, BigDecimal originalCost) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }

    //region Getters/Setters
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDateAcquired() {
        return dateAcquired;
    }
    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }
    public BigDecimal getValue() {
        return originalCost;
    }
    public BigDecimal getOriginalCost() {
        return originalCost;
    }
    public void setOriginalCost(BigDecimal originalCost) {
        this.originalCost = originalCost;
    }
    //endregion
}


