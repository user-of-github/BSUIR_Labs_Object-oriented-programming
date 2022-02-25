package Entities;

public abstract class PortableComputer extends Computer {
    private byte batteryLifeHours;


    protected PortableComputer() {
        super();
        this.batteryLifeHours = 0;
    }

    protected PortableComputer(String manufacturer, String model, double price, OperatingSystem os, byte batteryLife) {
        super(manufacturer, model, price, os);
        this.batteryLifeHours = batteryLife;
    }

    public String toString() {
        return String.format("%s\nBattery life(in hours): %d", super.toString(), this.batteryLifeHours);
    }
}
