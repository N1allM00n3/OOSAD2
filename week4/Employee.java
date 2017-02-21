public class Employee {
	SalaryCalculator empType;
	String name;

	public Employee(String s, SalaryCalculator c) {
		name = s;
		empType = c;
	}

	public void display() {
		// TODO - implement Employee.display
		// throw new UnsupportedOperationException();
		System.out.println("Name= " + name);
		System.out.println("Salary= " + empType.getSalary());
	}

}
