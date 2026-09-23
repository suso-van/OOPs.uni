class Employee {
	private int id;
	private String name;
	private String department;
	private double salary;

	Employee() {
		id = 0;
		name = "Unknown";
		department = "Unknown";
		salary = 0;
	}
	Employee(int id, String name, String department, double salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	double getSalary() {
		return salary;
	}
	void display() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Department: " + department);
		System.out.println("Salary: " + salary);
	}
}
class Manager extends Employee {
	private double bonus;

	Manager() {
		super();
		bonus = 0;
	}
	Manager(int id, String name, String department, double salary, double bonus) {
		super(id, name, department, salary);
		this.bonus = bonus;
	}
	double getTotalSalary() {
		return getSalary() + bonus;
	}
	@Override
	void display() {
		super.display();
		System.out.println("Bonus: " + bonus);
		System.out.println("Total Salary: " + getTotalSalary());
	}
}
public class Employee2 {
	public static void main(String[] args) {
		Manager[] managers = {
			new Manager(101, "AKib", "Sales", 75000, 10000),
			new Manager(102, "Bob", "IT", 82000, 8000),
			new Manager(103, "Kushal", "HR", 70000, 15000)
		};
		Manager highestPaid = managers[0];
		for (Manager manager : managers) {
			if (manager.getTotalSalary() > highestPaid.getTotalSalary()) {
				highestPaid = manager;
			}
		}
		System.out.println("Manager with maximum total salary:");
		highestPaid.display();
	}
}

