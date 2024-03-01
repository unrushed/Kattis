package Kattis;

import java.util.Scanner;

public class RectangleToBoxes {
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);

        int[] box1 = new int[2];
        int[] box2 = new int[2];
        int[] box3 = new int[2];

        box1[0] = input.nextInt();
        box1[1] = input.nextInt();

        box2[0] = input.nextInt();
        box2[1] = input.nextInt();

        box3[0] = input.nextInt();
        box3[1] = input.nextInt();

        boolean test = false;
        int numberFound = findThree(box1, box2, box3);
        int sum1 = 0;
        if(numberFound > 0){
            if(numberFound == 1){
                if(box1[1] + box2[1] + box3[1] == box1[0]){
                    System.out.println("YES");
                    test = true;
                }
            }
        }
        /*if(!test){
            int findTwo = findMeTwo(box1, box2, box3);
            if(findTwo > 0){

            }
        }
        if(!test){
            System.out.println("NO");
        }*/
    }

    public static int findThree(int[] box1, int[] box2, int[] box3){
        if(box1[0] == box2[0] && box1[0] == box3[0]){
            return 1;
        }
        else if(box1[1] == box2[1] && box1[1] == box3[1]){
            return 2;
        }else{
            return -1;
        }
    }

    /*public static int findMeTwo(int[] box1, int[] box2, int[] box3){
        if(box1[0])
    }*/
}
