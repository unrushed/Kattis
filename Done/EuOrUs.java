package Done;
import java.util.Scanner;

public class EuOrUs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        int maybeMonth = Integer.parseInt(str.substring(0,2));
        int maybeDay = Integer.parseInt(str.substring(3,5));

        if(maybeMonth>12){
            System.out.println("EU");
        }else if(maybeDay > 12){
            System.out.println("US");
        }else{
            System.out.println("either");
        }
    }
}