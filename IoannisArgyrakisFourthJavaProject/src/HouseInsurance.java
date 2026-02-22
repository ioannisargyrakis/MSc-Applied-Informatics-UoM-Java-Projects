
public class HouseInsurance extends Insurance{

	private int houseCm;
	
	public HouseInsurance(int codeNumber, String lastName, int monthsOfInsurance, int houseCm) {
		super(codeNumber, lastName, monthsOfInsurance);
		this.houseCm = houseCm;
		
	}

	public double calculateIns() {
		return houseCm * getMonthsOfInsurance() / 10;
	}

	@Override 
	public void description() {
		System.out.println("House Insurance description:");	
		super.description();
		System.out.println("Κόστος Ασφάλειας: " + calculateIns());
	}
	
}
