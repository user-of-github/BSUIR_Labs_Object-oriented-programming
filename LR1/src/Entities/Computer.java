package Entities;

public abstract class Computer {
    private String manufacturer;
    private String model;
    private double price;
    private OperatingSystemType operatingSystem;

    protected Computer(String manufacturer, String model, double price, OperatingSystemType os) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
        this.operatingSystem = os;
    }

    public String toString() {
        return String.format("Manufacturer: %s\nModel: %s\nPrice: %f\nOS: %s", this.manufacturer, this.model, this.price, this.operatingSystem.name());
    }
}
