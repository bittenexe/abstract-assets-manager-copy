package com.pluralsight;

import java.math.BigDecimal;
import java.time.Year;

public class Vehicle extends Asset {
    protected String makeModel;
    protected int year;
    protected int odometer;

    public Vehicle(String description, String dateAcquired, BigDecimal originalCost,
                   String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public BigDecimal getValue() {
        int age = Year.now().getValue() - this.year;
        BigDecimal value;

        if (age > 10) {
            return new BigDecimal("1000.00");
        }

        BigDecimal annualRate;
        if (age <= 3) {
            annualRate = new BigDecimal("0.03");
        } else if (age <= 6) {
            annualRate = new BigDecimal("0.06");
        } else {
            annualRate = new BigDecimal("0.08");
        }

        BigDecimal totalRate = annualRate.multiply(new BigDecimal(age));
        return originalCost.subtract(originalCost.multiply(totalRate));

    }
}