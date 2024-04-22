import java.util.Scanner;

public class Beaver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int d = input.nextInt();
        int v = input.nextInt();

        double secondVolume = (Math.PI*(((d/2.0) * d/2.0)*d)) - v;

        System.out.println(Math.cbrt(4*(secondVolume/Math.PI)));
    }
}
