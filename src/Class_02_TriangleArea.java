import java.util.Locale;
import java.util.Scanner;

public class Class_02_TriangleArea {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.ROOT);
		
		Scanner console = new Scanner(System.in);
		Point[] triangle = new Point[3];

		for(int i=0; i<triangle.length; i++){
			System.out.print(String.format("x%d = ", i+1));
			double x = console.nextDouble();
			console.nextLine();
			System.out.print(String.format("y%d = ", i+1));
			double y = console.nextDouble();
			console.nextLine();
			triangle[i] = new Point(x,y);
		}
		double dist1 = triangle[0].distanceTo(triangle[1]);
		double dist2 = triangle[1].distanceTo(triangle[2]);
		double dist3 = triangle[2].distanceTo(triangle[0]);
		double p = 0.5*(dist1+dist2+dist3);
		double area = Math.sqrt(p*(p-dist1)*(p-dist2)*(p-dist3));
		System.out.println(String.format("%d",Math.round(area)));
		console.close();
	}
}
