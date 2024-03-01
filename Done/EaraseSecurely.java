package Kattis;
import java.util.Scanner;
public class EaraseSecurely {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int switchNumberOfTimes = input.nextInt();

        String start = input.next();
        String end = input.next();

        boolean evenTest = false;
        boolean success = true;

        if(switchNumberOfTimes%2 == 0){
            evenTest = true;
        }else{
            evenTest = false;
        }

        if(evenTest){
            for(int x = 0; x < start.length(); x++){
                if(start.charAt(x) != end.charAt(x)){
                    success = false;
                    break;
                }
            }
        }else{
            for(int x = 0; x < start.length(); x++){
                if(start.charAt(x) == end.charAt(x)){
                    success = false;
                    break;
                }
            }
        }

        if(success){
            System.out.print("Deletion succeeded");
        }else{
            System.out.print("Deletion failed");
        }

    }
}
