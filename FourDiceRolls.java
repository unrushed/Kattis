import java.util.Scanner;

public class FourDiceRolls {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfDice = input.nextInt();
        int[] arr = new int[numberOfDice];

        for (int i = 0; i < numberOfDice; i++) {
            arr[i] = input.nextInt();
        }

        if(checkDuplicates(arr)){
            System.out.print("0");
            
        }
    }

    public static boolean checkDuplicates(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j] && i != j){
                    return true;
                }
            }
        }
        return false;
    }
}
