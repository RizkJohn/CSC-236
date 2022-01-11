package lab6_Pt1;

import java.util.*;

public abstract class BinarySearchTree extends BinaryTree{
	
	public BinarySearchTree() {
		super();
	}
	
	public TreeNode recurInsert(TreeNode t, Comparable item) {
		if (t == null) {
			return new TreeNode(item);
		} else if(item.compareTo(t.getValue()) < 0){
			t.setLeft(recurInsert(t.getLeft(), item));
		} else {
			t.setRight(recurInsert(t.getRight(), item));
		}
		
		return t;
	}
	
	public void insert(Comparable item) {
		setRoot(recurInsert(getRoot(), item));
		
		if(getRoot() == null) {
			setRoot(new TreeNode(item));
		} else {
			TreeNode p = null;
			TreeNode q = getRoot();
			while(q != null) {
				p = q;
				if(item.compareTo(p.getValue()) < 0) {
					q = p.getLeft();
				} else {
					q = p.getRight();
				}
			}
			
			if(item.compareTo(p.getValue()) < 0) {
				p.setLeft(new TreeNode(item));
			} else {
				p.setRight(new TreeNode(item));
			}
		}
	}
	
	public TreeNode find(Comparable key) {
		TreeNode p = getRoot();
		
		while(p != null && key.compareTo(p.getValue()) != 0) {
			if(key.compareTo(p.getValue()) < 0) {
				p = p.getLeft();
			} else {
				p = p.getRight();
			}
		}
		
		return p;
	}
	
}
	
	
	