package lab7_1;

public interface LinkedListInterface<T> extends Cloneable{
	public Object clone();
	public boolean isEmpty();
	public void print();
	public int length();
	public T front();
	public T back();
	public boolean search(T item);
	public void insertFirst(T newItem);
	public void insertLast(T newItem);
	public void deleteNode(T item);
}
