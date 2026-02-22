import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		School school1 = new School("1st Highschool Polygyros", "Papadopoulos");
		School school2 = new School("17th Highschool Thessaloniki", "Nikolaou");
		School school3 = new School("3rd Highschool Patras", "Iosifidou");
		SubTeacher teacher1 = new SubTeacher("Papanikolaou","1234",8.0,150);
		SubTeacher teacher2 = new SubTeacher("Dimitriadis","5678",8.5,140);
		SubTeacher teacher3 = new SubTeacher("Georgiadou","9123",9,160);
		PermTeacher teacher4 = new PermTeacher("Argyriou","4567",1400,0.2,0);
		PermTeacher teacher5 = new PermTeacher("Amanatidis","8912",1380,0.2,1);
		PermTeacher teacher6 = new PermTeacher("Anastasiadou","3456",1450,0.2,3);
		
		ArrayList<School> schools = new ArrayList<School>();
		school1.addTeacher(teacher1);
		school2.addTeacher(teacher2);
		school3.addTeacher(teacher3);
		school1.addTeacher(teacher4);
		school2.addTeacher(teacher5);
		school3.addTeacher(teacher6);
		schools.add(school1);
		schools.add(school2);
		schools.add(school3);
		
		InputForm form = new InputForm(schools);
	}

}
