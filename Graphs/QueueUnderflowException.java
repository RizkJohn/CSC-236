package lab7_1;

public class QueueUnderflowException extends RuntimeException{
	public QueueUnderflowException() {
		super();
	}
	
	public QueueUnderflowException(String msg) {
		super(msg);
	}

}
