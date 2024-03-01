import java.util.Scanner;
public class BoxGame {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[][] fourByFour = new int[4][4];

        for(int row = 0; row < 4; row++){
            for(int colum = 0; colum < 4; colum++){
                fourByFour[row][colum] = input.nextInt(); 
            }
        }
        int direction = input.nextInt();
        int z = 0;
        if(direction == 0){
            fourByFour[0] = checkRowLeft(fourByFour, z);
        }

    }

    public static int[] checkRowLeft(int[][] fourByFour, int z){
        int stopPosition = 4;
        int r = 4;
        while(true){
            int firstNumber = fourByFour[z][r];
            for(r = 3; r > 0; r--, stopPosition--){
                int secondNumber = fourByFour[z][r];
                if(secondNumber == 0)
                    continue;
                else if(firstNumber != secondNumber) {
                    r--;
                    break;
                } else if(firstNumber == secondNumber)
                    fourByFour[z][stopPosition] = firstNumber * 2;
            }
        }
    }
}
//i wassnt done with this one