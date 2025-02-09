package src;

import java.util.Scanner;

public class ContestStruggles {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		int n = input.nextInt();
		int k = input.nextInt();
		
		int d = input.nextInt();
		int s = input.nextInt();
		
		if(d == 100 && s != 100) {
			System.out.print("impossible");
		}
		else if(d == 0 && s != 0){
		    System.out.print("impossible");
		}
		else if((n*d - s*k) < 0 || (n*d - s*k)/(n-k) > 100){
		    System.out.print("impossible");
		}
		else {
			System.out.print((double)(n*d - s*k)/(n-k));
		}
	}
}
