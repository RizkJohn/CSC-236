package lab3_LL;

public class PolynomialDataStrucClass implements PolynomialADT {
	
	private PolyNodeClass firstNode;
	
	
	public PolynomialDataStrucClass() {
		this.firstNode = null;
		//this.lastNode = null;
	}
	
	public PolynomialDataStrucClass(int coef, int expo) {
		this.firstNode = new PolyNodeClass(coef, expo, null);
	}
	
	
	@Override
	public boolean isEmpty() {
		return firstNode == null;
	}
	
	@Override
	public void setFirstNode(PolyNodeClass firstNode) {
		this.firstNode = firstNode;
	}
	
	@Override
	public PolyNodeClass getFirstNode() {
		return firstNode;
	}
	
	@Override
	public void addPolyNodeFirst(int coef, int expo) {
		if(isEmpty()) {
			
			firstNode = new PolyNodeClass(coef, expo, null);
			
		} else {
			
			firstNode = new PolyNodeClass(coef, expo, firstNode);
		}
		
	}
	
	@Override
	public void addPolyNodeLast(int coef, int expo) {
		if(isEmpty()) {
			firstNode = new PolyNodeClass(coef, expo, null);
			
		} else {
			PolyNodeClass current = firstNode;
			while(current.getNext() != null) {
				current = current.getNext();
				
				current.setNext(new PolyNodeClass(coef, expo, null));
			}
		}		
	}
	@Override
	public boolean addPolyNode(int coef, int expo) {
		if(isEmpty()) {
			firstNode = new PolyNodeClass(coef, expo, null);
			return true;
		} else if(!isEmpty()) {
			PolyNodeClass current = firstNode;
			current = current.getNext();
			
			current.setNext(new PolyNodeClass(coef, expo, null));
			return true;
		}
		
		return false;
		
		
		
	}
	public void addPolynomials(PolynomialDataStrucClass one,PolynomialDataStrucClass two )
	{
		int newCoef = 0;
		PolynomialDataStrucClass p = new PolynomialDataStrucClass();
		PolyNodeClass p1 =  new PolyNodeClass(one.firstNode);
				
		PolyNodeClass p2 =  new PolyNodeClass(two.firstNode);
		while(p1 != null || p2 != null)
		{
		
		
		while(p1.getExponent() != p2.getExponent())
		{
			if(p1.getExponent() > p2.getExponent())
			{
				p.addPolyNodeFirst(p1.getCoefficient(),p1.getExponent());
				p1 = p1.getNext();
			}
			else
			{
			p.addPolyNodeFirst(p2.getCoefficient(),p2.getExponent());
			p2 = p2.getNext();
			}
		}
		
		
		if(p1.getExponent() == p2.getExponent())
		{
			newCoef = p1.getCoefficient() + p2.getCoefficient();
			p.addPolyNodeFirst(newCoef,p1.getExponent());
			p1 = p1.getNext();
			p2 = p2.getNext();
		}
		
		
		}
		System.out.println(p);
	}
	
	@Override
	public String toString() {
		if(isEmpty()) {
			return "Empty";
		} else {
			String s = "";
			PolyNodeClass current = firstNode;
			while(current != null) {
				s = s + current.getCoefficient() + "x " + "^" + current.getExponent(); 
			}
			return s;
		}
	}

	@Override
	public void PolyNodeClass(int coef, int expo, PolyNodeClass next) {

		
	}


	@Override
	public lab3_LL.PolyNodeClass setNext() {

		return null;
	}

	@Override
	public lab3_LL.PolyNodeClass getNext(lab3_LL.PolyNodeClass next) {

		return null;
	}

	@Override
	public void addPolynomials(int coef, int expo) {
		// TODO Auto-generated method stub
		
	}

}
