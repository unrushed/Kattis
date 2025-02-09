package Done;

import java.util.Scanner;
import java.util.TreeMap;


public class StackingCups {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        String[][] arr = new String[n][2];
        TreeMap<Integer, String> tree = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextLine().split(" ");
        }

        for (int i = 0; i < n; i++) {
            if (arr[i][0].matches("\\d+")) {
                tree.put(Integer.parseInt(arr[i][0])/2, arr[i][1]);
            } else {
                tree.put(Integer.parseInt(arr[i][1]), arr[i][0]);
            }
        }
        for (Integer key : tree.keySet()) {
            System.out.println(tree.get(key));
        }

    }
}
