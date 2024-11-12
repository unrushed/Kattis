package Done;

import java.util.Scanner;

public class CandyStore{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] names = new String[input.nextInt()][2];
        String[] initials = new String[input.nextInt()];

        for(int i = 0; i < names.length; i++){
            names[i][0] = input.next();
            names[i][1] = input.nextLine();
        }

        for(int i = 0; i < initials.length; i++){
            initials[i] = input.nextLine();
        }
        
        for (int i = 0; i < initials.length; i++) {
            switch(count(names, initials[i])){
                case 1:
                    System.out.println(findName(names, initials[i]));
                    break;
                case 0:
                    System.out.println("nobody");
                    break;
                default:
                    System.out.println("ambiguous");
                    break;
            }
        }
    }

    public static int count(String[][] names, String initial){
        int sum = 0;
        for (int i = 0; i < names.length; i++) {
            if(names[i][0].charAt(0) == initial.charAt(0) && names[i][1].charAt(1) == initial.charAt(1)){
                sum++;
            }
        }
        return sum;
    }
    public static String findName(String[][] names, String initial){
        for (int i = 0; i < names.length; i++) {
            if(names[i][0].charAt(0) == initial.charAt(0) && names[i][1].charAt(1) == initial.charAt(1)){
                return names[i][0] + names[i][1];
            }
        }
        return "";
    }
}