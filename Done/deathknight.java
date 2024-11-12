package Done;

import java.util.Scanner;
public class deathknight{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int y = Integer.parseInt(input.nextLine());
        int count = 0;
        for (int c = 0; c < y ; c++){
            String x = input.nextLine();
            //System.out.println(x);
            if(!(x.contains("CD"))) {
                count++;
            }
        } 
        
        System.out.print(count);
    }
}