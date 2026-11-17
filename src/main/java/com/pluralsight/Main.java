package com.pluralsight;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        //public House(String description, String dateAcquired, BigDecimal originalCost,
        // int condition, String address, int squareFoot, int lotSize)
        Asset houseAsset = new House("Rosie's House", "2026-04-09", new BigDecimal("10000000"), 1, "67 Rich Lane", 45000, 1);

        // public Vehicle(String description, String dateAcquired, BigDecimal originalCost,
        // String makeModel, int year, int odometer)
        Asset vehicleAsset = new Vehicle("Rosie's Car", "2026-04-09", new BigDecimal("65000"), "Toyota Supra", 2023, 1000);

        if (houseAsset instanceof House) {
            House house = (House) houseAsset;
            System.out.println("Description: " + house.getDescription());
            System.out.println("Date Acquired: " + house.getDateAcquired());
            System.out.println("Original Cost: " + house.getOriginalCost());
            System.out.println("Value: " + house.getValue());
        }

        System.out.println();

        if (vehicleAsset instanceof Vehicle) {
            Vehicle vehicle = (Vehicle) vehicleAsset;
            System.out.println("Description: " + vehicle.getDescription());
            System.out.println("Date Acquired: " + vehicle.getDateAcquired());
            System.out.println("Original Cost: " + vehicle.getOriginalCost());
            System.out.println("Value: " + vehicle.getValue());
        }
    }
}