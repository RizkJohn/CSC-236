package lab7_1;

public interface QueueInterface<T> {
	public void initializeQueue();
	public boolean isEmptyQueue();
	public boolean isFullQueue();
	public T front() throws QueueUnderflowException;
	public T back() throws QueueUnderflowException;
	public void addQueue(T queueElement) throws QueueOverflowException;
	public void deleteQueue() throws QueueUnderflowException;

}
