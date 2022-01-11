package lab4_1;

public class StackOverflowException extends RuntimeException {
	public StackOverflowException() {
		super ("Stack Overflow");
	}
	
	public StackOverflowException(String msg) {
		super(msg);
	}

}
