import java.util.Scanner;

public class Class_05_DecimalToHexadecimal {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		int number = Integer.parseInt(console.next());
		String hex = Integer.toHexString(number);
		System.out.println(String.format("Hex value: %s", hex.toUpperCase()));
		console.close();

	}

}
