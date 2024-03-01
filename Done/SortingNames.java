package Kattis;

import java.util.Arrays;
import java.util.Scanner;

public class SortingNames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            int numberOfNames = input.nextInt();
            if(numberOfNames == 0) break;
            else{System.out.println();}
            String2[] names = new String2[numberOfNames];

            for (int i = 0; i < numberOfNames; i++) {
                names[i] = new String2(input.next(), i);
            }

            Arrays.sort(names);
            for (int x = 0; x < numberOfNames; x++) {
                System.out.println(names[x]);
            }

        }
    }
}
class String2 implements Comparable<String2>{
    public String str;
    public int index;

    public String2(String a, int i) {
        str = a;
        index = i;
    }
    @Override
    public int compareTo(String2 other) {
        if(str.substring(0,2).compareTo(other.str.substring(0,2)) != 0){
            return str.substring(0,2).compareTo(other.str.substring(0,2));
        }else{
            return this.index - other.index;
        }
    }
    public String toString(){
        return str;
    }
}