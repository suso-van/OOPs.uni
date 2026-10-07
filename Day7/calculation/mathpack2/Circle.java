package calculation.mathpack2;

import calculation.mathpack1.AreaCalculate;
import calculation.mathpack1.DisplayResult;

public class Circle extends AreaCalculate implements DisplayResult {
    private double radius;
    private double result;
    public Circle(double radius) {
        this.radius = radius;
    }
    public void calculate() {
        this.result = Math.PI * radius * radius;
    }
    public void display() {
        System.out.println("Area of Circle: " + result);
    }
}