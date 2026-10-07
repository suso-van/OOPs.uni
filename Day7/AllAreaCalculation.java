import calculation.mathpack1.Rectangle;
import calculation.mathpack2.Circle;

public class AllAreaCalculation {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10.0, 5.0);
        rect.calculate();
        rect.display();
        Circle circle = new Circle(7.0);
        circle.calculate();
        circle.display();
    }
}