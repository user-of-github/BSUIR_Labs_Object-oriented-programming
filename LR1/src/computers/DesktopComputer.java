package computers;

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
        return String.format(
                "%s\nRequired power voltage: %s",
                super.toString(),
                this.powerVoltage == 0.00 ? Computer.DefaultValue : String.valueOf(this.powerVoltage)
        );
    }
}
