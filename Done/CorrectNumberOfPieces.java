import java.util.Scanner;
public class CorrectNumberOfPieces {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[] myList = {1, 1, 2, 2, 2, 8};
        int[] givenList;
        givenList = new int[6];
        int[] howToCorrectList;
        howToCorrectList = new int[6];

        for(int x = 0; x < 6; x++){
            givenList[x] = input.nextInt();
        }

        for(int i = 0; i < 6; i++){
            howToCorrectList[i] = myList[i] - givenList[i];
            System.out.print(howToCorrectList[i] + " ");
        }
       

    }
}
