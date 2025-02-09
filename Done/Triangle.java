package Done;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        if(x==90 || y==90 || z==90) System.out.println("Ratvinklig Triangel");
        else if(x>90 || y>90 || z>90) System.out.println("Trubbig Triangel");
        else System.out.println("Spetsig Triangel");
    }
}
