package lab6_Pt1;

public interface BTInterface<T extends Comparable<T>> {
	public TreeNode getRoot();
	public void setRoot(TreeNode newNode);
	public boolean isEmpty();
	public void swapSubtrees();
	public abstract void singleParent();
	public void preorder();
	public void postorder();
	public void inorder();
	public abstract void insert(Comparable <T> key);
	public abstract TreeNode find(Comparable <T> key);
}
