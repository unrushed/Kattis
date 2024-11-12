package Done;

import java.util.Scanner;
public class Tripodemeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0;
        long total=0;
        boolean[] nums = new boolean[1000001];
        for(int i =0;i<n;i++)
        {
            int temp = input.nextInt();
            if(!nums[temp]){
                count++;
                nums[temp] = true;
            }
            total += temp;
        }


        System.out.println(count);
        for(int i = 100000 ; i > -1; i--)
        {
            if(nums[i]){
                System.out.print(total - i + " ");
            }
        }
    }
}
