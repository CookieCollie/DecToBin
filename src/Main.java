import java.util.List;
import java.util.Scanner;
import java.util.Stack;


public class Main {
	static int Dec;
	static Stack<Integer> BinBuffer = new Stack<>();
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal here: ");
		Dec = input.nextInt();
		
		DecToBin(Dec);
		
		while (!BinBuffer.isEmpty()) {
			System.out.print(BinBuffer.pop());
		}
	}
	
	
	private static int DecToBin(int num) {
		if (num > 0) {
			BinBuffer.push(num%2);
			num /= 2;
			return DecToBin(num);
		}
		else
			return 0;
	}
}
