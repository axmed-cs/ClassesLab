package edu.sdccd.cisc191;

public class ElectricCar extends Car implements Chargeable{

    private int BatteryCharge;

    public ElectricCar(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Object[] options, int numberOfDoors) {

        super(manufacturerName, milesOnVehicle, price, numberOfSeats, options, numberOfDoors);

    }

    public void chargeUp() {
        BatteryCharge = 100;

    }
    public int getBatteryCharge() {
        return BatteryCharge;
    }
}
