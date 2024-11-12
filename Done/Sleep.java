package Done;

import java.util.Scanner;
import java.util.TreeMap;

public class Sleep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String in = input.nextLine();

        String[] in2 = input.nextLine().split(" ");
        boolean fail = false;
        if(in.length() == in2.length){
            TreeMap<Character, String> map = new TreeMap<>();

            for (int i = 0; i < in2.length; i++) {
                if(!map.containsKey(in.charAt(i))){
                    if(!map.containsValue(in2[i])) {
                        map.put(in.charAt(i), in2[i]);
                    }else{
                        System.out.println("False");
                        fail = true;
                        break;
                    }
                }else if(!(map.get(in.charAt(i)).equals(in2[i]))){
                    System.out.println("False");
                    fail = true;
                    break;
                }
            }
            if(!fail) System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
