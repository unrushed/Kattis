import java.util.Scanner;
public class CircleInASquare {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int length = input.nextInt(), raduis = input.nextInt();
        double answer;

        answer = Math.sqrt((2*Math.pow(raduis, 2)));
        if(answer >= length){
            System.out.print("fits");
        }else{
            System.out.print("nope");
        }
    }
}
