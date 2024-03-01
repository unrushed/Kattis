import java.util.Scanner;
public class CPR {
    static int[] multiplier;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sum = 0, m = 0;
        String str = input.next().trim();

        int[] characters;
        characters = new int[10];

        multiplier = new int[10];
        multiplier = multiplierSet();

        for(int y = 0; y < 11; y++){
            char charTemp = str.charAt(y);
            if(charTemp == '-'){
                continue;
            }else{
                characters[m] = charTemp - 48;
                m++;
            }
        }


        for(int x = 0; x < 10; x++){
            sum = sum + (characters[x] * multiplier[x]);
            
        }
        //System.out.print(sum);
        if(sum%11 == 0){
            System.out.print("1");
        }else{
            System.out.print("0");
        }
    }

    public static int[] multiplierSet(){
        multiplier[0] = 4;
        multiplier[1] = 3;
        multiplier[2] = 2;
        multiplier[3] = 7;
        multiplier[4] = 6;
        multiplier[5] = 5;
        multiplier[6] = 4;
        multiplier[7] = 3;
        multiplier[8] = 2;
        multiplier[9] = 1;
        return multiplier;
    }
}
