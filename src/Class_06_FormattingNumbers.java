import java.util.Locale;
import java.util.Scanner;

public class Class_06_FormattingNumbers {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.ROOT);
		Scanner console = new Scanner(System.in);
		
		System.out.print("Enter a (an integer in range 0-500): ");
		int a = Integer.parseInt(console.next());
		
		System.out.print("Enter b (floating point): ");
		double b = Double.parseDouble(console.next());
		
		System.out.print("Enter c (floating point): ");
		double c = Double.parseDouble(console.next());
		
		System.out.printf("|%-10s|%010d|%10.2f|%-10.3f|", 
				Integer.toHexString(a).toUpperCase(),
				Integer.parseInt(Integer.toBinaryString(a)),
				b,
				c);
		
		console.close();
	}

}
