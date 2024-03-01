import java.util.Scanner;
public class NoDuplicateWords {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String str = input.nextLine().toUpperCase().trim();
        int temp, temp2 = 0, x = 0, p = 0, u = 1;
        String[] words;
        words = new String[str.length()];

        do{
            temp = str.indexOf(" ", temp2);
            if(temp == -1){
                words[x] = str.substring(temp2, str.length());
                break;
            }
            words[x] = str.substring(temp2, temp);
            temp2 = temp + 1;
            x++;
            u++;
        }while(temp != -1);

        for(int g = 0; g < u; g++){
            for(int y = 0; y < u; y++){
                if(words[g].equals(words[y]) && y != g){
                    p++;
                }
            }
        }

        if(p == 0){
            System.out.print("yes");
        }else{
            System.out.print("no");
        }
    }
}