package edu.sdccd.cisc191;

public class PickupTruck extends Vehicle {
    private int cargoCapacity;

    public PickupTruck(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Object[] options, int cargoCapacity) {

        super(manufacturerName, milesOnVehicle, price,numberOfSeats, options);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }
}
