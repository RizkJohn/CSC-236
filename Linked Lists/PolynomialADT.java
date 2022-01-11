package lab3_LL;

public interface PolynomialADT {
	
	public boolean isEmpty();
	public void PolyNodeClass(int coef, int expo, PolyNodeClass next);
	public void setFirstNode(PolyNodeClass firstNode);
	public PolyNodeClass getFirstNode();
	public PolyNodeClass setNext();
	public PolyNodeClass getNext(PolyNodeClass next);
	public void addPolyNodeFirst(int coef, int expo);
	public void addPolyNodeLast(int coef, int expo);
	public boolean addPolyNode(int coef, int expo);
	public void addPolynomials (int coef, int expo);
	public String toString();
	
	

}
