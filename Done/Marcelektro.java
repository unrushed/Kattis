import java.util.Scanner;

public class Marcelektro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // random input
        int roomCount = input.nextInt();
        int peopleCount = input.nextInt();


        //System.out.printf("Input data: peopleCount = %s, roomCount = %s%n", peopleCount, roomCount);

        int remainderLeft = peopleCount % roomCount;

        // loop roomCount times
        for (int roomI = 0; roomI < roomCount; roomI++) {

            int peopleByRoom = peopleCount / roomCount + (remainderLeft > 0 ? 1 : 0);
            
            // print the *'s
            for (int starI = 0; starI < peopleByRoom; starI++) {
                System.out.print("*");
            }
            // end the line
            System.out.print("\n");

            remainderLeft--;
        }

    }
}
