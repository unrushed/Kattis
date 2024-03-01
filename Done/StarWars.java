import java.util.Scanner;
public class StarWars {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sampleAnswer = input.nextInt();


        if(num1 - num2 > 0){
            System.out.print("VEIT EKKI");
        }else if(num1 - num2 == sampleAnswer){
            System.out.print("JEDI");
        }else {
            System.out.print("SITH");
        }

    }
}
