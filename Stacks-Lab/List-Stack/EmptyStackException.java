package lab4_2;

public class EmptyStackException extends StackException{
	public EmptyStackException() {
		super ("Empty Stack");
	}
	
	public EmptyStackException(String msg) {
		super (msg);
	}

}
