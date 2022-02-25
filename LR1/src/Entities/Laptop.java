package Entities;

public class Laptop extends PortableComputer {
    private double weight;

    public Laptop(String manufacturer, String model, double price, OperatingSystem os, byte batteryLife, double weight) {
        super(manufacturer, model, price, os, batteryLife);
        this.weight = weight;
    }

    public Laptop() {
        super();
        this.weight = 0.00;
    }

    public String toString() {
        return String.format(
                "%s\nWeight: %s",
                super.toString(),
                this.weight == 0.0 ? Computer.DefaultValue : String.valueOf(this.weight)
        );
    }
}
