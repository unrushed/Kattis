package Done;

import java.util.Scanner;

public class Message {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int rows = Integer.parseInt(input.next());
        int columns = Integer.parseInt(input.next());
        String[][] arr = new String[rows][columns];
        StringBuilder out = new StringBuilder();

        // input into arr

        for (int i = 0; i < rows; i++) {
            String tempRow =  input.next();
            arr[i] = tempRow.split("");
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if(!(arr[i][j].equals("."))){
                    out.append(arr[i][j]);
                }
            }
        }
        System.out.println(out);
    }
}
