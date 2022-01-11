package lab3_LL;

public class PolynomialDemoClass {

	public static void main(String[] args) {
		
		PolynomialDataStrucClass p1 = new PolynomialDataStrucClass();
		PolynomialDataStrucClass p2 = new PolynomialDataStrucClass();
		PolynomialDataStrucClass p3 = new PolynomialDataStrucClass();
		PolynomialDataStrucClass p4 = new PolynomialDataStrucClass();
		PolynomialDataStrucClass p5 = new PolynomialDataStrucClass();
		PolynomialDataStrucClass p6 = new PolynomialDataStrucClass();
		
		p1.addPolyNodeFirst(4, 3);
		p1.addPolyNodeFirst(3, 2);
		p1.addPolyNodeLast(-5, 0);

		
		p2.addPolyNodeFirst(3, 5);
		p2.addPolyNodeFirst(4, 4);
		p2.addPolyNodeFirst(1, 3);
		p2.addPolyNodeFirst(-4, 2);
		p2.addPolyNodeFirst(4, 1);
		p2.addPolyNodeLast(2, 0);
		
		p3.addPolyNodeFirst(-5, 0);
		p3.addPolyNodeFirst(3, 2);
		p3.addPolyNodeLast(4, 3);
		
		p4.addPolyNodeFirst(-4, 0);
		p4.addPolyNodeFirst(4, 3);
		p4.addPolyNodeLast(5, 4);
		
		p5.addPolynomials(p1, p2);
		p6.addPolynomials(p3, p4);
		
		System.out.println("p1 = " + p1.toString());
		System.out.println("p2 = " + p2.toString());
		System.out.println("p3 = " + p3.toString());
		System.out.println("p4 = " + p4.toString() + "\n");
		
	
		System.out.println("Sum of p1 and p2 = " + p5.toString());
		System.out.println("Sum of p3 and p4 = " + p6.toString());

	}

}
