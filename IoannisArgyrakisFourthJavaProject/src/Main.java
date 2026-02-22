import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Insurance> InsuranceList = new ArrayList<Insurance>();
		Scanner input = new Scanner(System.in);
		
		HouseInsurance hi = new HouseInsurance(111, "Papadopoulos", 24, 80);
		InsuranceList.add(hi);
		
		CarInsurance ci = new CarInsurance(222, "Dimitriadis", 36, 1400);
		InsuranceList.add(ci);
		
		for (Insurance i: InsuranceList) {
			i.description();
		}
		
		System.out.println("All Insurances");
		for (Insurance i: InsuranceList) {
			System.out.println(i.getLastName() + ", " + i.calculateIns());
		}
		
		System.out.println("Please insert the code number that you want to share.");
		int answer = input.nextInt();
		boolean found = false;
		for (Insurance i: InsuranceList) {
			if (answer == i.getCodeNumnber()) {
				i.description();
				found = true;
				break;
			} 
		}
		
		if(!found) {
			System.out.println("There is no insurance " + answer);
		}
	}
}
