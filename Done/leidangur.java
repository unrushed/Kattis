package src;

import java.util.Scanner;
import java.util.Stack;

public class leidangur {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Stack<Character> bag = new Stack<Character>();
		
		
		String in = input.nextLine(); //
		boolean failed = false;
		for(int u = 0; u < in.length() && !failed; u++) {
			switch(in.charAt(u)) {
			case 'p':
				bag.push('p');
				break;
			case 'g':
				bag.push('g');
				break;
			case 'o':
				bag.push('o');
				break;
			case 'P':
				while(true) {
					if(bag.isEmpty()) {
						System.out.print("Neibb");
						failed = true;
						break;
					}
					if(bag.peek() == 'p') break;
					bag.pop();
				}
				if(!failed) bag.pop();
				break;
			case 'G':
				while(true) {
					if(bag.isEmpty()) {
						System.out.print("Neibb");
						failed = true;
						break;
					}
					if(bag.peek() == 'g') break;
					bag.pop();
				}
				if(!failed) bag.pop();
				break;
			case 'O':
				while(true) {
					if(bag.isEmpty()) {
						System.out.print("Neibb");
						failed = true;
						break;
					}
					if(bag.peek() == 'o') break;
					bag.pop();
				}
				if(!failed) bag.pop();
				break;
			}
			
		}
		if(!failed) {
			int money = 0;
			int gold = 0;
			int jewels = 0;
			int badSize = bag.size();
			for(int u = 0; u < badSize; u++) {
				switch(bag.pop()) {
				case 'p':
					money++;
					break;
				case 'g':
					gold++;
					break;
				case 'o':
					jewels++;
					break;
				}
			}
			System.out.println(money);
			System.out.println(gold);
			System.out.println(jewels);
		}
	}

}
