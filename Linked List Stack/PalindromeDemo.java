package lab4_3;

import javax.swing.*;

public class PalindromeDemo {

	public static void main(String[] args) {
		LinkedStackDS<Character> palindromeStack = new LinkedStackDS<Character>();
		
		String inputStr;
		String replaceStr;
		String reverseStr = "";
		int test;
		
		do {
			inputStr = JOptionPane.showInputDialog("Input a String");
			
			replaceStr = inputStr.replaceAll("[^a-zA-Z]", "");
			replaceStr = replaceStr.replaceAll(",", "");
			replaceStr = replaceStr.replaceAll("!", "");
			replaceStr = replaceStr.replaceAll("'", "");
			
			for(int i = 0; i < replaceStr.length(); i++) {
				char c = replaceStr.charAt(i);
				palindromeStack.push(replaceStr.charAt(i));
			}
			
			while(!palindromeStack.isEmptyStack()) {
				Character reverseChar = palindromeStack.peek();
				reverseStr += reverseChar;
				palindromeStack.pop();
			}
			
			if(replaceStr.compareToIgnoreCase(reverseStr) == 0) {
				JOptionPane.showMessageDialog(null, inputStr + " is a palindrome");
			} else {
				JOptionPane.showMessageDialog(null, inputStr + " is not a palindrome");
			}
			
			test = JOptionPane.showConfirmDialog(null, "Test another palindrome?", 
					"Try another palindrome", JOptionPane.YES_NO_OPTION);
			
			if (test == 1) {
				JOptionPane.showMessageDialog(null, "Goodbye", "Program Ends.",
						JOptionPane.INFORMATION_MESSAGE);
			}
			
			
		}
		while(test == 0);

	}

}
