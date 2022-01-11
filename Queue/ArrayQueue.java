package lab5;



public class ArrayQueue<T> {
	
	private int maxQueueSize;
	private int count;
	private int queueFront;
	private int queueRear;
	public T[] runway;
	
	
	public ArrayQueue() {
		
		maxQueueSize = 100;
		count = 0;
		queueFront = 0;
		queueRear = maxQueueSize - 1;
		runway = (T[]) new Object[maxQueueSize];
	}
	
	/*public ArrayQueue(int maxQueueSize1) {
		maxQueueSize = maxQueueSize1;
		queueFront = 0;
		queueRear = -1;
		count = 0;
		runway = (T[]) new Object[maxQueueSize];
	}*/
	
	public boolean isEmpty() {
		
			return count == 0;
	}
	
	public int count() {
		
		return count;
	}
	
	public T peek() {
		
		return runway[queueFront];
	}
	
	public T dequeue() {
		
		if(isEmpty()) {
			//throw new QueueUnderflowException;
		}
		
		T temp = runway[queueFront];
		runway[queueFront] = null;
		queueFront = (queueFront + 1) % runway.length;
		count--;
		return temp;
	}
	
	public void enqueue(T queueElement) {
		queueRear = (queueRear + 1) % runway.length;
		runway[queueRear] = queueElement;
		count++;
	}

}
