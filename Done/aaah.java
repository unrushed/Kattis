package Done;
import java.util.Scanner;
public class aaah{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int firstThreeNumbers;
        String word = input.next(), rotated = "";
        int low = 0, high = word.length() - 1;
        char temp, last, first;
        while(low < high){
            temp = word.charAt(low);
            last = word.charAt(high);
            first = last;
            last = temp;
            //rotated = first.concat(last);
            low++; high--;
        }
        System.out.print(rotated);
    }
}
