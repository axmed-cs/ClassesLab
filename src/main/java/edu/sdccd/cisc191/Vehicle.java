package edu.sdccd.cisc191;

public class Vehicle {
    private String ManufacturerName;
    private int milesOnVehicle;
    private int price;
    private int numberOfSeats;;

   private Option[] options;

    public Vehicle(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Object[] options) {
        this.ManufacturerName = manufacturerName;
        this.milesOnVehicle = milesOnVehicle;
        this.price = price;
        this.numberOfSeats = numberOfSeats;
        this.options = (Option[]) options;
    }

    public String getManufacturerName() {
        return ManufacturerName;
    }


    public int getMilesOnVehicle() {
        return milesOnVehicle;
    }


    public int getPrice() {
        return price;
    }


    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public Option[] getOptions() {
        return options;
    }
}
