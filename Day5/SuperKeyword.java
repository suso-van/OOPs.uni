class Superclass{
	String message= "Superclass";
	public Superclass(String text){
		System.out.println("Supercalss:" +text);
	}
	public void showMethod(){
		System.out.println("Superclass method");
	}
}
class Subclass extends Superclass{
	String message = "Subclass";
	public Subclass() {
		super("Hello super");
		System.out.println("Subclass constructor");
	}
	public void displaymessages(){
		System.out.println("super:"+ this.message);
		System.out.println("super class accesed:" + super.message);
		super.showMethod();
	}
}
public class SuperKeyword{
	public static void main(String[] args){
		Subclass obj = new Subclass();
		System.out.println("---");
		obj.displaymessages();
	}
}