import java.util.Locale;


public class Class_09_Points_inside_the_House {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.ROOT);
		
		Point p1 = new Point(12.5, 8.5);
		Point p2 = new Point(22.5, 8.5);
		Point p3 = new Point(17.5, 3.5);
		
		Point p4 = new Point(12.5, 13.5);
		Point p5 = new Point(17.5, 8.5);
		
		Point p6 = new Point(20, 13.5);
		Point p7 = new Point(22.5, 8.5);
		
		Point p = new Point(23.001, 11.01);
		
		Triangle t = new Triangle(p1, p2, p3);
		Rectangle r1 = new Rectangle(p4, p5);
		Rectangle r2 = new Rectangle(p6, p7);
		
		if (t.pointInside(p) || r1.pointInside(p) || r2.pointInside(p)){
			System.out.println("Inside");
		}else{
			System.out.println("Outside");
		}
	}

}
