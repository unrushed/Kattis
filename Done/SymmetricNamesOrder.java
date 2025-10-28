package Done;

import java.util.Scanner;

public class SymmetricNamesOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int setNumber = 1;

        while(true){
            int n = Integer.parseInt(input.nextLine());

            if(n == 0) break;

            String[] array = new String[n];

            String[] answer = new String[n];

            for (int i = 0; i < n; i++) {
                array[i] = input.nextLine();
            }

            System.out.println("SET " + setNumber);
            if(n == 1){
                System.out.println(array[0]);
            }else{
                answer = orderCorrectly(array);

                for (int i = 0; i < n; i++) {
                    System.out.println(answer[i]);
                }
            }
            setNumber++;
        }
    }
    public static String[] orderCorrectly(String[] a){
        String[] answer = new String[a.length];
        for (int i = 0, c = a.length - 1, k = 0; k < c; i+= 2, c--, k++) {
            answer[k] = a[i];
            answer[c] = a[i + 1];
        }
        if(a.length%2 !=0) answer[a.length/2] = a[a.length - 1];
        return answer;
    }
}
