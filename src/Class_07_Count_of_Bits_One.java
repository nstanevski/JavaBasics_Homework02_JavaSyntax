import java.util.Scanner;


public class Class_07_Count_of_Bits_One {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int a = Integer.parseInt(console.next());
		System.out.println(Integer.bitCount(a));
		console.close();
	}

}
