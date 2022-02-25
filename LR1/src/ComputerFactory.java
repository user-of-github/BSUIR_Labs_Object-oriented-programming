import Entities.*;

public class ComputerFactory {
    public static Computer CreateComputer(ComputerType type) {
        switch (type) {
            case HomePC:
                return new HomePC();
            case Server:
                return new Server();
            case Smartwatch:
                return new Smartwatch();
            case Smartphone:
                return new Smartphone();
            case Laptop:
                return new Laptop();
            default:
                throw new RuntimeException("Unhandled error. Unknown computer's type");
        }
    }

    public static Computer CreateComputer(ComputerType type, Object[] params) {
        switch (type) {
            case HomePC:
                return new HomePC((String) params[0], (String) params[1], (double) params[2], (OperatingSystem) params[3], (int) params[4], (int) params[5]);
            case Server:
                return new Server((String) params[0], (String) params[1], (double) params[2], (OperatingSystem) params[3], (int) params[4], (int) params[5]);
            case Smartwatch:
                return new Smartwatch((String) params[0], (String) params[1], (double) params[2], (OperatingSystem) params[3], (byte) params[4], (boolean) params[5]);
            case Smartphone:
                return new Smartphone((String) params[0], (String) params[1], (double) params[2], (OperatingSystem) params[3], (byte) params[4], (boolean) params[5]);
            case Laptop:
                return new Laptop((String) params[0], (String) params[1], (double) params[2], (OperatingSystem) params[3], (byte) params[4], (double) params[5]);
            default:
                throw new RuntimeException("Unhandled error. Unknown computer's type");
        }
    }
}
