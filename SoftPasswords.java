import java.util.Scanner;

public class SoftPasswords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String one = input.nextLine();
        String two = input.nextLine();
        boolean setFalse = true;
        if(one.equals(two)){
            System.out.println("Yes");
            setFalse = false;
        }
        for (int i = 0; i < 10 && setFalse; i++) {
            if(one.equals(two + i)){
                System.out.println("Yes");
                setFalse = false;
                break;
            }
        }
        for (int i = 0; i < 10 && setFalse; i++) {
            if(one.equals(i + two)){
                System.out.println("Yes");
                setFalse = false;
                break;
            }
        }
        if (setFalse && one.equals(reverseChar(two))) System.out.println("Yes");
        else if (setFalse) System.out.println("No");
    }
    public static String reverseChar(String one){
        String answer = "";
        for (int i = 0; i < one.length(); i++) {
            if(one.charAt(i) > 64 && one.charAt(i) < 91)
                answer += (char)(one.charAt(i) + 32);
            else if (one.charAt(i) > 96 && one.charAt(i) < 123) {
                 answer += (char)(one.charAt(i) - 32);
            }else {
                answer += one.charAt(i);
            }
        }
        return answer;
    }
}
