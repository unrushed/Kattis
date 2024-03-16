import java.util.Scanner;
//https://open.kattis.com/problems/blueberrywaffle
public class BlueBerryWaffles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();

        double z = (double) (180/x) * y;
        if(z >= 360){
            while(z >= 360){
                z -= 360;
            }
        }

        if(z >= 270 || z <= 90){
            System.out.println("up");
        }else{
            System.out.println("down");
        }
        //solve if x > 270 or x < 90 --> upwards
        //solve if x > 90 and x < 270 --> down
    }
}
