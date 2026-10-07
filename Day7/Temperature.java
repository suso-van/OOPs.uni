class TooHot extends Exception {
    public TooHot(String message) {
        super(message);
    }
}

class TooCold extends Exception {
    public TooCold(String message) {
        super(message);
    }
}

public class Temperature {
    public static void main(String[] args) {
        double temp = Double.parseDouble(args[0]);
        try {
            if (temp > 35) {
                throw new TooHot("Temperature is too hot: " + temp);
            } else if (temp < 0) {
                throw new TooCold("Temperature is too cold: " + temp);
            } else {
                System.out.println("Temperature is normal: " + temp);
            }
        } catch (TooHot e) {
            System.out.println(e.getMessage());
        } catch (TooCold e) {
            System.out.println(e.getMessage());
        }
    }
}
