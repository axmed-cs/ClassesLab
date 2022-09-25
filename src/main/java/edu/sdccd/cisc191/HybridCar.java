package edu.sdccd.cisc191;

public class HybridCar extends Car implements Combustible, Chargeable{

    private int FuelLevel;
    private int BatteryCharge;

    public HybridCar(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Object[] options, int numberOfDoors) {
        super(manufacturerName, milesOnVehicle, price, numberOfSeats, options, numberOfDoors);

    }



    public int getFuelLevel() {
        return FuelLevel;
    }

    public void chargeUp(){
    BatteryCharge = 100;
    }

    public int getBatteryCharge() {
        return BatteryCharge;
    }

    public void tankUp() {
        FuelLevel = 100;
    }
}
