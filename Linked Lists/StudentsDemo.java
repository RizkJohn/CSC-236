package lab3_LL;

import java.util.*;

public class StudentsDemo{
	
	public static void main(String args[]) {
		
		int num = 1;
		Students s = new Students();
		
		Scanner input = new Scanner(System.in);
		
		s.addStudent(1111);
		s.addStudent(1234);
		s.addStudent(2357);
		
		do {
			System.out.println("What action would you like to implement?");
			System.out.println("1: Show all Students");
			System.out.println("2: Add a Course");
			System.out.println("3: Drop a Course");
			System.out.println("9: Quit");
			
			num = input.nextInt();
			
			if(num == 1) {
				System.out.println(s + "\n");
				
			} else if(num == 2) {
				System.out.println("Enter ID");
				int id = input.nextInt();
				input.nextLine();
				System.out.println("Course Name");
				String courseName = input.nextLine();
				System.out.println("Section Number");
				int sectionNumber = input.nextInt();
				System.out.println("Credits");
				int credits = input.nextInt();
				
				Course c = new Course(courseName, sectionNumber, credits, null);
				
				s.addCourse(id, c);
				
				System.out.println(c + " is now added to " + id + "'s schedule\n");
				
			} else if(num == 3) {
				System.out.println("Enter ID");
				int id = input.nextInt();
				input.nextLine();
				System.out.println("Course Name");
				String courseName = input.nextLine();
				int sectionNumber = 0;
				int credits = 0;
				
				Course c = new Course(courseName, sectionNumber, credits, null);
				
				s.dropCourse(id, c);
				
				System.out.println(c + " is now dropped from " + id + "'s schedule\n");
				
			}
		} while(num != 9);
		if(num == 9) {
			System.out.println("Goodbye");
			System.exit(0);
		}
	}

}
