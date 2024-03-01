package Kattis;
import java.util.Scanner;
public class Spritt {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int classroomNumber = input.nextInt(), handSanitizerBottles = input.nextInt(), sum = 0, bottlesPerClassroom;
        for(int i = 0; i < classroomNumber; i++){
            bottlesPerClassroom = input.nextInt();
            sum = sum + bottlesPerClassroom;
            //System.out.println(sum);
        }
        
        if(handSanitizerBottles/sum >= 1){
            System.out.print("Jebb");
        }
        else{
            System.out.print("Niebb");
        }
    }
}
