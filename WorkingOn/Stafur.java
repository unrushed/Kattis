import java.util.Scanner;

public class Stafur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String in = input.nextLine();

        if(in.equals("A") || in.equals("E") || in.equals("I") || in.equals("O") || in.equals("U")){
            System.out.println("Jebb");
        }else if(in.equals("Y")){
            System.out.println("Kannski");
        }else{
            System.out.println("Neibb");
        }
    }
}
