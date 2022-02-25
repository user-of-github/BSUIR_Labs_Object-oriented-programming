package Entities;

public class Smartwatch extends PortableComputer {
    private boolean canControlHealth;

    public Smartwatch(String manufacturer, String model, double price, OperatingSystem os, byte batteryLife, boolean canControlHealth) {
        super(manufacturer, model, price, os, batteryLife);
        this.canControlHealth = canControlHealth;
    }

    public Smartwatch() {
        super();
        this.canControlHealth = false;
    }

    public String toString() {
        return String.format(
                "%s\nAbility to control health (pulse and so on): %b",
                super.toString(),
                this.canControlHealth
        );
    }
}
