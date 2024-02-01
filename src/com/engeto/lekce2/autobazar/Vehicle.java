package com.engeto.lekce2.autobazar;

public class Vehicle {
    String make;
    int price;
    boolean isAvailable;
    double consuption;
    VehicleType vehicleType;

    public Vehicle(
            String make, int price, boolean isAvailable,
            double consuption, VehicleType type
    ) {
        this.make = make;
        this.price = price;
        this.isAvailable = isAvailable;
        this.consuption = consuption;
        this.vehicleType = type;
    }


//region getters/setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public double getConsuption() {
        return consuption;
    }

    public void setConsuption(double consuption) {
        this.consuption = consuption;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
    //    endregion
}
