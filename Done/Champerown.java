package Done;

import java.util.Scanner;

public class Champerown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String i = input.nextLine();

        switch (i){
            case "1":
                System.out.println("1");
                break;
            case "12":
                System.out.println("2");
                break;
            case "123":
                System.out.println("3");
                break;
            case "1234":
                System.out.println("4");
                break;
            case "12345":
                System.out.println("5");
                break;
            case "123456":
                System.out.println("6");
                break;
            case "1234567":
                System.out.println("7");
                break;
            case "12345678":
                System.out.println("8");
                break;
            case "123456789":
                System.out.println("9");
                break;
            default:
                System.out.println("-1");
        }
    }
}
