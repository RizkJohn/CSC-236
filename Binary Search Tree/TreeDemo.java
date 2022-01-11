package lab6_Pt1;

import java.util.*;

public class TreeDemo{
	static BinaryTree p;
	static Comparable item;
	
	ArrayList<Integer> BinarySearchTree;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		BinarySearchTree tree1 = new BinarySearchTree();

		tree1.insert(1);
		tree1.insert(2);
		tree1.insert(3);
		tree1.insert(4);
		tree1.insert(5);
		tree1.insert(6);
		
		tree1.swapSubtrees();
		
		BinarySearchTree tree2 = new BinarySearchTree();
		
		tree2.insert(14);
		tree2.insert(4);
		tree2.insert(15);
		tree2.insert(3);
		tree2.insert(9);
		tree2.insert(18);
		tree2.insert(7);
		tree2.insert(16);
		tree2.insert(20);
		tree2.insert(5);
		tree2.insert(17);
		
		tree2.swapSubtrees();
		
		System.out.println("POSTORDER: ");
		tree1.postorder();
		tree2.postorder();
	}

	
}
