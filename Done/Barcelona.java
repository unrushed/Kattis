import java.util.Scanner;
public class Barcelona {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int numberOfBags = input.nextInt();
        int bagNumber = input.nextInt();
        int i;
        for(i = 0; i < numberOfBags; i++){
            if(input.nextInt() == bagNumber) break;
        }
        
        if(i == 0) System.out.print("fyrst");
        else if(i == 1) System.out.print("naestfyrst");
        else System.out.print((i + 1) + " fyrst");
    }
}