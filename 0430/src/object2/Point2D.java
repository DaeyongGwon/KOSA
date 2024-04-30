package object2;

public class Point2D {
	int x;
	int y;
	
	public Point2D() {
		this(10, 20);
		System.out.println("Point2D() Constructor 수행");
	}

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point2D(x,y) Constructor 수행");
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Point2D [x= " + x + ", y= " + y + "]";
	}
}
