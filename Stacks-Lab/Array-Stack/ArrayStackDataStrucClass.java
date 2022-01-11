package lab4_1;


public class ArrayStackDataStrucClass<T> implements ArrayStackADT<T>{
	
	public int maxStackSize;
	public int stackTop;
	public T [] arr;
	
	public ArrayStackDataStrucClass(int maxStackSize2) {
		maxStackSize = 50;
		stackTop = 0;
		arr = (T[]) new Object[maxStackSize];
	}
	
	
	public ArrayStackDataStrucClass(int size, int top, T[] array) {
		this.maxStackSize = size;
		this.stackTop = top;
		this.arr = array;
	}
	
	public ArrayStackDataStrucClass(ArrayStackDataStrucClass<T> stack) {
		maxStackSize = stack.maxStackSize;
		stackTop = stack.stackTop;
		arr = stack.arr;
	}

	@Override
	public void initializeStack() {
		for(int i = 0; i < stackTop; i++) {
			arr[i] = null;
		}
		
		stackTop = 0;
	}

	@Override
	public boolean isEmptyStack() {
		return (stackTop == 0);
	}

	@Override
	public boolean isFullStack() {
		return (stackTop == maxStackSize);
	}



	@Override
	public T push(T newElement) throws StackOverflowException{
		if(isFullStack()) {
			throw new StackOverflowException();
		}
			arr[stackTop] = (T) newElement;
			
			stackTop++;
			return arr[stackTop];
		
	}

	@Override
	public T peek() throws StackUnderflowException{
		if(isEmptyStack()) {
			throw new StackUnderflowException();
		} 
			return arr[stackTop -1];
	}


	@Override
	public void pop(){
		if(isEmptyStack()) {
			throw new StackUnderflowException();
		} 
			stackTop--;
			arr[stackTop] = null;
		
	}

	
	
}
