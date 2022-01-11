package lab7_1;

public class UnorderedLinkedList<T> extends LinkedListClass<T> {
	public UnorderedLinkedList() {
		super();
	}
	
	public boolean search(T item) {
		LinkedListNode<T> current;
		boolean found;
		
		current = first;
		
		found = false;
		
		while (current != null && !found) {
			if(current.info.equals(item)) {
				found = true;
			} else {
				 current = current.link;
			}
		}
		
		return found;
	}
	
	public void insertFirst(T newItem) {
		LinkedListNode<T> newNode;
		
		newNode = new LinkedListNode<T>(newItem, first);
		
		first = newNode;
		
		if(last == null) {
			last = newNode;
		}
		
		count++;
	}
	
	public void insertLast(T newItem) {
		LinkedListNode newNode;
		
		newNode = new LinkedListNode(newItem, null);
		
		if(first == null) {
			first = newNode;
			last = newNode;
		} else {
			last.link = newNode;
			last = newNode;
		}
		
		count++;
	}
	
	public void deleteNode(T deleteItem) {
		LinkedListNode<T> current;
		LinkedListNode<T> trailCurrent;
		boolean found;
		
		if(first == null) {
			System.err.println("Cannot delete from an empty list");
		} else {
			if(first.info.equals(deleteItem)) {
				first = first.link;
				
				if(first == null) {
					last = null;
				}
				
				count--;
			} else {
				found = false;
				trailCurrent = first;
				current = first.link;
				
				while (current != null && !found) {
					if(current.info.equals(deleteItem)) {
						found = true;
					} else {
						trailCurrent = current;
						current = current.link;
					}
				}
				
				if (found) {
					count--;
					trailCurrent.link = current.link;
					
					if(last == current) {
						last = trailCurrent;
					} else {
						System.out.println("Item to be deleted is not in the list.");
					}
				}
			}
		}
	}
	

}
