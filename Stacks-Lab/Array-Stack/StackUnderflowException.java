package lab4_1;

public class StackUnderflowException extends RuntimeException{
	public StackUnderflowException() {
		super ("Stack Underflow");
	}
	
	public StackUnderflowException(String msg) {
		super(msg);
	}
	
}


