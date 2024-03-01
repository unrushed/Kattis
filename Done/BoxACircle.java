import java.util.Scanner;

public class BoxACircle {
    static int[] coordinates;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int centerx = input.nextInt(), centery = input.nextInt();
        int raduis = input.nextInt();
        
        coordinates = new int [2]; 
        coordinates = left(centerx, centery, raduis);

        System.out.println(coordinates[0]); 
        System.out.println(coordinates[1]); 
    }

    public static int[] left(int centerx, int centery, int raduis){
        coordinates[0] = centerx - raduis - 2;
        coordinates[1] = centery + 1;
        return coordinates;
    }
}
