package Kattis;
import java.util.Scanner;

public class LineThemUp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        String[] names = new String[x];
        int[] firstLetterNumber = new int[x];
        boolean increasing = false;
        boolean decreasing = false;
        String str = "";

        for(int u = 0; u < x; u++){
            names[u] = input.next();
        }

        for(int y = 0; y < x; y++){
            firstLetterNumber[y] = names[y].charAt(0) - 0;
        }
        if(firstLetterNumber[0] == firstLetterNumber[1]){
            str = getSecondLetter(0, names);
        }else if(firstLetterNumber[0] < firstLetterNumber[1]){
            increasing = true;
            str = "INCREASING";
        }else if(firstLetterNumber[0] > firstLetterNumber[1]){
            decreasing = true;
            str = "DECREASING";
        }

        for(int z = 1; z < x - 1; z++){
            if(firstLetterNumber[z] == firstLetterNumber[z+1]){
                str = getSecondLetter(z, names);
                if(str == "INCREASING"){
                    increasing = true;
                }else{
                    decreasing = true;
                }
            }else if(firstLetterNumber[z] < firstLetterNumber[z + 1] && increasing == true){
                increasing = true;
            }else if(firstLetterNumber[z] > firstLetterNumber[z + 1] && decreasing == true){
                decreasing = true;
            }else if(firstLetterNumber[z] < firstLetterNumber[z + 1] && decreasing == true){
                str = "NEITHER";
                break;
            }else if(firstLetterNumber[z] > firstLetterNumber[z + 1] && increasing == true){
                str = "NEITHER";
                break;
            }
        }
        System.out.print(str);
    }

    public static String getSecondLetter(int z, String[] names){ //finds the largest number in the array
        String str = "";
        for(int p = 1; p < getSmaller(z, names).length(); p++){
            if(names[z].charAt(p) < names[z+1].charAt(p)){
                str = "INCREASING";
                break;
            }else if(names[z].charAt(p) > names[z+1].charAt(p)){
                str = "DECREASING";
                break;
            }else{
                continue;
            }
        }
        if(str == ""){
            str = "INCREASING";
            return str;
        }else{
            return str;
        }
    }

    public static String getSmaller(int z, String[] names){
        if(names[z].length() < names[z+1].length()){
            return names[z];
        }else{
            return names[z+1];
        }
    }
}
