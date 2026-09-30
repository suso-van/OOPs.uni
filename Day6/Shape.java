interface Shape {
    int calculateArea();
    void display();
}
class Rectangle implements Shape {
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
class Triangle implements Shape {
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
        Shape rectangle = new Rectangle(5, 10);
        rectangle.display();
        Shape triangle = new Triangle(3, 4, 5);
        triangle.display();
    }
}
