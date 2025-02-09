package src;
import java.util.Scanner;
public class whatkindofnumberisit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		for(int i = 0; i < n; i++) {
			int temp = input.nextInt();
			if(temp%2 != 0 && Math.sqrt(temp) * Math.sqrt(temp) == (double) temp) {
				System.out.println("OS");
			}else if(temp%2 != 0) {
				System.out.println("O");
			}else if(Math.sqrt(temp) * Math.sqrt(temp) == (double) temp) {
				System.out.println("S");
			}else {
				System.out.println("EMPTY");
			}
		}
		
	}

}
