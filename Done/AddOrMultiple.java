import java.util.Scanner;

public class AddOrMultiple {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        String first = input.nextLine();
        String operand = input.nextLine();
        String second = input.nextLine();

        String temp = "";

        if(first.length() > second.length()){
            temp = first;
            first = second;
            second = temp;
        }

        if(operand.equals("+")){
            System.out.print(add(first, second));
        }else{
            System.out.print(multiply(first, second));
        }
    }

    public static String multiply(String first, String second){
        for(int x = 0; x < second.length() -1; x++){
            first = first + "0";
        }
        return first;
    }

    public static String add(String first, String second){
        if(first.equals(second)){
            return "2" + second.substring(1, second.length());
        }else{
            return second.substring(0,second.length() - first.length()) + "1" + second.substring(second.length() - first.length(), second.length() - 1);
        }
    }
}