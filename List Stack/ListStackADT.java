package lab4_2;

public interface ListStackADT<T> {
	public boolean isEmpty();
	public void ifEmpty() throws EmptyStackException;
	public void push(T value);
	public T pop() throws EmptyStackException;
	public T peek() throws EmptyStackException;
	public String toString();
	

}
