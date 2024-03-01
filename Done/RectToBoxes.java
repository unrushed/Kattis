import java.util.Scanner;
public class RectToBoxes {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[] arr = new int[6];

        arr[0] = input.nextInt();
        arr[1] = input.nextInt();

        arr[2] = input.nextInt();
        arr[3] = input.nextInt();

        arr[4] = input.nextInt();
        arr[5] = input.nextInt();

        boolean happened = false;
        int numberFound = findThree(arr);
        int sum1 = 0;
        if(numberFound > 0){
            for(int u = 0; u < 6; u++){
                if(arr[u] != numberFound) sum1 += arr[u];
            }
            if(sum1 == numberFound){
                System.out.print("YES");
                happened = true;
            }
        }
        if(happened == false){
            int findTwo = findMeTwo(arr);
            if(findTwo > 0){
                
            }
        }
    }

    public static int findThree(int[] arr){
        for(int k = 0; k < 6; k++){
            int count = 0;
            for(int f = 0; f < 6; f++){
                if(arr[k] == arr[f] && k != f){
                    count++;
                }
                if(count == 3) return arr[k];
            }
        }
        return -1;
    }

    public static int findMeTwo(int[] arr){
        for(int k = 0; k < 6; k++){
            int count = 0;
            for(int f = 0; f < 6; f++){
                if(arr[k] == arr[f] && k != f){
                    count++;
                }
                if(count == 2) return arr[k];
            }
        }
        return -1;
    }
}
