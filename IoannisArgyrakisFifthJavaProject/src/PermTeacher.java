
public class PermTeacher extends Teacher{

	private double monthlySalary;
	private double monthlyTax;
	private int protectedPeople;
	
	public double netMonthlySalary() {
		return monthlySalary * ( 1 - monthlyTax ) + protectedPeople * 100;
	}

	public PermTeacher(String lastName, String afm, double monthlySalary, double monthlyTax, int protectedPeople) {
		super(lastName, afm);
		this.monthlySalary = monthlySalary;
		this.monthlyTax = monthlyTax;
		this.protectedPeople = protectedPeople;
	}
	
}
