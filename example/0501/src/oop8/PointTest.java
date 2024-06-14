package oop8;

public class PointTest {
	public static void main(String[] args) {
		Point2D up = new Point3D();
		up.x = 100;
		up.y = 200;
//		up.z = 100; 

		Point3D down = (Point3D) up;
		down.x = 1000;
		down.y = 2000;
		down.z = 3000;

	}
}
