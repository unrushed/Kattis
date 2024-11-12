package Done;

public class kakor {

    public static long cookies(int N, int[] A){
        long total = 0;
        for (int i = 0; i < N; i++) {
            total += A[i];
        }
        return total;
    }
}
