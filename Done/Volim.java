package Done;

import java.util.Scanner;

public class Volim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int timeCount = 0;
        int endTemp = Integer.parseInt(input.nextLine());
        int endFor = Integer.parseInt(input.nextLine());

        for (int i = 0; i < endFor; i++) {
            timeCount += Integer.parseInt(input.next());
            if(timeCount > 210) break;
            String str = input.next();
            if(str.equals("T")){
                endTemp++;
                if(endTemp == 9) endTemp = 1;
            }
        }

        System.out.println(endTemp);
    }
}
