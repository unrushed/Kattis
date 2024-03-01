import java.util.Scanner;
public class ArtichokePriceDecline {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int p = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int n = input.nextInt();

        double[] answersToObserve = new double[n];
        answersToObserve = solveBrutForce(p, a, b, c, d, n);
        double biggestDecrease = findBiggestDifference(answersToObserve);
        System.out.print(biggestDecrease);
    }

    public static double[] solveBrutForce(int p,int a,int b,int c,int d,int n){
        double[] arr = new double[n];
        int indexNumber = 0;
        for(int u = 1; u < n + 1; u++, indexNumber++){
            arr[indexNumber] = p * (Math.sin(a * u + b) + Math.cos(c * u + d) + 2);
        }
        return arr;
    }
    public static double findBiggestDifference(double[] answersToObserve){
        double temp = 0;
        for(int x = 0; x < answersToObserve.length - 1; x++){
            for(int y = x + 1; y < answersToObserve.length; y++){
                if(answersToObserve[x] - answersToObserve[y] > temp) temp = answersToObserve[x] - answersToObserve[y];             }
        }
        return temp;
    }
}