import Entities.Computer;

import java.util.ArrayList;


public class ComputerShop {
    private ArrayList<Computer> computers;

    public ComputerShop() {
        this.computers = new ArrayList<>();
    }

    public void AddComputer(Computer newComputer) {
        this.computers.add(newComputer);
    }

    public ArrayList<Computer> GetAllItems() {
        return this.computers;
    }
}
