package Done;
import java.util.Scanner;

public class TicTacToeKattis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] arr = new String[3][3];
        boolean test = false;

        for (int i = 0; i < 3; i++) {
            String temp = input.nextLine();
            if(temp.equals("OOO")) 
                test = true;
            arr[i] = temp.split("");
        }

        if(test) {
            System.out.println("Jebb");
        }else{
            if(arr[0][0].equals("O") && arr[1][0].equals("O") && arr[2][0].equals("O")){
                System.out.println("Jebb");
            }else if(arr[0][2].equals("O") && arr[1][2].equals("O") && arr[2][2].equals("O")){
                System.out.println("Jebb");
            }else if(arr[0][0].equals("O") && arr[1][1].equals("O") && arr[2][2].equals("O")){
                System.out.println("Jebb");
            }else if(arr[0][1].equals("O") && arr[1][1].equals("O") && arr[2][1].equals("O")){
                System.out.println("Jebb");
            }else if(arr[0][2].equals("O") && arr[1][1].equals("O") && arr[2][0].equals("O")){
                System.out.println("Jebb");
            }else{
                System.out.println("Neibb");
            }
        }

    }
}
