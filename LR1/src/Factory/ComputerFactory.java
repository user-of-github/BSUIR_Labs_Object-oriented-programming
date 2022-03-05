package Factory;

import computers.*;


public class ComputerFactory {
    public static Computer createComputer(ComputerType type) {
        switch (type) {
            case HOME_PC:
                return new HomePC();
            case SERVER:
                return new Server();
            case SMARTWATCH:
                return new Smartwatch();
            case SMARTPHONE:
                return new Smartphone();
            case LAPTOP:
                return new Laptop();
            default:
                throw new RuntimeException("Unhandled error. Unknown computer's type");
        }
    }
}
