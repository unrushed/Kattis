package Done;

import java.util.Scanner;

public class Pink {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = Integer.parseInt(input.nextLine());
        int counted = 0;
        for (int i = 0; i < count; i++) {
            String temp = input.nextLine().toLowerCase();

            if(temp.contains("pink") || temp.contains("rose")) counted++;
            System.out.println(temp);
        }
        if(counted == 0) System.out.println("I must watch Star Wars with my daughter");
        else System.out.println(counted);
    }
}
