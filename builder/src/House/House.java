package House;


public class House {
    private final int windowsCount;
    private final int doorsCount;
    private final int roomsCount;
    private final boolean hasGarage;
    private final boolean hasPool;
    private final int floorsCount;

    public House(int w, int d, int r, boolean g, boolean p, int f) {
        this.doorsCount = d;
        this.windowsCount = w;
        this.hasGarage = g;
        this.hasPool = p;
        this.floorsCount = f;
        this.roomsCount = r;
    }

    @Override
    public String toString() {
        return ("House\n"
                + "Doors count: " + this.doorsCount + "\n"
                + "Windows count: " + this.windowsCount + "\n"
                + "Rooms count: " + this.roomsCount + "\n"
                + "Floors count: " + this.floorsCount + "\n"
                + "Has pool: " + this.hasPool + "\n"
                + "Has garage: " + this.hasGarage + "\n"
        );
    }
}
