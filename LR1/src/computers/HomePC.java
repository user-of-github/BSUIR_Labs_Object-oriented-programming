package computers;

import Factory.ComputerType;

public class HomePC extends DesktopComputer {
    private int comfortRating;

    public HomePC() {
        super();
        this.comfortRating = 0;
    }

    public HomePC(String manufacturer, String model, double price, OperatingSystem os, int powerVoltage, int comfortRating) {
        super(manufacturer, model, price, os, powerVoltage);
        this.comfortRating = comfortRating;
    }

    @Override
    public ComputerType getComputerType() {
        return ComputerType.HOME_PC;
    }

    public String toString() {
        return String.format("%s\nRating of comfort: %d", super.toString(), this.comfortRating);
    }
}
