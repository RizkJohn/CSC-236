// John Rizkalla CSC236

package lab2_ADT;

public class LockDataStructures {
	
	int x;
	int y;
	int z;
	boolean status = true;
	
	public void LockDataStructures() {
		this.x = 0;
		this.y = 0;
		this.z = 0;	
	}
	
	public void LockDataStructures(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getZ() {
		return z;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setZ(int z) {
		this.z = z;
	}
	
	public void alter(int x, int y, int z) {	
		setX(x);
		setY(y);
		setZ(z);
	}
	
	public void turn(int x, int y, int z) {
		
		System.out.print("0 ");
		int t = 0;
		
		for(int i = 1;i <= 2; i++) {
			for(int j = 39; j <= i; j--) {
				System.out.print(j + " ");	 
			}
			
			t = x;
		}
		
		System.out.println();
		
		int temp = 39;
		
		for(int e = 1; e <= 2; e++) {
			for(int m = x; m <= temp; m++) {
				System.out.print(m + " ");
			}
		x = 0;
		temp = y;
		}
		
		System.out.println();
		
		if(y > z) {
			for(int q = y; q >= z; q--) {
				System.out.print(q + " ");
			}
			
		} else {
			for(int w = y; w >= 0; w--) {
				System.out.println(w + " ");
			}
			
			for(int r = 39; r >= z; r--) {
				System.out.println(r + " ");
			}
		}
	}
	
	public void close() {
		status = false;
	}
	
	public void attempt(int x, int y, int z) {
		turn(x,y,x);
		
		if(this.x == x && this.y == y && this.z == z) {
			status = false;
		}
	}
	
	public String inquire() {
		if(status = false) {
			return "Locker is UNLOCKED";
		} else {
			return "Locker is LOCKED";
		}
	}
	
	public int currently() {
		return z;
	}

}
