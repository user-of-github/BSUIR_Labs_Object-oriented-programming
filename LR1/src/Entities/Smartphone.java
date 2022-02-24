package Entities;

public class Smartphone extends PortableComputer{
    private boolean hasGoogleApps;

    public Smartphone(String manufacturer, String model, double price, OperatingSystemType os, byte batteryLife, boolean hasGapps) {
        super(manufacturer, model, price, os, batteryLife);
        this.hasGoogleApps = hasGapps;
    }

    public String toString() {
        return String.format("Has Google Apps ?: %b\n%s", this.hasGoogleApps, super.toString());
    }
}
