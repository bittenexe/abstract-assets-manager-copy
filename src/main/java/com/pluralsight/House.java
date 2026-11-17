package com.pluralsight;

import java.math.BigDecimal;

public class House extends Asset {
    private String address;
    protected int condition;
    protected int squareFoot;
    protected int lotSize;

    public House(String description, String dateAcquired, BigDecimal originalCost, int condition, String address, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.condition = condition;
        this.address = address;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    //region Getters/Setters
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
    //endregion

    @Override

    public BigDecimal getValue() {
        int rate = switch (this.condition) {
            case 1 -> 180;
            case 2 -> 130;
            case 3 -> 90;
            default -> 80;
        };

        return BigDecimal.valueOf(rate * this.squareFoot)
                .add(BigDecimal.valueOf(0.25).multiply(BigDecimal.valueOf(this.lotSize)));
    }
}


