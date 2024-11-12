package Done;

import java.util.Arrays;

public class TreeCutter{
    public static void main(String[] args) {
        Kattio input = new Kattio(System.in, System.out);

        int n = input.getInt();
        int amount = input.getInt();
        int[] trees = new int[n];
        for (int i = 0; i < trees.length; i++) {
            trees[i] = input.getInt();
        }


        Arrays.sort(trees);
        int totalWood = 0;
        int count = 0;
        int prev= -1;
        int cut = trees[n-1];
        while(totalWood <= amount)
        {
            if(prev == -1)
            {
                count =1;
                n = n-1;
                cut = trees[n];
                prev = n-1;
                continue;
            }
            if(n==0) {
                while (totalWood < amount) {
                    cut--;
                    totalWood = totalWood + count;
                }
                break;
            }
            totalWood = totalWood + (trees[n] - trees[n-1])*count;

            if(totalWood > amount)
            {
                totalWood = totalWood - (trees[n]-trees[n-1])*count;

                while(totalWood < amount) {
                    cut--;
                    totalWood = totalWood + count;
                }
                break;
            }
            if(n==0)
            {
                totalWood = totalWood - (trees[n]-trees[n-1])*count;

                while(totalWood < amount) {
                    cut--;
                    totalWood = totalWood + count;
                }
                break;
            }else
            {
            cut = trees[--n];
            count++;
            }

        }
        System.out.println(cut);
        input.close();
    }
}