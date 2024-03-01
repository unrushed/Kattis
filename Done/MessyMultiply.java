package Kattis;
import java.util.Scanner;
public class MessyMultiply {
   public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        while(true){
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            if(num1 == 0 && num2 == 0) break;
            
            int answer = num1 * num2;
            int answerLength = (int) Math.ceil(Math.log10(answer));

            int num1Length = String.valueOf(num1).length();
            int num2Length = String.valueOf(num2).length();

            int[] number1 = new int[num1Length];
            number1 = fillArray(num1Length, num1);

            int[] number2 = new int[num2Length];
            number2 = fillArray(num2Length, num2);

            int startNumber = num1Length + num2Length - answerLength;

            printOuterBox(number1);
            printTopRowOperator(number1);

            for(int z = 0; z < number2.length; z++){
                printInnerBoxSeperator(number1);
                printRowOne(number1, z, num1Length, number2, startNumber);
                printRowTwo(number2, z, num1Length);
                printRowThree(number1, z, num1Length, number2, answer, answerLength, num2Length, startNumber);
                
            }
            printInnerBoxSeperator(number1);
            printAnswerStart(answerLength, answer, num1Length);
            printOuterBox(number1);
        }
    } 

    public static int[] fillArray(int length, int num){
        int[] a = new int[length];
        for(int r = length - 1; num > 0; r--){
            a[r] = num%10;
            num/=10;
        }
        return a;
    }

    public static void printOuterBox(int[] number1){
        System.out.print("+-");
        for(int y = 0; y < number1.length * 4 + 1; y++){
            System.out.print("-");
        }
        System.out.print("-+");
        System.out.println();
    }

    public static void printTopRowOperator(int[] number1){
        System.out.print("|");
        for(int z = 0; z < number1.length; z++){
            System.out.print("   " + number1[z]);
        }
        System.out.print("   |");
        System.out.println();
    }

    public static void printInnerBoxSeperator(int[] number1){
        System.out.print("| ");
        for(int u = 0; u < number1.length; u++){
            System.out.print("+---");
        }
        System.out.print("+");
        System.out.print(" |");
        System.out.println();
    }

    public static void printRowOne(int[] number1, int z,int num1Length, int[] number2, int startNumber){
        int l = 0;
        System.out.print("|");
        if(z >= startNumber + 1)
            System.out.print("/");
        else
            System.out.print(" ");
        for(int j = 0; j < num1Length; j++, l++){
            System.out.print("|" + number1[j] * number2[z]/10 + " /");
        }
        System.out.print("| |");
        System.out.println();
    }

    public static void printRowTwo(int[] number2,int z, int num1Length){
        System.out.print("|");
        for(int y = 0; y < num1Length; y++){
            System.out.print(" | /");
        }
        System.out.print(" |");
        System.out.print(number2[z]);
        System.out.print("|");
        System.out.println();
    }

    public static void printRowThree(int[] number1, int z,int num1Length, int[] number2,int answer,int answerLength, int num2Length,int startNumber){
        System.out.print("|");
        if(z >= startNumber) 
            System.out.print(Integer.toString(answer).charAt(answerLength - num1Length - num2Length + z));
        else 
            System.out.print(" ");
        for(int j = 0; j < num1Length; j++){
            System.out.print("|/ " + number1[j] * number2[z]%10);
        }
        System.out.print("| |");
        System.out.println();
    }

    public static void printAnswerStart(int answerLength,int answer,int num1Length){
        int l = 0;
        System.out.print("|");
        if(answerLength> num1Length) System.out.print("/ ");
        else System.out.print("  ");
        for(int j = 0; j < num1Length; j++){
            System.out.print(Integer.toString(answer).charAt(answerLength - num1Length + j));
            if(j == num1Length - 1) System.out.print("   ");
            else System.out.print(" / ");
        }
        System.out.print(" |");
        System.out.println();
    }
}