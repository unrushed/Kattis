import java.util.Scanner;

public class Mult {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int x = 0;
        while(x <= number){
            int first = input.nextInt();
            x++;
            int second = input.nextInt();
            x++;
            while(second%first != 0){
                second = input.nextInt();
                x++;
            }
            if(second%first == 0){
                System.out.println(second);
            }
        }
    }
}