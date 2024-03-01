import java.util.Arrays;

public class LuhnCheckSum {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);

        int testCases = io.getInt();
        for (int i = 0; i < testCases; i++) {
            String number = io.getWord();
            String[] stringValue = number.split("");
            int numbersAdded = 0;
            for (int i1 = stringValue.length - 2; i1 >= 0; i1-=2) {
                if(Integer.parseInt(stringValue[i1]) > 4){
                    String x = Integer.parseInt(stringValue[i1]) * 2 + "";
                    stringValue[i1] = ((x.charAt(0) - 48) + (x.charAt(1) - 48)) + "";
                }else {
                    stringValue[i1] = (Integer.parseInt(stringValue[i1]) * 2) + "";
                }
            }
            for (int i1 = 0; i1 < stringValue.length; i1++) {
                numbersAdded += Integer.parseInt(stringValue[i1]);
            }

            if(numbersAdded%10 == 0) io.println("PASS");
            else io.println("Fail");
        }
        io.close();
    }
}
