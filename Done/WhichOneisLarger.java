package src;
import java.util.Scanner;
public class WhichOneisLarger {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] arr = input.nextLine().split("\\.");
		String[] arr2 = input.nextLine().split("\\.");
		
		double ognumber1 = Double.parseDouble(arr[0]+ "." + arr[1]);
		double ognumber2 = Double.parseDouble(arr2[0]+ "." + arr2[1]);
		
		if(Integer.parseInt(arr[0]) > Integer.parseInt(arr2[0])){
			System.out.print(ognumber1);
		}else if(Integer.parseInt(arr[0]) < Integer.parseInt(arr2[0])) {
			System.out.print(ognumber2);
		}else {
			if(ognumber1 > ognumber2 && Integer.parseInt(arr[1]) < Integer.parseInt(arr2[1]) || ognumber2 > ognumber1 && Integer.parseInt(arr[1]) > Integer.parseInt(arr2[1])) {
				System.out.print("-1");
			}else if(ognumber1 != ognumber2 && Integer.parseInt(arr[1]) == Integer.parseInt(arr2[1])) {
				System.out.print("-1");
			}else{
				if(ognumber1 > ognumber2) System.out.print(ognumber1);
				else System.out.print(ognumber2);
			}
		}
		
	}
}
