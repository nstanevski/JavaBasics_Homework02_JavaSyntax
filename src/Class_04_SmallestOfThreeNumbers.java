import java.util.Locale;
import java.util.Scanner;

public class Class_04_SmallestOfThreeNumbers {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		Scanner console = new Scanner(System.in);
		
		System.out.print("Enter a: ");
		double a = Double.parseDouble(console.next());
		
		System.out.print("Enter b: ");
		double b = Double.parseDouble(console.next());
		
		System.out.print("Enter c: ");
		double c = Double.parseDouble(console.next());
		
		double min = Math.min(Math.min(a, b), Math.min(b, c));
		System.out.println(String.format("The smallest number is: %f", min));
		
		console.close();

	}

}
