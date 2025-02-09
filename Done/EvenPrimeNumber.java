package src;
import java.util.Scanner;
public class EvenPrimeNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int firstNum = input.nextInt();
		int secondNum = input.nextInt();
		
		if(2 >= firstNum && 2 <= secondNum) {
			System.out.println("1");
			System.out.println("2");
		}else {
			System.out.println(":(");
		}
	}
}
