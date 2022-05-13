package Builder;


public class Director {
    public void buildMansion(Builder builder) {
        builder.addGarage().addSwimmingPool().setFloorsCount(2).setRoomsCount(9).setWindowsCount(12).setDoorsCount(3);
    }

    public void buildBudgetHousing(Builder builder) {
        builder.setFloorsCount(1).setRoomsCount(2).setWindowsCount(4).setDoorsCount(2);
    }

    public void buildOneFlooredBuilding(Builder builder) {
        builder.setFloorsCount(1);
    }

    public void buildPooledBuilding(Builder builder) {
        builder.addSwimmingPool();
    }
}
