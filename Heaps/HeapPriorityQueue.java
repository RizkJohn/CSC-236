package lab6_Pt2;

import java.util.*;

public class HeapPriorityQueue <T extends Comparable <T>>{
	private ArrayList <T> elements;
	private int lastIndex;
	private int maxIndex;
	private int maxSize;
	
	public void Heap(int maxSize) {
		elements = new ArrayList<T>(maxSize);
		lastIndex = -1;
		maxIndex = maxSize - 1;
	}
	
	public boolean isEmpty() {
		return (lastIndex == -1);
	}
	
	public boolean isFull() {
		return (lastIndex == maxIndex);
	}
	
	public void enqueue(T element) throws HeapOverflowException {
		if(lastIndex == maxIndex) {
			throw new HeapOverflowException("Priority Queue is full");
		} else {
			lastIndex ++;
			elements.add(lastIndex, element);
			reheapifyUpward(element);
		}
	}
	
	private void reheapifyUpward(T element) {
		int hole = lastIndex;
		while ((hole > 0) && (element.compareTo(elements.get((hole - 1) / 2), element))) {
			elements.set(hole, elements.get((hole - 1) / 2));
			hole = (hole - 1) / 2;
		}
		
		elements.set(hole, element);
	}
	
	public T dequeue() throws HeapUnderflowException {
		T hold;
		T toMove;
		
		if (lastIndex == -1) {
			throw new HeapUnderflowException("Priority Queue is empty");
		} else {
			hold = elements.get(0);
			toMove = elements.remove(lastIndex);
			lastIndex --;
			if(lastIndex != -1) {
				reheapifyDownward(toMove);
			}
			return hold;
		}
	}
	
	private void reheapifyDownward(T element) {
		int hole = 0;
		int newhole;
		
		newhole = newHole(hole, element);
		
		while (newhole != hole) {
			elements.set(hole, elements.get(newhole));
			hole = newhole;
			newhole = newHole(hole, element);
		}
		elements.set(hole, element);
	}
	
	private int newHole(int hole, T element) {
		int left = (hole * 2) + 1;
		int right = (hole* 2) + 2;
		
		if(left > lastIndex) {
			return hole;
		} else {
			if(left == lastIndex) {
				if(elements.get(left).compareTo(elements.get(right)) < 0) {
					return left;
				} else {
					return hole;
				}
			} else {
				if (elements.get(left).compareTo(elements.get(right)) < 0) {
					if (elements.get(right).compareTo(element) <= 0) {
						return hole;
					} else {
						return right;
					}
				} else {
					if (elements.get(left).compareTo(element) <= 0) {
						return hole;
					} else {
						return left;
					}
				}
			}
		}
	}
	
	public String toString() {
		String theHeap = new String("the heap is:\n");
		for(int i = 0; i <= lastIndex; i++) {
			theHeap = theHeap + i + ". " + elements.get(i) + "\n";
		}
		
		return theHeap;
	}

	

	

}














