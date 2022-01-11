package lab4_3;

public class StackException extends RuntimeException{
	public StackException() {
		super ("Stack Exception");
	}
	
	public StackException(String msg) {
		super(msg);
	}

}
