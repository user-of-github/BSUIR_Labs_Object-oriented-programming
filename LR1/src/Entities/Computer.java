package Entities;

public abstract class Computer {
    protected static final String DefaultCurrency = "BYN";
    protected static final String DefaultValue = "Unknown";

    private String manufacturer;
    private String model;
    private double price;
    private OperatingSystem operatingSystem;


    protected Computer() {
        this.manufacturer = Computer.DefaultValue;
        this.model = Computer.DefaultValue;
        this.price = 0.00;
        this.operatingSystem = OperatingSystem.NoOS;
    }

    protected Computer(String manufacturer, String model, double price, OperatingSystem os) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
        this.operatingSystem = os;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String toString() {
        return String.format(
                "Manufacturer: %s\nModel: %s\nPrice: %.2f %s\nOS: %s",
                this.manufacturer,
                this.model,
                this.price,
                Computer.DefaultCurrency,
                this.operatingSystem.name()
        );
    }
}
