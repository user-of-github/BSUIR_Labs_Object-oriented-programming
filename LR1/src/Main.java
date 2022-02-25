import Entities.*;


class Main {
    public static void main(String[] args) {
        Main.Demo();
    }

    private static void Demo() {
        ComputerShop shop = new ComputerShop();

        Object[][] params = Main.GetDefaultComputersParamsPack();

        for (Object[] param : params)
        {
            Computer newComputer = ComputerFactory.CreateComputer((ComputerType) param[0]);

            newComputer.setManufacturer((String)param[1]);
            newComputer.setModel((String)param[2]);
            newComputer.setPrice((double)param[3]);
            newComputer.setOperatingSystem((OperatingSystem) param[4]);

            shop.AddComputer(newComputer);
        }

        for (Computer computer : shop.GetAllItems())
        {
            System.out.println(computer);
            System.out.println("");
        }
    }

    public static Object[][] GetDefaultComputersParamsPack() {
        return new Object[][]{
                new Object[]{ComputerType.Laptop, "ASUS", "Studio Book S", 4000.00, OperatingSystem.Windows, 10, 1700},
                new Object[]{ComputerType.Smartphone, "Huawei", "Nova 9", 1299.99, OperatingSystem.HarmonyOS, 10, false},
                new Object[]{ComputerType.HomePC, "Apple", "Mac Mini M1", 4000.00, OperatingSystem.MacOS, 100, 9},
                new Object[]{ComputerType.Smartwatch, "Xiaomi", "Mi Band 6", 100.00, OperatingSystem.Other, 25, true}
        };
    }
}