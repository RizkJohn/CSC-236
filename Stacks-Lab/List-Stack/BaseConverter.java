package lab4_2;

import java.util.*;
import java.lang.*;

public class BaseConverter {
	public class BaseNumber {
		private long number;
		private long base;
		
		public BaseNumber() {
			number = 10;
			base = 0;
		}
		
		public BaseNumber(long num, long bas) {
			this.number = num;
			this.base = bas;
		}
		
		public long getNumber() {
			return number;
		}
		
		public long getBase() {
			return base;
		}
		
		public void setNumber(long num) {
			this.number = num;
		}
		
		public void setBase(long bas) {
			this.base = bas;
		}
	}
	
	private static final int MINIMUM_BASE = 2;
	private static final int MAXIMUN_BASE = 9;
	private static final int SIZE = 3;
	
	
	
	private BaseNumber [] baseNumber;
	
	public BaseConverter() {
		baseNumber = new BaseNumber[SIZE];
		
		inputPrompt();
	}
	
	public void inputPrompt() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a positive integer in base 10 and a base number between 2 and 9");
		
		long number;
		long base;
			
		for(int i = 0; i < SIZE; i++) {	
			System.out.print("Number: ");
			number = input.nextLong();
			
			
			//System.out.println();
			
			
				System.out.print("Base: ");
				base = input.nextLong();
			
			
			//System.out.println();
			
			baseNumber[i] = new BaseNumber(number, base);
		}	
		
	}
	
	public String convert(BaseNumber baseNumber) {
		ListStackDataStrucClass<Long> stack = new ListStackDataStrucClass<Long>();
		long number = baseNumber.getNumber();
		long base = baseNumber.getBase();
		String s = "";
		
		while(number != 0) {
			stack.push(number % base);
			s = s + (number % base) + "";
			number = number / base;
		}

		return s;
	}
	
	public static String reverseString(String rs) {
		StringBuilder sb = new StringBuilder(rs);
		sb.reverse();
		return sb.toString();
	}
	
	
	public String convertAll() {
		String str = "";
		
		for(int i = 0; i < SIZE; i++) {
			str = str + (baseNumber[i].getNumber() + "(Base 10) = " + BaseConverter.reverseString(convert(baseNumber[i])) + "(Base " + (baseNumber[i].getBase()) + ")\n");
		}
		
		return str;
	}
	
	public String toString() {
		return convertAll();
	}
	
	public void processAndPrint() {
		System.out.println(this);
	}

}
