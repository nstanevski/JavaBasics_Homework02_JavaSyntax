import java.util.Scanner;

public class Class_01_RectangleArea {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("a = ");
		int a = Integer.parseInt(console.next());
		System.out.print("b = ");
		int b = Integer.parseInt(console.next());
		int area = a*b;
		System.out.println(String.format("area is: %d", area));
		console.close();
	}

}
