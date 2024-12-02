package src;

import java.util.Arrays;
import java.util.Scanner;

public class EFlatSaxophone {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		
		int numberOfTestCases = Integer.parseInt(input.nextLine());
		
		for(int i = 0; i < numberOfTestCases; i++) {
			boolean[] pressed = new boolean[11];
			String[] temp = input.nextLine().split("");
			
			int[] key = new int[11];
			for(int j = 0; j < temp.length; j++) {
				switch(temp[j]) {
					case "a":
						if(!pressed[2])key[2]++;
						if(!pressed[3])key[3]++;
						
						pressed = allOff(pressed);
						
						pressed[2] = true;
						pressed[3] = true;
						break;
					case "b":
						if(!pressed[2])key[2]++;

						pressed = allOff(pressed);
						
						pressed[2] = true;
						break;
					case "c":
						if(!pressed[2])key[2]++;
						if(!pressed[3])key[3]++;
						if(!pressed[4])key[4]++;
						if(!pressed[7])key[7]++;
						if(!pressed[8])key[8]++;
						if(!pressed[9])key[9]++;
						if(!pressed[10])key[10]++;
						
						pressed = allOff(pressed);
						
						pressed[2] = true;
						pressed[3] = true;
						pressed[4] = true;
						pressed[7] = true;
						pressed[8] = true;
						pressed[9] = true;
						pressed[10] = true;
						
						break;
					case "d":
						if(!pressed[2])key[2]++;
						if(!pressed[3])key[3]++;
						if(!pressed[4])key[4]++;
						if(!pressed[7])key[7]++;
						if(!pressed[8])key[8]++;
						if(!pressed[9])key[9]++;
						
						pressed = allOff(pressed);
						
						pressed[2] = true;
						pressed[3] = true;
						pressed[4] = true;
						pressed[7] = true;
						pressed[8] = true;
						pressed[9] = true;
						
						
						break;
					case "e":
						if(!pressed[2])key[2]++;
						if(!pressed[3])key[3]++;
						if(!pressed[4])key[4]++;
						if(!pressed[7])key[7]++;
						if(!pressed[8])key[8]++;
						
						pressed = allOff(pressed);
						
						pressed[2] = true;
						pressed[3] = true;
						pressed[4] = true;
						pressed[7] = true;
						pressed[8] = true;
						
						
						break;
					case "f":
						if(!pressed[2])key[2]++;
						if(!pressed[3])key[3]++;
						if(!pressed[4])key[4]++;
						if(!pressed[7])key[7]++;
						
						pressed = allOff(pressed);
						
						pressed[2] = true;
						pressed[3] = true;
						pressed[4] = true;
						pressed[7] = true;

						
						break;
					case "g":
						if(!pressed[2])key[2]++;
						if(!pressed[3])key[3]++;
						if(!pressed[4])key[4]++;
						
						pressed = allOff(pressed);
						
						pressed[2] = true;
						pressed[3] = true;
						pressed[4] = true;
						break;
					case "A":
						if(!pressed[2])key[2]++;
						if(!pressed[3])key[3]++;
						if(!pressed[1])key[1]++;
						
						pressed = allOff(pressed);
						
						pressed[2] = true;
						pressed[3] = true;
						pressed[1] = true;

						break;
					case "B":
						if(!pressed[2])key[2]++;
						if(!pressed[1])key[1]++;

						pressed = allOff(pressed);
						
						pressed[2] = true;
						pressed[1] = true;

						break;
					case "C":
						if(!pressed[3])key[3]++;
						
						pressed = allOff(pressed);
						
						pressed[3] = true;
						
						break;
					case "D":
						if(!pressed[2])key[2]++;
						if(!pressed[3])key[3]++;
						if(!pressed[4])key[4]++;
						if(!pressed[7])key[7]++;
						if(!pressed[8])key[8]++;
						if(!pressed[9])key[9]++;
						if(!pressed[1])key[1]++;
						pressed = allOff(pressed);
						
						pressed[2] = true;
						pressed[3] = true;
						pressed[4] = true;
						pressed[7] = true;
						pressed[8] = true;
						pressed[9] = true;
						pressed[1] = true;
						
						break;
					case "E":
						if(!pressed[2])key[2]++;
						if(!pressed[3])key[3]++;
						if(!pressed[4])key[4]++;
						if(!pressed[7])key[7]++;
						if(!pressed[8])key[8]++;
						if(!pressed[1])key[1]++;
						
						pressed = allOff(pressed);
						
						pressed[2] = true;
						pressed[3] = true;
						pressed[4] = true;
						pressed[7] = true;
						pressed[8] = true;
						pressed[1] = true;
						
						break;
					case "F":
						if(!pressed[2])key[2]++;
						if(!pressed[3])key[3]++;
						if(!pressed[4])key[4]++;
						if(!pressed[7])key[7]++;
						if(!pressed[1])key[1]++;
						
						pressed = allOff(pressed);
						
						pressed[2] = true;
						pressed[3] = true;
						pressed[4] = true;
						pressed[7] = true;
						pressed[1] = true;
						
						break;
					case "G":
						if(!pressed[2])key[2]++;
						if(!pressed[3])key[3]++;
						if(!pressed[4])key[4]++;
						if(!pressed[1])key[1]++;
						
						pressed = allOff(pressed);
						
						pressed[2] = true;
						pressed[3] = true;
						pressed[4] = true;
						pressed[1] = true;
						break;
				}
			}
			printAll(key);
		}
	}
	private static boolean[] allOff(boolean[] pressed) {
		boolean[] a = new boolean[11];
		return a;
	}
	public static void printAll(int[] key) {
		for(int i = 1; i < key.length; i++) {
			System.out.print(key[i]);
			System.out.print(" ");
		}
		System.out.println();
	}
}
