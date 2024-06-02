package Done;

import java.util.Scanner;

public class WaterLog {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfDays = input.nextInt(), minCupsOfWater = input.nextInt(), maxCupsOfWater = input.nextInt();
        boolean test = false;
        boolean test2 = false;
        for (int i = 0; i < numberOfDays - 1; i++) {
            int temp = input.nextInt();
            if(temp == minCupsOfWater) test = true;
            if(temp == maxCupsOfWater) test2 = true;
        }

        if((!(test)) && (!(test2))){
            System.out.println("-1");
        } else if (!(test)) {
            System.out.println(minCupsOfWater);
        } else if (!(test2)) {
            System.out.println(maxCupsOfWater);
        }else{
            printAll(minCupsOfWater, maxCupsOfWater);
        }


    }
    public static void printAll(int a, int b){
        while(!(a > b)){
            System.out.println(a++);
        }
    }

}
