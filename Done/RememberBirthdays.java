package Done;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class RememberBirthdays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int numberOfFriends = input.nextInt();
        String[][] arr = new String[numberOfFriends][3];
        ArrayList<String> names = new ArrayList<>();
        int indexTotal = 0;
        for (int i = 0; i < numberOfFriends; i++) {
            String name = input.next();
            String level = input.next();
            String date = input.next();
            boolean test = false;
            int index;
            for (index = 0; index < numberOfFriends; index++) {
                if(date.equals(arr[index][2])){
                    test = true;
                    break;
                }
            }
           // System.out.println(Arrays.toString(arr[0]));
            if(test){
                if(Integer.parseInt(arr[index][1]) < Integer.parseInt(level)){
                    arr[index][0] = name;
                    arr[index][1] = level;
                }
            }else{
                arr[indexTotal][0] = name;
                arr[indexTotal][1] = level;
                arr[indexTotal][2] = date;
                indexTotal++;
            }
        }
        for (int i = 0; i < indexTotal; i++) {
            names.add(arr[i][0]);
        }
        names.sort(Comparator.naturalOrder());

        System.out.println(indexTotal);
        for (int i = 0; i < indexTotal; i++) {
            System.out.println(names.get(i));
        }
    }
}
