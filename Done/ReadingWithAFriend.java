import java.util.Scanner;
public class ReadingWithAFriend {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int everyPage = input.nextInt(), numberOfPages = input.nextInt(), myReadingTime = input.nextInt(), buddyReadingTime = input.nextInt(), y = 0, x;

        for(x = 1; x <= numberOfPages/(everyPage -1); x++){
            y++;
        }
        System.out.print((myReadingTime * numberOfPages) + (y * buddyReadingTime));
    }
}
