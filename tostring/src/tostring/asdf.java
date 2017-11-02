package tostring;

public class asdf {
	public static void main(String[] args) {
		Circle obj = new Circle(2, 3, 30);
		System.out.println(obj);
	}
}

class Circle{
	private int x, y, z;
	public Circle(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	@Override
	public String toString() {
		return "Circle (" + x +", " + y + ", " + z + ")";
	}
	
	
}
