package Kattis;
import java.util.Scanner;
public class CookieCrumbling {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            double r = input.nextDouble();
            double x = input.nextDouble();
            double y = input.nextDouble();

            double distanceTop = Math.sqrt(x * x + y * y);

            if(distanceTop < r){

                double angle = (Math.acos(distanceTop/r));
                double areaOfSector = 0.5 * r * r * (2 * angle);
                double base = 2 * r *(Math.sin(angle));
                double triangle = 0.5 * distanceTop * base; 

                double smallerPiece = areaOfSector - triangle;
                double biggerPiece = Math.PI * r * r - smallerPiece;
                System.out.println(biggerPiece + " " + smallerPiece);
            }else{
                System.out.println("miss");
            }
        }
    }
}
