package Entities;

public abstract class PortableComputer extends Computer {
    private byte batteryLifeHours;

    protected PortableComputer(String manufacturer, String model, double price, OperatingSystemType os, byte batteryLife) {
        super(manufacturer, model, price, os);
        this.batteryLifeHours = batteryLife;
    }

    public String toString() {
        return String.format("Battery life(in hours): %d\n%s", this.batteryLifeHours, super.toString());
    }
}
