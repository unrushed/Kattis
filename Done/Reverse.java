import java.util.Scanner;
public class Reverse {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String str = input.nextLine().trim();
        int y = str.length() - 1, x = 0;
        char charTempLast;

        charTempLast = str.charAt(y);
        str = charTempLast + str.substring(x, y);

        for(x = 1; x < str.length(); x++){

            charTempLast = str.charAt(y);
            str = str.substring(0, x) + charTempLast + str.substring(x, y);
        }
        System.out.print(str);
    }
}
