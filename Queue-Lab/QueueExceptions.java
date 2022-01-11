package lab5;

public class QueueExceptions extends RuntimeException{
	public QueueExceptions() {
		
	}
	
	public QueueExceptions(String msg) {
		super(msg);
		msg = "Queue";
	}
}
