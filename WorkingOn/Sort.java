package WorkingOn;

public class Sort {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        
        
        int size = io.getInt();
        int[] arr = new int[size];
        int[] arrLocation = new int[size + 1];
        int sum = 0;

        for (int i = 0; i < size; i++) {
            arr[i] = io.getInt();
            arrLocation[arr[i]] = i;
        }

        for(int j = 1; j < size; j++){
            if(arr[j - 1] == j) continue;

            int temp = arr[j];
            int hole = j;
            arr[j - 1] = 0;
            sum++;
            while(arr[j] != j){
                arr[j - 1] = arr[arrLocation[j]];
                arr[arrLocation[j]] = 0;
                hole = arrLocation[j];
                sum++;
                arr[hole - 1] = temp;
                temp = 0;
                sum++;
            }
        }
        System.out.println(sum);
    }
}
