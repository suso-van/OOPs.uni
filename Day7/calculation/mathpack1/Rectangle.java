package calculation.mathpack1;

public class Rectangle extends AreaCalculate implements DisplayResult {
    private double height;
    private double width;
    private double result;
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    public void calculate() {
        this.result = height * width;
    }
    public void display() {
        System.out.println("Area of Rectangle: " + result);
    }
}