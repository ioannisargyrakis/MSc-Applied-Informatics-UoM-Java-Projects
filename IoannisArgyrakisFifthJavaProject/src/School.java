import java.util.ArrayList;

public class School {
	
	private String name;
	private String principal;
	private ArrayList<Teacher> teachers;
	
	public School(String name, String principal) {
		this.name = name;
		this.principal = principal;
		this.teachers = new ArrayList<Teacher>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrincipal() {
		return principal;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	} 
	
	public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    
    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }
	
}
