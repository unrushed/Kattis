package Done;

import java.util.Scanner;

public class GoatRope {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double xGoat = input.nextDouble();
        double yGoat = input.nextDouble();

        double xHouse1 = input.nextDouble();
        double yHouse1 = input.nextDouble();

        double xHouse2 = input.nextDouble();
        double yHouse2 = input.nextDouble();

        double bottomLeft = Math.sqrt(Math.pow(xGoat - xHouse1,2) + Math.pow(yGoat - yHouse1 ,2));
        double topRight = Math.sqrt(Math.pow(xGoat - xHouse2,2) + Math.pow(yGoat - yHouse2 ,2));
        double topLeft = Math.sqrt(Math.pow(xGoat - xHouse1,2) + Math.pow(yGoat - yHouse2,2));
        double bottomRight = Math.sqrt(Math.pow(xGoat - xHouse2,2) + Math.pow(yGoat-yHouse1,2));

        if(xGoat > xHouse2 && yGoat <= yHouse2 && yGoat >= yHouse1){
            System.out.println(Math.abs(xGoat - xHouse2));
        } else if (xGoat < xHouse1 && yGoat <= yHouse2 && yGoat >= yHouse1) {
            System.out.println(Math.abs(xHouse1 - xGoat));
        } else if (xGoat <= xHouse2 && xGoat >= xHouse1 && yGoat >= yHouse2) {
            System.out.println(Math.abs(yGoat - yHouse2));
        } else if(yGoat <= yHouse1 && xGoat >= xHouse1 && xGoat <= xHouse2){
            System.out.println(Math.abs(yGoat - yHouse1));
        }else if(bottomLeft < topRight && bottomLeft < topLeft && bottomLeft < bottomRight){

            System.out.println(bottomLeft);
        } else if (bottomRight < topRight && bottomRight < topLeft && bottomRight < bottomLeft) {
            System.out.println(bottomRight);
        }else if(topLeft < topRight && topLeft < bottomLeft && topLeft < bottomRight){
            System.out.println(topLeft);
        }else{
            System.out.println(topRight);
        }
    }
}
