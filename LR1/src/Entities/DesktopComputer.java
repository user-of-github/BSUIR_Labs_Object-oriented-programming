package Entities;

public abstract class DesktopComputer extends Computer {
    private int powerVoltage;

    protected DesktopComputer() {
        super();
        this.powerVoltage = 0;
    }

    protected DesktopComputer(String manufacturer, String model, double price, OperatingSystem os, int powerVoltage) {
        super(manufacturer, model, price, os);
        this.powerVoltage = powerVoltage;
    }

    public String toString() {
        return String.format("%s\nRequired power voltage: %d", super.toString(), this.powerVoltage);
    }
}
