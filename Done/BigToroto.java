package Done;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BigToroto {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int start = input.nextInt();
		
		ArrayList<Integer> arr0 = new ArrayList<>();
		ArrayList<Integer> arr1 = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();
		ArrayList<Integer> arr3 = new ArrayList<>();
		
		for(int i =0; i < n; i++) {
			int temp = input.nextInt();
			switch (temp%4){
			case 0: 
				arr0.add(temp);
				break;
			case 1:
				arr1.add(temp);
				break;
			case 2:
				arr2.add(temp);
				break;
			case 3:
				arr3.add(temp);
				break;
			}
		}
		Collections.sort(arr0);
		Collections.sort(arr1);
		Collections.sort(arr2);
		Collections.sort(arr3);
		boolean cantMove = true;
		while(cantMove) {
			switch(start%4) {
			case 0:
				if(arr0.size() == 0) {
					cantMove = false;
					break;
				}
				start += arr0.get(arr0.size() - 1);
				arr0.remove(arr0.size() - 1);
				break;
			case 1:
				if(arr1.size() == 0) {
					cantMove = false;
					break;
				}
				start += arr1.get(arr1.size() - 1);
				arr1.remove(arr1.size() - 1);
				break;
			case 2:
				if(arr2.size() == 0) {
					cantMove = false;
					break;
				}
				start += arr2.get(arr2.size() - 1);
				arr2.remove(arr2.size() - 1);
				break;
			case 3:
				if(arr3.size() == 0) {
					cantMove = false;
					break;
				}
				start += arr3.get(arr3.size() - 1);
				arr3.remove(arr3.size() - 1);
				break;
			}
		}
		System.out.print(start);
		
	}

}
