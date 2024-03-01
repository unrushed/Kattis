package Kattis;
import java.util.Scanner;
public class Everywhere {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        int numberOfTrials = input.nextInt();
        int count = 0;
        boolean test = true;

        for(int x = 0; x < numberOfTrials; x++){
            int numberOfCities = input.nextInt();
            String[] cities = new String[numberOfCities];
            count = 0;
            test = true;

            for(int z = 0; z < numberOfCities; z++){
                String cityTemp = input.next();

                for(int p = 0; p < count; p++){
                    if(cityTemp.equals(cities[p])){
                        test = false;
                        break;
                    }
                }

                if(test){
                    cities[count] = cityTemp;
                    count++;
                }
                test = true;
            }
            System.out.println(count);
        }
    }
}
