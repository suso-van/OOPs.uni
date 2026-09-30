
abstract class AbstractShape {
    abstract int calculateArea();
    abstract void display();
}
class Rectangle extends AbstractShape {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public int calculateArea() {
        return length * breadth;
    }
    public void display() {
        System.out.println("Rectangle Area: " + calculateArea());
    }
}
class Triangle extends AbstractShape {
    private int a,b,c;
    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int calculateArea() {
        double s = (a+b+c)/2;
        return (int) Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    public void display() {
        System.out.println("Triangle Area: " + calculateArea());
    }
}
class ShapeDemo {
    public static void main(String[] args) {
        AbstractShape rectangle = new Rectangle(5, 10);
        rectangle.display();
        AbstractShape triangle = new Triangle(3, 4, 5);
        triangle.display();
    }
}
