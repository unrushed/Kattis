import java.util.Scanner;
public class NastyHacks{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int numberOfTests = input.nextInt(), tempDont, tempDo, tempCost;
        String[] whatYouShouldDo;
        whatYouShouldDo = new String[numberOfTests];
        

        for(int x = 0; x < numberOfTests; x++){
            tempDont = input.nextInt();
            tempDo = input.nextInt();
            tempCost = input.nextInt();

            if((tempDo - tempCost) == tempDont){
                whatYouShouldDo[x] = "does not matter";
            }
            else if((tempDo - tempCost) > tempDont){
                whatYouShouldDo[x] = "advertise";
            }else{
                whatYouShouldDo[x] = "do not advertise";
            }
        }
        for(int p = 0; p < numberOfTests; p++){
            System.out.println(whatYouShouldDo[p]);
        }
    }
}