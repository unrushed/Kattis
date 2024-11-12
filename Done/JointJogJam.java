package Done;

import java.util.Scanner;

public class JointJogJam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int xStartK = input.nextInt();
        int yStartK = input.nextInt();

        int xStartO = input.nextInt();
        int yStartO = input.nextInt();

        int xEndK = input.nextInt();
        int yEndK = input.nextInt();

        int xEndO = input.nextInt();
        int yEndO = input.nextInt();


        double length1 = Math.sqrt(Math.pow(xStartK-xStartO, 2) + Math.pow(yStartK-yStartO, 2));
        double length2 = Math.sqrt(Math.pow(xEndK-xEndO, 2) + Math.pow(yEndK-yEndO, 2));
        if(length1 > length2) System.out.println(length1);
        else System.out.println(length2);

    }
}
