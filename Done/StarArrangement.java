package Kattis;
import java.util.Scanner;
public class StarArrangement {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int numberOfStars = input.nextInt();
        int x = 2, y = 1;
        
        System.out.println(numberOfStars + ":");
        while(true){
            
            if(x + y == numberOfStars){
                print(x, y);
                break;
            }if(works(x, y, numberOfStars)){
                print(x, y);
            }

            if(x == y){
                x++;
            }else{
                y++;
            }
        }
    }

    public static void print(int x, int y){
        System.out.print(x + "," + y);
        System.out.println();
    }

    public static boolean works(int x, int y, int numberOfStars){
        if(x != y && numberOfStars%(x+y) == x || numberOfStars%(x+y) == 0){
            return true;
        }else if(x == y && numberOfStars%x == 0){
            return true;
        }else{
            return false;
        }
    }
}
