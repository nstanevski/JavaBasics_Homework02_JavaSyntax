import java.util.Scanner;


public class Class_08_Count_of_Equal_Bit_Pairs {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int a = Integer.parseInt(console.next());
		String binStr = Integer.toBinaryString(a);
		int eqBitPairs = 0;
		for(int i=0; i<binStr.length()-1; i++){
			if(binStr.charAt(i) ==binStr.charAt(i+1)){
				eqBitPairs++;
			}
		}
		System.out.println(eqBitPairs);		
		console.close();
	}
}
