package Done;

public class pizzaA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] z = new int[3];

        int[] f2 = new int[3];
        for (int f = 0, i = 0; f < 3; f++, i++) {
            z[f] = input.nextInt();
            f2[i] = input.nextInt();
        }

        Arrays.sort(z);
        Arrays.sort(f2);

        if(z[0] == z[1]) System.out.print(z[2]);
        else System.out.print(z[0]);

        System.out.print(" ");

        if(f2[0] == f2[1]) System.out.print(f2[2]);
        else System.out.print(f2[0]);
    }
}
