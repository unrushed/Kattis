package Done;

import java.util.Scanner;

public class Datum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        int month = input.nextInt();

        switch (month){
            case 10:
            case 1:
                while (day > 7){
                    day -= 7;
                }

                switch (day){
                    case 1:
                        System.out.println("Thursday");
                        break;
                    case 2:
                        System.out.println("Friday");
                        break;
                    case 3:
                        System.out.println("Saturday");
                        break;
                    case 4:
                        System.out.println("Sunday");
                        break;
                    case 5:
                        System.out.println("Monday");
                        break;
                    case 6:
                        System.out.println("Tuesday");
                        break;
                    case 7:
                        System.out.println("Wednesday");
                        break;
                }
                break;
            case 11:
            case 2:
            case 3:
                while (day > 7){
                    day -= 7;
                }

                switch (day){
                    case 1:
                        System.out.println("Sunday");
                        break;
                    case 2:
                        System.out.println("Monday");
                        break;
                    case 3:
                        System.out.println("Tuesday");
                        break;
                    case 4:
                        System.out.println("Wednesday");
                        break;
                    case 5:
                        System.out.println("Thursday");
                        break;
                    case 6:
                        System.out.println("Friday");
                        break;
                    case 7:
                        System.out.println("Saturday");
                        break;
                }
                break;
            case 7:
            case 4:
                while (day > 7){
                    day -= 7;
                }

                switch (day){
                    case 1:
                        System.out.println("Wednesday");
                        break;
                    case 2:
                        System.out.println("Thursday");
                        break;
                    case 3:
                        System.out.println("Friday");
                        break;
                    case 4:
                        System.out.println("Saturday");
                        break;
                    case 5:
                        System.out.println("Sunday");
                        break;
                    case 6:
                        System.out.println("Monday");
                        break;
                    case 7:
                        System.out.println("Tuesday");
                        break;
                }
                break;
            case 5:
                while (day > 7){
                    day -= 7;
                }

                switch (day){
                    case 1:
                        System.out.println("Friday");
                        break;
                    case 2:
                        System.out.println("Saturday");
                        break;
                    case 3:
                        System.out.println("Sunday");
                        break;
                    case 4:
                        System.out.println("Monday");
                        break;
                    case 5:
                        System.out.println("Tuesday");
                        break;
                    case 6:
                        System.out.println("Wednesday");
                        break;
                    case 7:
                        System.out.println("Thursday");
                        break;
                }
                break;
            case 6:
                while (day > 7){
                    day -= 7;
                }

                switch (day){
                    case 1:
                        System.out.println("Monday");
                        break;
                    case 2:
                        System.out.println("Tuesday");
                        break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                    case 4:
                        System.out.println("Thursday");
                        break;
                    case 5:
                        System.out.println("Friday");
                        break;
                    case 6:
                        System.out.println("Saturday");
                        break;
                    case 7:
                        System.out.println("Sunday");
                        break;
                }
                break;
            case 8:
                while (day > 7){
                    day -= 7;
                }

                switch (day){
                    case 1:
                        System.out.println("Saturday");
                        break;
                    case 2:
                        System.out.println("Sunday");
                        break;
                    case 3:
                        System.out.println("Monday");
                        break;
                    case 4:
                        System.out.println("Tuesday");
                        break;
                    case 5:
                        System.out.println("Wednesday");
                        break;
                    case 6:
                        System.out.println("Thursday");
                        break;
                    case 7:
                        System.out.println("Friday");
                        break;
                }
                break;
            case 12:
            case 9:
                while (day > 7){
                    day -= 7;
                }

                switch (day){
                    case 1:
                        System.out.println("Tuesday");
                        break;
                    case 2:
                        System.out.println("Wednesday");
                        break;
                    case 3:
                        System.out.println("Thursday");
                        break;
                    case 4:
                        System.out.println("Friday");
                        break;
                    case 5:
                        System.out.println("Saturday");
                        break;
                    case 6:
                        System.out.println("Sunday");
                        break;
                    case 7:
                        System.out.println("Monday");
                        break;
                }
                break;
        }
    }
}
