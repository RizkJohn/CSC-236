package lab2_ADT;
import java.util.*;

public class LockDemo {
	public static void main(String [] args) {
		lockMenu();
		
	}
	
	public static void lockMenu(){
		int x;
		int y;
		int z;		
		
		Scanner input = new Scanner(System.in);
		
		LockDataStructures n = new LockDataStructures();
		
		 System.out.println("\nSelect an option for the lock.\n");
		 System.out.println("1: Set lock combination. ");
		 System.out.println("2: Close lock.");
		 System.out.println("3: Check status.");
		 System.out.println("4: Attempt to open lock.");
		 System.out.println("5: Check what the dial is currently point at.");
		 System.out.println("6: exit the program");
		 
		 String menuSelection = input.next();
		 
		 
		 switch(menuSelection) {
		 case "1":
			 System.out.println("Set a new combination for the lock.\n");

		      System.out.println("Enter the first number of the combination.");
		      x = input.nextInt();
		      System.out.println("Enter the second number of the combination.");
		      y = input.nextInt();
		      System.out.println("Enter the third number of the combination.");
		      z = input.nextInt();
		 
		      n.alter(x,y,z);
		 break;
		 case "2":
		     System.out.println("Lock Closed");
		     n.close();
		     n.inquire();
		 break;
		 case "3":
			 n.inquire();
		 break;
		 case "4":
		 {
		      System.out.println(" ATTEMPT ");
		      System.out.println("Enter the first number of the combination.");
		      x = input.nextInt();
		      System.out.println("Enter the second number of the combination.");
		      y = input.nextInt();
		      System.out.println("Enter the third number of the combination.");
		      z = input.nextInt();
		      n.attempt(x,y,z);
		  }
		 
		 case "5":
		 {
		      System.out.println("The top number currently is: " + n.currently());
		 }
		 case "6":
		 {
			 System.out.println("Exiting . . . ");
		  System.exit(0);
		 }
		 default:
		 {
		      System.out.println("*** INVALID SELECTION ***");
		      
		      
		 }
		 }
	}
}


		
		
		
		
		
		
			




