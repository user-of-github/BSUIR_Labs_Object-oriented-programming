import computers.Computer;
import computers.OperatingSystem;
import Factory.ComputerFactory;
import Factory.ComputerType;

import java.util.HashMap;


class Demonstration {
    public static void main(String[] args) {
        Demonstration.demo();
    }

    private static void demo() {
        ComputerShop shop = new ComputerShop();

        Object[][] params = Demonstration.getDefaultComputersParamsPack();

        for (Object[] param : params) {
            Computer newComputer = ComputerFactory.createComputer((ComputerType) param[0]);

            newComputer.setManufacturer((String) param[1]);
            newComputer.setModel((String) param[2]);
            newComputer.setPrice((double) param[3]);
            newComputer.setOperatingSystem((OperatingSystem) param[4]);

            shop.addComputer(newComputer);
        }

        /*for (Computer computer : shop.GetAllItems()) {
            System.out.println(computer);
            System.out.println(computer.GetComputerType());
            System.out.println("");
        }*/

        HashMap<String, Integer> frequences = shop.getCountsOfAllTypesOfComputers();
        for (String key : frequences.keySet()) {
            System.out.println(key + " " + frequences.get(key));
        }
    }

    public static Object[][] getDefaultComputersParamsPack() {
        return new Object[][]{
                new Object[]{ComputerType.LAPTOP, "ASUS", "Studio Book S", 4000.00, OperatingSystem.Windows, 10, 1700},
                new Object[]{ComputerType.SMARTPHONE, "Huawei", "Nova 9", 1299.99, OperatingSystem.HarmonyOS, 10, false},
                new Object[]{ComputerType.HOME_PC, "Apple", "Mac Mini M1", 4000.00, OperatingSystem.MacOS, 100, 9},
                new Object[]{ComputerType.SMARTWATCH, "Xiaomi", "Mi Band 6", 100.00, OperatingSystem.Other, 25, true},
                new Object[]{ComputerType.SMARTWATCH, "Xiaomi", "Mi Band 6", 100.00, OperatingSystem.Other, 25, true},
        };
    }
}