import java.util.Scanner;

public class Crypto {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        String cyfer = io.nextLine();
        String code = io.nextLine();
        String out= "";

        char[] chars = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        for (int i = 0; i < cyfer.length(); i++) {
            if((cyfer.charAt(i) == 'A')){
                out += chars[26 - (-1*((cyfer.charAt(i) - 65) - (code.charAt(i) - 65)))];
                code += chars[26 - (-1*((cyfer.charAt(i) - 65) - (code.charAt(i) - 65)))];
            }else if((cyfer.charAt(i) - 65) - (code.charAt(i) - 65) < 0){
                out += chars[26 - (-1*((cyfer.charAt(i) - 65) - (code.charAt(i) - 65)))];
                code += chars[26 - (-1*((cyfer.charAt(i) - 65) - (code.charAt(i) - 65)))];
            }else{
                out += chars[(cyfer.charAt(i) - 65) - (code.charAt(i) - 65)];
                code += chars[(cyfer.charAt(i) - 65) - (code.charAt(i) - 65)];
            }
        }
        System.out.println(out);
    }
}