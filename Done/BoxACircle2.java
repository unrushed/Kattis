import java.util.Scanner;
public class BoxACircle2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int centerx = input.nextInt(), centery = input.nextInt(), raduis = input.nextInt(), tempx, tempy;

        tempx = centerx + raduis;
        tempy = centery + raduis;
        System.out.println(tempx + " " + tempy);

        tempx = centerx - raduis;
        tempy = centery + raduis;
        System.out.println(tempx + " " + tempy);

        tempx = centerx - raduis;
        tempy = centery - raduis;
        System.out.println(tempx + " " + tempy);

        tempx = centerx + raduis;
        tempy = centery - raduis;
        System.out.println(tempx + " " + tempy);
    }
}
