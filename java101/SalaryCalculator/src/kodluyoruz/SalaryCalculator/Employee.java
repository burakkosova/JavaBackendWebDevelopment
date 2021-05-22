package kodluyoruz.SalaryCalculator;

public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;

	public Employee(String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	public double tax() {
		if (this.salary <= 1000)
			return 0;

		return this.salary * 0.03;
	}

	public int bonus() {
		return (this.workHours-40) * 30;
	}

	public double raiseSalary() {
		int years = 2021 - this.hireYear;
		if (years < 10)
			return this.salary * 0.05;

		if (years > 9 && years < 20)
			return this.salary * 0.1;

		return this.salary * 0.15;
	}
	
	public String toString() {
		double salaryWithTaxesAndBonuses = this.salary - tax() + bonus();
		double totalSalary = this.salary + raiseSalary();
		
		return "Ad� : " + this.name
				+ "\nMaa�� : " + this.salary
				+ "\n�al��ma Saati : " + this.workHours
				+ "\nBa�lang�� Y�l� : " + this.hireYear
				+ "\nVergi : " + tax()
				+ "\nBonus : " + bonus()
				+ "\nMaa� Art��� : " + raiseSalary()
				+ "\nVergi ve Bonuslar ile birlikte maa� : " + salaryWithTaxesAndBonuses
				+ "\nToplam Maa� : " + totalSalary;
	}
}
