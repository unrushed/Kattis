import java.util.Scanner;
public class Nsum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numberOfNumbers = input.nextInt(), numberTemp, total = 0;
        for(int i = 0; i < numberOfNumbers; i++){
            numberTemp = input.nextInt();
            total = total + numberTemp;
        }
        System.out.print(total);
    }
}
