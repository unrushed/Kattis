package Done;

import java.util.Scanner;

public class Karte {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean naw = false;
        StringBuilder a = new StringBuilder(input.nextLine());
        boolean[] p = new boolean[14];
        boolean[] k = new boolean[14];
        boolean[] h = new boolean[14];
        boolean[] t = new boolean[14];
        while(!a.isEmpty()){
            String suit = String.valueOf(a.charAt(0));
            int number = Integer.parseInt(a.substring(1,3));

            if(suit.equals("P")){
                if(p[number] == true){
                    naw = true;
                    break;
                }else {
                    p[number] = true;
                }
            }else if(suit.equals("K")){
                if(k[number] == true){
                    naw = true;
                    break;
                }else {
                    k[number] = true;
                }
            }else if(suit.equals("H")){
                if(h[number] == true){
                    naw = true;
                    break;
                }else {
                    h[number] = true;
                }
            }else if(suit.equals("T")){
                if(t[number] == true){
                    naw = true;
                    break;
                }else {
                    t[number] = true;
                }
            }
            for (int i = 0; i < 3; i++) {
                a.deleteCharAt(0);
            }

        }

        if(naw) System.out.println("GRESKA");
        else{
            System.out.print(countFalse(p) + " ");
            System.out.print(countFalse(k) + " ");
            System.out.print(countFalse(h) + " ");
            System.out.print(countFalse(t) + " ");
        }
    }
    public static int countFalse(boolean[] array){
        int answer = 0;
        for (int i = 0; i < 14; i++) {
            if(!array[i]) answer++;
        }
        return answer - 1;
    }
}
