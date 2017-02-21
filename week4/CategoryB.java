public class CategoryB implements SalaryCalculator {
	double salesAmt;
	double baseSalary;

	final static double commission = 0.02;

	public CategoryB(double sa, double base) {
		baseSalary = base;
		salesAmt = sa;
	}

	public double getSalary() {
		// TODO - implement CategoryB.getSalary
		// throw new UnsupportedOperationException();
		return (baseSalary + (commission * salesAmt));
	}

}
