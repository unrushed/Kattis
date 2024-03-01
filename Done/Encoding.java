import java.util.Scanner;
public class Encoding {
    static char[] characters = new char[28];
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char charTemp, character = 'A';
        String strOut= "", s = "", strOutTemp = "";
        int m = 0;

        for(int y = 0; y < 26; y++){
            characters[y] = character;
            //System.out.print(characters[y]);
            character++;
        }
        characters[26] = '_';
        characters[27] = '.';

        int rotationNumber= input.nextInt();

        while(rotationNumber > 0){
            String str = input.next();
            for(int z = 0; z < str.length(); z++){
                charTemp = str.charAt(z);
                strOutTemp = rotate(charTemp, rotationNumber) + strOutTemp;
                //System.out.println(strOut);
            }
            m++;
            if(m == 1){
                strOut = strOutTemp;
            }else{
                strOut = strOut +  "\r\n" + strOutTemp;
            }
            strOutTemp = "";
            rotationNumber= input.nextInt();
        }
        System.out.print(strOut);
    }

    public static char rotate(char charTemp, int rotationNumber){
        int x;
        if(charTemp - 65 > 26){
            x = 26 + rotationNumber;
        }else if (charTemp - 65 < 0){
          x = 27 + rotationNumber;
        } else{
            x = (charTemp - 65) + rotationNumber;
        }

        if(x > 27){
            x = x - 28;
        }
        return characters[x];
    }
}
