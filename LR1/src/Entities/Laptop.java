package Entities;

public class Laptop extends PortableComputer {
    private double weight;

    public Laptop(String manufacturer, String model, double price, OperatingSystemType os, byte batteryLife, double weight) {
        super(manufacturer, model, price, os, batteryLife);
        this.weight = weight;
    }

    public String toString() {
        return String.format("Weight: %f\n%s", this.weight, super.toString());
    }
}
