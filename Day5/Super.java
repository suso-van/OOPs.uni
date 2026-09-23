class Person {
	Person(String name) {
		System.out.println("Person constructor called for " + name);
	}
}

class Student extends Person {
	Student(String name) {
		super(name); 
		System.out.println("Student constructor called");
	}
}

class Super {
	public static void main(String[] args) {
		new Student("Akib");
	}
}

    