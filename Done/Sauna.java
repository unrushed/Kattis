package Done;

public class Sauna {

	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		
		int n = io.getInt();
		int right = 0;
		int left = 0;
		int gap = 0;
		int[] arr = new int[200000];
		for(int m = 0; m < n; m++) {
			int first = io.getInt();
			int second = io.getInt();
			if(second - first > gap) {
				gap = second - first;
				right = second;
				left = first;
			}
			for(int i = first; i <= second; i++) {
				arr[i]++;
			}
		}
		int firstInstance = 0;
		int b = 0;
		boolean test = false;
		for(int d = left; d <= right; d++) {
			if(arr[d] == n) {
				if(!test) firstInstance = d;
				test = true;
				b++;
			}
		}
		if(b == 0)io.print("bad news");
		else io.print(b + " " + firstInstance);
		io.close();
	}

}
