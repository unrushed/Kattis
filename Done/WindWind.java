import java.util.Scanner;
public class WindWind {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int windSpeed = input.nextInt();
        int testCases = input.nextInt();

        for(int x = 0; x < testCases; x++){
            String roadNameTemp = input.next();
            int speedTemp = input.nextInt();

            if(speedTemp < windSpeed){
                System.out.println(roadNameTemp + " lokud");
            }else{
                System.out.println(roadNameTemp + " opin");
            }
        }
    }
}
