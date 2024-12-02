package src;
import java.util.Scanner;
public class CheckingForHangovers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int count = 0;
		String prev = input.nextLine();
		for(int i =0; i < n ; i++) {
			String current = input.nextLine();
			if(prev.equals("drunk") && !current.equals("drunk")) {
				count++;
			}
			prev = current;
		}
		System.out.print(count);
	}

}
