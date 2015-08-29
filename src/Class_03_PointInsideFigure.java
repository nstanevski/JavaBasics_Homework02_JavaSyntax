import java.util.Locale;
import java.util.Scanner;

public class Class_03_PointInsideFigure {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		Scanner console = new Scanner(System.in);
		
		Rectangle r1 = new Rectangle(new Point(12.5, 13.5), new Point(17.5, 8.5));
		Rectangle r2 = new Rectangle(new Point(12.5,  8.5), new Point(22.5, 6.0));
		Rectangle r3 = new Rectangle(new Point(20.0, 13.5), new Point(22.5, 8.5));
		
		System.out.print("Enter x and y, separated by a space: ");
		String line = console.nextLine();
		while(line.length()>0){
			String[] items = line.split(" ");
			double x = Double.parseDouble(items[0]);
			double y = Double.parseDouble(items[1]);
			Point p = new Point(x,y);
			if(r1.pointInside(p) || r2.pointInside(p) || r3.pointInside(p)){
				System.out.println("Inside");
			}else{
				System.out.println("Outside");
			}
			System.out.print("Enter x and y, separated by a space: ");
			line = console.nextLine();
		}
		console.close();
	}
}
