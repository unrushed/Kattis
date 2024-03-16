import java.util.Scanner;

public class Putovanje {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = input.nextInt();
        int stomach = input.nextInt();
        int[] possibility = new int[total];
        int[] fruits = new int[total];
        int largest = 0;

        for (int i = 0; i < total; i++) {
            fruits[i] = input.nextInt();
        }

        for (int start = 0; start < total; start++) {
            int sum = 0;
            int sumTemp = 0;
            for (int i = start; i < total; i++) {
                sumTemp += fruits[i];
                if(i == total - 1 && sumTemp <= stomach){
                    sum++;
                    possibility[start] = sum;
                    break;
                }else if(sumTemp <= stomach) {
                    sum++;
                }else{
                    possibility[start] = sum;
                    break;
                }
            }
        }
        for (int j = 0; j < total; j++) {
            if (possibility[j] > largest)
                largest = possibility[j];
        }

        System.out.println(largest);
    }
}