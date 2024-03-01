package Kattis;
import java.util.Scanner;
public class CinimaCrowds {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int seats = input.nextInt(), visitingGroups = input.nextInt(), total = 0, inputCheck, x, z;
        
        for(x = 0; x < visitingGroups; x++){
            inputCheck = input.nextInt();
            total = total + inputCheck;
            if (total > seats){
                break;
            }
            else if(total == seats){
                x++;
                break;
            }
        }
        z = visitingGroups - x;
        System.out.print(z);
    }
}
