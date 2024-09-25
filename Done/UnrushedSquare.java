import java.util.Scanner;
public class UnrushedSquare {
    public static void main(String[] args) {
        Scanner ii = new Scanner(System.in);
        int input = ii.nextInt();
        
        // cache interior thing
        String interior = "";

        for (int j = 0; j < input + 2; j++) {

            if (j == 0 || j == input+2-1)
                interior += "|";
            else
                interior += " ";
        }

        // cache bottom and top line
        String topBottom = "+";

        for (int j = 0; j < input; j++)
            topBottom += "-";
        topBottom += "+";


        System.out.println(topBottom);

        for (int i = 1; i < input+1; i++) {
            System.out.println(interior);
        }

        System.out.println(topBottom);

    }
}
