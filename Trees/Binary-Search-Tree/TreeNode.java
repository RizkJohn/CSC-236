package lab6_Pt1;

public class TreeNode {
	
	Object value;
	TreeNode left;
	TreeNode right;
	
	TreeNode() {
		value = 0;
		left = null;
		right = null;
	}
	
	TreeNode(Object initValue) {
		value = initValue;
		left = null;
		right = null;
	}
	
	TreeNode(Object initValue, TreeNode initLeft, TreeNode initRight) {
		value = initValue;
		left = initLeft;
		right = initRight;
	}
	
	Object getValue() {
		return value;
	}
	
	TreeNode getLeft() {
		return left;
	}
	
	TreeNode getRight() {
		return right;
	}
	
	public void setValue(Object newValue) {
		value = newValue;
	}
	
	public void setLeft(TreeNode newLeft) {
		left = newLeft;
	}
	
	public void setRight(TreeNode newRight) {
		right = newRight;
	}
	
	public int treeSum(TreeNode tree) {
		if (tree == null) {
			return 0;
		} else {
			return ((Integer)tree.getValue()).intValue() + treeSum(tree.getLeft()) + treeSum(tree.getRight());
		}
	}
	
	
	
}
