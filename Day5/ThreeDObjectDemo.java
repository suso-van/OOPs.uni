class ThreeDObject {
    int x, y, z;

    ThreeDObject(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void Area() {
        System.out.println("Area");
    }
    void Volume() {
        System.out.println("Volume");
    }
}
class Box extends ThreeDObject {
    Box(int x, int y, int z) {
        super(x, y, z);
    }
    @Override
    void Area() {
        System.out.println("Box Area:" +(2* (x*y + y*z + z*x)));
    }
    void volume() {
        System.out.println("Box Volume:" +(x*y*z));
    }
}
class Cube extends ThreeDObject {
    Cube(int x){
        super(x, x, x);
    }
    @Override
    void Area() {
        System.out.println("Cube Area:" +(6*(x*x)));
    }
    void Volume() {
        System.out.println("Cube Volume" +(x*x*x));
    }
}
class Cylinder extends ThreeDObject{
    Cylinder(int x, int y){
        super(x, y, 0);
    }
    @Override
    void Area() {
        System.out.println("Cylinder Area:" +(2*3.14*x*(x+y))); 
    }
    void Volume() {
        System.out.println("Cylinder Volume:" +(3.14*x*x*y));
    }   
}
class Cone extends ThreeDObject{
    Cone(int x, int y){
        super(x, y, 0);
    }
    @Override
    void Area() {
        System.out.println("Cone Area:" +(3.14*x*(x+Math.sqrt(y*y+x*x))));
    }
    void Volume() {
        System.out.println("Cone Volume:" +(1/3*3.14*x*x*y));
    }   
}
public class ThreeDObjectDemo {
    public static void main(String[] args) {
        Box box = new Box(2, 3, 4);
        box.Area();
        box.volume();
        Cube cube = new Cube(3);
        cube.Area();
        cube.Volume();
        Cylinder cylinder = new Cylinder(2, 5);
        cylinder.Area();
        cylinder.Volume();
        Cone cone = new Cone(2, 5);
        cone.Area();
        cone.Volume();
    }
}
