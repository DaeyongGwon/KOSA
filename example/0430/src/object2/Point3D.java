package object2;

public class Point3D extends Point2D {
	int z;

	@Override
	public String toString() {
		return super.toString() + ", Point3D [z = " + z + "]";
	}

	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
		System.out.println("Point3D(x,y,z) Constructor 수행");
	}

	public Point3D() {
		this(10000,20000,30000);
		System.out.println("Point3D 수행");
	}
}
