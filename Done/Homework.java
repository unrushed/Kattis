package Done;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] in = input.nextLine().split(";");
        int sum = 0;
        for (int i = 0; i < in.length; i++) {
            if(in[i].indexOf('-') > -1){
                sum+= Integer.parseInt(in[i].substring(in[i].indexOf('-') + 1)) - Integer.parseInt(in[i].substring(0, in[i].indexOf('-'))) + 1;
            }else{
                sum++;
            }
        }
        System.out.println(sum);
    }
}
