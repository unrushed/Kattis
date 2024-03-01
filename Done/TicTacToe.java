import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String[][] threeByThree = new String[3][3];

        for(int row = 0; row < 3; row++){
            for(int colum = 0; colum < 3; colum++){
                threeByThree[row][colum] = input.next(); 
            }
        }

        int test = checkHorizonal(threeByThree);
        if(test > -1){
            if(threeByThree[test][0].equals("O")) 
                System.out.print("Abdullah har vunnit");
            else 
                System.out.print("Johan har vunnit");
        }
        if(test == -1){
            test = checkVerticals(threeByThree);
            
            if(test > -1){
                if(threeByThree[0][test].equals("O")) 
                    System.out.print("Abdullah har vunnit");
                else 
                    System.out.print("Johan har vunnit");
            }
        }
        if(test == -1){
            test = checkDiagonal(threeByThree);
            if(test > -1){
                if(test == 1){
                    if(threeByThree[0][0].equals("O")) 
                        System.out.print("Abdullah har vunnit");
                    else 
                        System.out.print("Johan har vunnit");
                }else{
                    if(threeByThree[0][2].equals("O")) 
                        System.out.print("Abdullah har vunnit");
                    else 
                        System.out.print("Johan har vunnit");
                }
            }
        }
        if(test == -1){
            System.out.print("ingen har vunnit");
        }
    }

    public static int checkHorizonal(String[][] threeByThree){
        for(int x = 0; x < 3; x++){
            if(threeByThree[x][0].equals(threeByThree[x][1]) && threeByThree[x][0].equals(threeByThree[x][2]) && !threeByThree[x][0].equals("_"))
                return x;
        }
        return -1;
    }
    public static int checkVerticals(String[][] threeByThree){
        for(int x = 0; x < 3; x++){
            if(threeByThree[0][x].equals(threeByThree[1][x]) && threeByThree[0][x].equals(threeByThree[2][x]) && !threeByThree[0][x].equals("_")) 
                return x;
        }
        return -1;
    }
    public static int checkDiagonal(String[][] threeByThree){
        if(threeByThree[0][0].equals(threeByThree[1][1]) && threeByThree[1][1].equals(threeByThree[2][2]) && !threeByThree[0][0].equals("_")) 
            return 1;
        else if(threeByThree[2][0].equals(threeByThree[1][1]) && threeByThree[2][0].equals(threeByThree[0][2]) && !threeByThree[2][0].equals("_")){
            return 2;
        }else{
            return -1;
        }
    }
}
