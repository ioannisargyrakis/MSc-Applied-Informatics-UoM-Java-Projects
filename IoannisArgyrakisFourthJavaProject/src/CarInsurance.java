
public class CarInsurance extends Insurance {

	private int carCm;
	
	public CarInsurance(int codeNumber, String lastName, int monthsOfInsurance, int carCm) {
		super(codeNumber, lastName, monthsOfInsurance);
		this.carCm = carCm;
		
	}
	
	public double calculateIns() {
		return carCm * getMonthsOfInsurance() / 60;
	}

	@Override
	public void description() {
		System.out.println("Car Insurance description:");	
		super.description();
		System.out.println("Κόστος Ασφάλειας: " + calculateIns());
	}
	

}
