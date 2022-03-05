package computers;


import Factory.ComputerType;

public class Smartphone extends PortableComputer {
    private boolean hasGoogleApps;

    public Smartphone() {
        super();
        this.hasGoogleApps = true;
    }

    public Smartphone(String manufacturer, String model, double price, OperatingSystem os, byte batteryLife, boolean hasGapps) {
        super(manufacturer, model, price, os, batteryLife);
        this.hasGoogleApps = hasGapps;
    }

    @Override
    public ComputerType getComputerType() {
        return ComputerType.SMARTPHONE;
    }

    public String toString() {
        return String.format(
                "%s\nHas Google Apps: %b",
                super.toString(),
                this.hasGoogleApps
        );
    }
}

