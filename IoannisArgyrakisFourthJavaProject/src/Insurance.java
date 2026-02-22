
public abstract class Insurance {

	private int codeNumber;
	private String lastName;
	private int monthsOfInsurance;
	
	public Insurance(int codeNumber, String lastName, int monthsOfInsurance) {
		this.codeNumber = codeNumber;
		this.lastName = lastName;
		this.monthsOfInsurance = monthsOfInsurance;
	}
	
	public abstract double calculateIns();

	public int getMonthsOfInsurance() {
		return monthsOfInsurance;
	}

	public void description() {
		System.out.println("Kωδικός αριθμός ασφάλειας: " + codeNumber);
		System.out.println("Επώνυμο ασφαλιζόμενου: " + lastName);
		System.out.println("Διάρκεια Ασφάλισης: " + monthsOfInsurance);
	}

	public String getLastName() {
		return lastName;
		
	}

	public int getCodeNumnber() {
		return codeNumber;
	}
}