package lab3_LL;

public class Course {
	private int id;
	private String courseName;
	private int sectionNumber;
	private int numberOfCredits;
	private Course link;
	
	
	public Course() {
		this.id = 0;
		this.courseName = "";
		this.sectionNumber = 0;
		this.numberOfCredits = 0;
		this.link = null;
	}
	
	public Course(String course, int section, int credits, Course link) {
		this.courseName = course;
		this.sectionNumber = section;
		this.numberOfCredits = credits;
		this.link = link;
	}
	
	public Course(Course c) {
		this.id = c.id;
		this.courseName = c.courseName;
		this.sectionNumber = c.sectionNumber;
		this.numberOfCredits = c.numberOfCredits;
		this.link = c.link;
	}
	
	public void setCourseName(String course){
		this.courseName = course;
	}
	
	public void setSectionNumber(int section) {
		this.sectionNumber = section;
	}
	
	public void setNumberOfCredits(int credits) {
		this.numberOfCredits = credits;
	}
	
	public void setLink(Course link) {
		this.link = link;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public int getSectionNumber() {
		return sectionNumber;
	}
	
	public int getNumberOfCredits() {
		return numberOfCredits;
	}
	
	public Course getLink() {
		return link;
	}
	
	@Override
	public String toString() {
		String str = "CourseName: " + courseName + " Section: " + sectionNumber +
				" Credits: " + numberOfCredits;
		
		return str;
	}
	

}
