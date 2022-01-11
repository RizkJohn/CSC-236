package lab2_ADT;

public class LockADT {
	
	public LockDataStructures();
	public LockDataStructures(int x, int y, int z);	
	public int getX();
	public int getY();
	public int getZ();
	public void setX(int x);
	public void setY(int y);
	public void setZ(int z);
	public void alter(int x, int y, int z);
	public void turn(int x, int y, int z);
	public void close();
	public void attempt(int x, int y,int z);
	public String inquire();
	public int currently();

}
