import computers.Computer;

import java.util.ArrayList;
import java.util.HashMap;


public class ComputerShop {
    private ArrayList<Computer> computers;

    public ComputerShop() {
        this.computers = new ArrayList<>();
    }

    public void addComputer(Computer newComputer) {
        this.computers.add(newComputer);
    }

    public HashMap<String, Integer> getCountsOfAllTypesOfComputers() {
        HashMap<String, Integer> response = new HashMap<>();

        for (Computer item : this.computers) {
            if (!response.containsKey(item.getComputerType().toString()))
                response.put(item.getComputerType().toString(), 1);
            else
                response.put(item.getComputerType().toString(), response.get(item.getComputerType().toString()) + 1);
        }

        return response;
    }

    public ArrayList<Computer> getAllItems() {
        return this.computers;
    }
}
