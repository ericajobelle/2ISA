import src.Geometry;
import src.Point;

public class Test {

	public static void main(String[] args) {
		Point[] pts = {new Point(3,2,4), new Point(5,3,-2), new Point(4,2,-5)};
		System.out.println("Total Path Length = " + Geometry.getPathLength(pts));

	}

}
