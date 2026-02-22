
public abstract class Teacher {

		private String lastName;
		private String afm;
		
		public Teacher(String lastName, String afm) {
			super();
			this.lastName = lastName;
			this.afm = afm;
		}
		
		public abstract double netMonthlySalary();

		public String getLastName() {
			return lastName;
		}	
}
