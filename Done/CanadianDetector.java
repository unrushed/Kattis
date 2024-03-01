import java.util.Scanner;
public class CanadianDetector {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String str = input.nextLine().toLowerCase();

        if(str.indexOf("eh?", str.length() - 3) != -1){
            System.out.print("Canadian!");
        }else{
            System.out.print("Imposter!");
        }
    }
}
