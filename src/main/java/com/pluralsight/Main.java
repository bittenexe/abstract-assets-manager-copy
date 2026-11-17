package com.pluralsight;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        //public House(String description, String dateAcquired, BigDecimal originalCost,
        // int condition, String address, int squareFoot, int lotSize)
        Asset houseAsset = new House("Rosie's House", "2026-04-09", new BigDecimal("10000000"), 1, "67 Rich Lane", 45000, 1);

        // public Vehicle(String description, String dateAcquired, BigDecimal originalCost,
        // String makeModel, int year, int odometer)
        Asset vehicleAsset = new Vehicle("Rosie's Car", "2026-04-09", new BigDecimal(65000), "Toyota Supra", 2026, 1000);

        System.out.println(houseAsset);
        System.out.println(vehicleAsset);
    }
}