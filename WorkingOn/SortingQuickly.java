package WorkingOn;

import java.util.Arrays;

public class SortingQuickly {

    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);

        int size = io.getInt();
        int zeroLocation = 0;

        int[] arr = new int[size];
        int[] arrLocation = new int[size + 1];
        int[] ap = new int[size + 1];
        ap[0] = 0;


        int[] full = new int[ap.length];
        full[0] = 0;
        for(int s = 1; s < full.length; s++){
            full[s] = s;
        }

        for (int i = 0; i < size; i++) {
            arr[i] = io.getInt();
            arrLocation[arr[i]] = i;
        }

        for(int x = 1; x < ap.length; x++){
            ap[x] = arr[x - 1];
        }
        int a = 0;
        int z = 1;
        while(true){
            printA(ap);
            System.out.println(z);
            if(Arrays.equals(ap, full)){
                System.out.println("1L");
                break;
            }else if(ap[z] == z){
                z++;
                System.out.println("2L");
            }else if(ap[0] == z){
                swapFromIndexZero(ap, z);
                zeroLocation = 0;
                a++;
                System.out.println("3L");
            }else if(z != ap[z] && ap[0] == 0){
                swapToZero(ap, z);
                zeroLocation = z;
                a++;
                System.out.println("4L");
            }else if(ap[z] == 0){
                swapFromAnyWhere(ap, arrLocation, z);
                zeroLocation = ap[arrLocation[z] + 1];
                a++;
                System.out.println("5L");
            }else{
                swapFromHoleToZero(ap, zeroLocation);
                zeroLocation = 0;
                System.out.println("6L");
            }
        }

        io.print(a);
        io.close();
        
    }
    public static void printA(int[] ap){
        for (int i = 0; i < ap.length; i++) {
            System.out.print(ap[i] + " ");
        }
        System.out.println();
    }

    public static void swapFromIndexZero(int[] ap, int z){
        ap[z] = ap[0];
        ap[0] = 0;

    }
    public static void swapToZero(int[] ap, int z){
        ap[0] = ap[z];
        ap[z] = 0;

    }

    public static void swapFromAnyWhere(int[] ap, int[] arrLocation, int z) {
        ap[z] = z;
        ap[arrLocation[z] + 1] = 0;
    }
    public static void swapFromHoleToZero(int[] ap, int holeLocation){
        ap[holeLocation] = ap[0];
        ap[0] = 0;
    }
}