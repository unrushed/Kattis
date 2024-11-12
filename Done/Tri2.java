package Done;

import java.util.Scanner;

public class Tri2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int one = input.nextInt();
        int two = input.nextInt();
        int three = input.nextInt();

        if(one + two == three) System.out.println(one + "+" + two + "=" + three);
        else if(one - two == three) System.out.println(one + "-" + two + "=" + three);
        else if(one * two == three) System.out.println(one + "*" + two + "=" + three);
        else if(one / two == three) System.out.println(one + "/" + two + "=" + three);
        else if(one == two + three) System.out.println(one + "=" + two + "+" + three);
        else if(one == two - three) System.out.println(one + "=" + two + "-" + three);
        else if(one == two * three) System.out.println(one + "=" + two + "*" + three);
        else if(one == two / three) System.out.println(one + "=" + two + "/" + three);
    }
}
