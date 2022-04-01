package Builder;

import House.House;


public class HouseBuilder implements Builder {
    private int windows = 0;
    private int floors = 0;
    private int rooms = 0;
    private int doors = 0;
    private boolean hasGarage = false;
    private boolean hasPool = false;


    @Override
    public HouseBuilder setWindowsCount(int windowsCount) {
        this.windows = windowsCount;
        return this;
    }

    @Override
    public HouseBuilder setFloorsCount(int floorsCount) {
        this.floors = floorsCount;
        return this;
    }

    @Override
    public HouseBuilder addSwimmingPool() {
        this.hasPool = true;
        return this;
    }

    @Override
    public HouseBuilder addGarage() {
        this.hasGarage = true;
        return this;
    }

    @Override
    public HouseBuilder setRoomsCount(int roomsCount) {
        this.rooms = roomsCount;
        return this;
    }

    @Override
    public HouseBuilder setDoorsCount(int doorsCount) {
        this.doors = doorsCount;
        return this;
    }

    public House getHouse() {
        return new House(this.windows, this.doors, this.rooms, this.hasGarage, this.hasPool, this.floors);
    }
}
