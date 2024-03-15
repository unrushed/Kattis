import java.util.Scanner;

public class TripleSevens {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = Integer.parseInt(input.nextLine());
        boolean test = false;

        for (int i = 0; i < 3; i++) {
            String temp = input.nextLine();
            if(temp.indexOf('7') == -1) {
                test = true;
                break;
            }
        }

        if(test){
            System.out.println("0");
        }else{
            System.out.println("777");
        }
    }
}
