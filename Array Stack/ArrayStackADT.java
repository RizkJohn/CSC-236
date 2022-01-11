package lab4_1;


public interface ArrayStackADT<T>{
	public void initializeStack();
	public boolean isEmptyStack();
	public boolean isFullStack();
	public T push(T newElement) throws StackOverflowException;
	public T peek() throws StackUnderflowException;
	public void pop() throws StackUnderflowException;
	
	
}
