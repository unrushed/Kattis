package Done;

import java.util.Scanner;

public class AlienMath {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        int base = Integer.parseInt(io.nextLine());
        String[] keys = io.nextLine().split(" ");

        int[] arr = new int[300];
        String temp = "";
        String decipher = io.nextLine();
        int start = 0;

        for (int i = 0; i < decipher.length(); i++) {
            temp += decipher.charAt(i);
            if(check(temp, keys) > -1){
                arr[start] = check(temp, keys);
                start++;
                temp = "";
            }
        }

        int z = start - 1;

        double answer = 0;
        for (int i = 0; i <= start; i++) {

            answer += (arr[i] * (Math.pow(base, z)));
            z--;
        }
        System.out.println(Math.round(answer));

    }
    public static int check(String temp, String[] key){
        for (int i = 0; i < key.length; i++) {
            if(temp.equals(key[i])){
                return i;
            }
        }
        return -1;
    }
}
