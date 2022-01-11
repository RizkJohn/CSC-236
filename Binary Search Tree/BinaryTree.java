package lab6_Pt1;

public abstract class BinaryTree{
	
	TreeNode root;
	
	public static class TreeNode{
		int value;
		TreeNode left;
		TreeNode right;
		
		public TreeNode() {
			this.value = 0;
			left = null;
			right = null;
		}
		
		public TreeNode(int value) {
			this.value = value;
			left = null;
			right = null;
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
		
		public void setValue(int newValue) {
			this.value = newValue;
		}
		
		public void setLeft(TreeNode newLeft) {
			left = newLeft;
		}
		
		public void setRight(TreeNode newRight) {
			right = newRight;
		}
		
	
	}
	
	public BinaryTree() {
		root = null;
	}
	
	public TreeNode getRoot() {
		return root;
	}
	
	public void setRoot(TreeNode newNode) {
		root = newNode;
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	public void swapSubtrees() {
		swapSubtrees(root);
	}
	
	public void swapSubtrees(TreeNode node) {
		if(node != null) {
			swapSubtrees(node.left);
			swapSubtrees(node.right);
			
			TreeNode temp = node.left;
			node.left = node.right;
			node.right = temp;
		}
		
	}
	
	public int singleParent() {
		return singleParent(root); 
	}
	
	public int singleParent(TreeNode node) {
		if(node == null || countTheLeafs(node) == 0) {
			return 0;
		}
		
		if(countTheLeafs(node) == 1) {
			return 1 + singleParent(node.left) + singleParent(node.right);
		}
		
		if(countTheLeafs(node) == 2) {
			return singleParent(node.left) + singleParent(node.right);
		}
		
		return 0;
	}
	
	public int countTheLeafs(TreeNode node) {
		int numberOfLeafs = 0;
		if(node.left != null) {
			numberOfLeafs++;
		}
		
		if(node.right != null) {
			numberOfLeafs++;
		}
		
		return numberOfLeafs;
	}
	
	public void postorder() {
		doPostOrder(root);
	}
	
	private void doPostOrder(TreeNode t) {
		if (t != null) {
			doPostOrder(t.left);
			doPostOrder(t.right);
			System.out.println(t.value);
		}
	}
	
	public abstract <T> void insert(Comparable <T> item);
	
	public abstract <T> TreeNode find(Comparable <T> key);
		
	
	
	

}
