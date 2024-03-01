import java.util.Scanner;
public class attendence {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int numberOfLines = input.nextInt(), k = 0;
        String[] present = new String[numberOfLines];
        String test = "";

        for(int x = 0; x < numberOfLines + 1; x++){
            String str = input.nextLine();
            System.out.print(test);
            if(str == "Present!"){
                present[k] = test;
                k++;
            }else{
                test = str; 
            }
        }
        System.out.print(present[0]);
        for(int y = 0; y < present.length; y++){
            if(present[y] == null){
                continue;
            }
            System.out.println( " h " + present[y]);
        } 
    }
}