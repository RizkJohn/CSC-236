package lab4_1;

public class StackException extends RuntimeException{
	public StackException() {
		super ("Stack Exception");
	}
	
	public StackException(String msg) {
		super(msg);
	}

}
