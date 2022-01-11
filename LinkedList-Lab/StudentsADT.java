package lab3_LL;

public interface StudentsADT {
	public void setMaxNumberOfStudents(int num);
	public void addStudent(int id);
	public int getId();
	public void addCourse(int id, Course c);
	public void dropCourse(int id, Course c);
	public void Student(int id, Course course);
	public String toString();

}
