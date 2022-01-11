package lab4_2;


public class ListStackDataStrucClass<T> implements ListStackADT<T> {
	
	public class StackNode<T> {
		public T value;
		public StackNode<T> next;
	
	
		public StackNode() {
			this.value = null;
			this.next =null;
		}
		
		public StackNode(T element, StackNode<T> point) {
			this.value = element;
			this.next = point;
		}
		
		public T getValue(){
			return value;
		}
		
		public void setValue(T element) {
			this.value = element;
		}
		
		public StackNode<T> getNext(){
			return next;
		}
		
		public void setNext(StackNode<T> point) {
			this.next = point;
		}
		
		public StackNode(StackNode<T> stack) {
			this.value = stack.getValue();
			this.next = stack.getNext();
		}
		
		
		
	}
	
	private StackNode<T> stack;
	private StackNode<T> top;
	
	public ListStackDataStrucClass() {
		this.top = null;
	}
	
	public ListStackDataStrucClass(StackNode<T> stackTop) {
		this.top = stackTop;
	}


	
	public StackNode<T> getTop() {
		return top;
		
	}

	public void setTop(StackNode<T> top) {
		this.top = top;
		
	}

	@Override
	public boolean isEmpty() {
		return (top == null);
		
	}

	@Override
	public void ifEmpty() throws EmptyStackException{
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		
	}

	@Override
	public void push(T value) {
		if(isEmpty()) {
			setTop(new StackNode<T>(value, null));
		} else {
			StackNode<T> newNode;
			newNode = new StackNode<T>(value, getTop());
			setTop(newNode);
		}
	}

	@Override
	public T pop() throws EmptyStackException{
		if(top == null) {
			throw new EmptyStackException();
		} else {
			T element = getTop().getValue();
			setTop(getTop().getNext());
			return element;
		}
		
	}

	@Override
	public T peek() throws EmptyStackException{
		if(top == null) {
			throw new EmptyStackException();
		} else {
			return getTop().getValue();
		}
		
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		
		if(!isEmpty()) {
			StackNode<T> temp = getTop();
			
			while(temp != null) {
				sb.append(temp.getValue() + " ");
			}
		}
		
		sb.append("]");
		return sb.toString();
	}

}
