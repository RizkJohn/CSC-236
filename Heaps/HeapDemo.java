package lab6_Pt2;

import lab6_Pt2.HeapPriorityQueue;

public class HeapDemo <T extends Comparable<T>>{

	public static void main(String[] args) {
		HeapPriorityQueue  <Integer> heap = new Heap <Integer>(10);
		heap.enqueue(1);
		heap.enqueue(2);
		heap.enqueue(3);
		heap.enqueue(4);
		heap.enqueue(5);
		heap.enqueue(6);
		heap.enqueue(7);
		heap.enqueue(8);
		heap.enqueue(9);
		heap.enqueue(10);
		
		System.out.println(heap);
		
		System.out.println(heap.dequeue() + "\n");
		System.out.println(heap.dequeue() + "\n");
		
		System.out.println(heap);

	}

}
