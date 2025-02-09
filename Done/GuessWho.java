package Done;

import java.util.Scanner;

public class GuessWho {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int a = input.nextInt();

        int q = input.nextInt();

        String[][] arr = new String[n][a];
        input.nextLine();
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextLine().split("");
        }

        Pair[] questions = new Pair[q];

        for (int i = 0; i < q; i++) {
            int temp = input.nextInt() - 1;
            char temp2 = input.next().charAt(0);
            input.nextLine();
            questions[i] = new Pair(temp, temp2);

        }
        int count = 0;
        int num = -1;
        for (int i = 0; i < n; i++) {
            if(countTheNumbersThatWork(arr[i], questions)){
                count++;
                num = i + 1;
            }
        }
        if(count>1) {
            System.out.println("ambiguous");
            System.out.println(count);
        }
        else {
            System.out.println("unique");
            System.out.println(num);
        }
    }
    public static boolean countTheNumbersThatWork(String[] arr, Pair[] pair){
        int count = 0;
        for (int i = 0; i < pair.length; i++) {
            if(arr[pair[i].first].charAt(0) == pair[i].second) count++;
        }
        return count == pair.length;
    }
}
class Pair {
    int first;
    char second;

    public Pair(int first, char second) {
        this.first = first;
        this.second = second;
    }
}