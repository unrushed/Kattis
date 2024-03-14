package Done;

import java.util.Scanner;
import java.util.Arrays;
public class RectangleToSquare {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int heights[] = new int[3];
        int widths[] = new int[3];

        heights[0] = input.nextInt();
        widths[0] = input.nextInt();

        heights[1] = input.nextInt();
        widths[1] = input.nextInt();

        heights[2] = input.nextInt();
        widths[2] = input.nextInt();

        System.out.print(Arrays.toString(heights));


        if(widths[0] == widths[1] && widths[0] == widths[2]){

        }else if(heights[0] == heights[1] && heights[0] == heights[2]){

        }else if(widths[0] == widths[1] || widths[0] == widths[2] || widths[1] == widths[2]){
            
        }
    }
}
