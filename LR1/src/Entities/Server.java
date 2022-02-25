package Entities;

public class Server extends DesktopComputer{
    private int square;

    public Server() {
        super();
        this.square = 0;
    }

    public Server(String manufacturer, String model, double price, OperatingSystem os, int powerVoltage, int square) {
        super(manufacturer, model, price, os, powerVoltage);
        this.square = square;
    }

    public String toString() {
        return String.format("%s\nRequired free space (square): %d", super.toString(), this.square);
    }
}
