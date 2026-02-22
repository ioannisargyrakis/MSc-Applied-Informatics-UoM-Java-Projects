public class TestEmployee {

	public static void main(String[] args) {
		Employee eleni = new Employee("Ελένη Παπαδοπούλου", "ΠΕ", 2, 25, true, 2, 1800);
		Employee nikos = new Employee("Νίκος Παπαδόπουλος", "ΠΕ", 1, 4, true, 2, 1200);
		eleni.monthlySalary();
		nikos.monthlySalary();
		eleni.getValues();
		nikos.getValues();
		System.out.println("Αλλαγή του αριθμού ανήλικων παιδιών του/της Ελένη Παπαδοπούλου");
		eleni.setNumChilder(-3);
		System.out.println("Αλλαγή του αριθμού ανήλικων παιδιών του/της Ελένη Παπαδοπούλου");
		eleni.setNumChilder(-2);
		eleni.setBonus(10, 30);
		nikos.setBonus(10, 30);
		eleni.monthlySalary();
		nikos.monthlySalary();
		System.out.println("Υπολογισμός μηνιαίου εισοδήματος του/της Ελένη Παπαδοπούλου");
		eleni.getValues();
		System.out.println("Υπολογισμός μηνιαίου εισοδήματος του/της Νίκος Παπαδόπουλος");
		nikos.getValues();
	}

}
