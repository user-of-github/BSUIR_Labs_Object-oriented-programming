package Builder;


public interface Builder {
    Builder setWindowsCount(int windowsCount);

    Builder setFloorsCount(int floorsCount);

    Builder addSwimmingPool();

    Builder addGarage();

    Builder setRoomsCount(int roomsCount);

    Builder setDoorsCount(int doorsCount);
}
