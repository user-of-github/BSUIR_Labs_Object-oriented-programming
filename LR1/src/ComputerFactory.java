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
}
