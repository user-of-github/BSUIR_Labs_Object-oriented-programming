import Entities.Computer;
import Entities.Laptop;
import Entities.OperatingSystemType;
import Entities.Smartphone;

import java.util.ArrayList;


class Main {
    public static void main(String[] args) {
        demo();
    }


    public static void demo() {
        ArrayList<Computer> array = new ArrayList<>();
        array.add(new Laptop("Apple", "MacBook Pro 13 (2019)", 25.0, OperatingSystemType.MacOS, (byte) 12, 1.5));
        array.add(new Smartphone("Xiaomi", "Poco M3 Pro 5G", 25.0, OperatingSystemType.Android, (byte) 12, true));

        for (Computer computer : array)
        {
            System.out.println(computer);
            System.out.println("");
        }
    }
}