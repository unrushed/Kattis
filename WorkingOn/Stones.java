import java.util.Scanner;

public class Stones {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String in = input.next();
        int w = 0;
        int b = 0;
        for (int i = 0; i < in.length(); i++) {
            if(in.charAt(i) == 'W'){
                w++;
            }else{
                b++;
            }
        }
        if(w+1 == b || b + 1 == w || w == b){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
