package lab6_Pt2;

public interface HeapPriorityQueueADT<T extends Comparable <T>> {
	public T Heap(int maxSize);
	public boolean isEmpty();
	public boolean isFull();
	public void enqueue(T element) throws HeapOverflowException;
	public T dequeue() throws HeapUnderflowException;
	public void reheapifyUpward();
	public void reheapifyDownward();
	public void reposition();
	
}
