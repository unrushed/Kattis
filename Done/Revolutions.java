package Kattis;
import java.util.Scanner;
public class Revolutions {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int k = 0, x = 1;


        while(input.hasNext()){

            int earth = input.nextInt(), mars = input.nextInt();
            
            while(true){
                if(earth == 365){
                    earth = 0;
                }
                if(mars == 687){
                    mars = 0;
                }

                if(earth == 0 && mars == 0){
                    break;
                }

                earth++;
                mars++;
                k++;
            }
            
            System.out.println("Case " + x +": " + k);
            x++;
            k = 0;
        }
    }
}