package lab4_3;

public interface LinkedStackADT<T> {
	public String toString();
	public boolean isEmptyStack();
	public void push(T newItem);
	public T peek() throws StackUnderflowException;
	public T pop() throws StackUnderflowException;

}
