
public class SubTeacher extends Teacher{
	
	private double hourlyRate;
	private int hoursMonthlyWorked;
	
	public double netMonthlySalary() {
		return hourlyRate * hoursMonthlyWorked;
	}

	public SubTeacher(String lastName, String afm, double hourlyRate, int hoursMonthlyWorked) {
		super(lastName, afm);
		this.hourlyRate = hourlyRate;
		this.hoursMonthlyWorked = hoursMonthlyWorked;
	}
	
}
