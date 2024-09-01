package Done;

import java.util.Scanner;

public class Ratio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int first = input.nextInt();
        for (int i = 0; i < n - 1; i++) {
            int firstTemp = first;
            int temp = input.nextInt();
            while(true){
                int u = gcd(firstTemp, temp);
                if(u == 1) break;
                else {
                    firstTemp = firstTemp/u;
                    temp = temp/u;
                }
            }
            System.out.println(firstTemp + "/" + temp);
        }
    }
    public static int gcd(int m,int n){
        if((n < 0 || m < 0) || (m == 0 && n == 0)) return -1; // determines if n or m is negative and determines if both m and n are 0. if true it will return -1.
        int temp = n;
        if(n == 0)
            return m;
        else{
            n = m%n;
            m = temp;
            gcd(m, n);
            return gcd(m, n); // step of recursion where it will call the gcd method again and run till n equals 0
        }
    }
}


