package com.engeto.lekce2.autobazar;

import java.util.ArrayList;
import java.util.List;

public class VehicleOffer {

    private List<Vehicle> vehicleList = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }
    public void removeVehicle(Vehicle vehicle) {
        vehicleList.remove(vehicle);
    }
    public int offerCount() {
        return vehicleList.size();
    }
    public void listOffers() {
        for(Vehicle vehicle : vehicleList) {
            System.out.printf("%s %s%n", vehicle.getMake(),vehicle.getPrice());
        }
    }

}
