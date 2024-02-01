package com.engeto.lekce2.autobazar;

public class Main {

    public static void main(String[] args) {
        VehicleOffer offer = new VehicleOffer();
        offer.addVehicle(new Vehicle("Škoda Fabia", 55000, true, 5.7,VehicleType.CAR));
        offer.addVehicle(new Vehicle("Ford Ka", 50000, true, 5.3,VehicleType.CAR));
        offer.listOffers();
    }

}
