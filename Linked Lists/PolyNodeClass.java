package lab3_LL;

public class PolyNodeClass {
	private int coefficient;
	private int exponent;
	private PolyNodeClass next;
	
	public PolyNodeClass() {
		this.coefficient = 0;
		this.exponent = 0;
		this.next = null;
	}
	
	public PolyNodeClass(int coef, int expo, PolyNodeClass next) {
		this.coefficient = coef;
		this.exponent = expo;
		this.next = null;
	}
	
	public PolyNodeClass(PolyNodeClass p) {
		this.coefficient = p.coefficient;
		this.exponent = p.exponent;
		this.next = p.next;
	}
	
	public void setCoefficient(int coef) {
		this.coefficient = coef;
	}
	
	public void setExponent(int expo) {
		this.exponent = expo;
	}
	
	public void setNext(PolyNodeClass next) {
		this.next = next;
	}
	
	public int getCoefficient() {
		return coefficient;
	}
	
	public int getExponent() {
		return exponent;
	}
	
	public PolyNodeClass getNext() {
		return next;
	}
	
	

}
