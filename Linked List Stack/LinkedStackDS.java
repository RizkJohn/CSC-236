package lab4_3;

public class LinkedStackDS<T> {
	
	private class StackNode<T>{
		private T value;
		private StackNode<T> next;
		
		public StackNode() {
			this.value = null;
			this.next = null;
		}
		
		public StackNode(T element, StackNode<T> point) {
			this.value = element;
			this.next = point;
		}
		
		public String toString() {
			return (String) stackTop.value;
		}
	}
	
	private StackNode<T> stackTop;
	
	public LinkedStackDS() {
		stackTop = null;
	}
	
	public LinkedStackDS(StackNode<T> top) {
		this.stackTop = top;
	}
	
	public LinkedStackDS(LinkedStackDS<T> stack) {
		this.stackTop = stack.stackTop;
	}
	
	public boolean isEmptyStack() {
		return(stackTop == null);
	}
	
	public void push(T newItem) {
		StackNode<T> newNode = new StackNode<T>(newItem, stackTop);
		
		stackTop = newNode;
	}
	
	public T peek() throws StackUnderflowException{
		if(isEmptyStack()) {
			throw new StackUnderflowException();
		}
		
		return stackTop.value;
	}
	
	public T pop() throws StackUnderflowException{
		if(isEmptyStack()) {
			throw new StackUnderflowException();
		} else {
			T element = stackTop.value;
			stackTop = stackTop.next;
			
			return element;
		}
	}	
}
