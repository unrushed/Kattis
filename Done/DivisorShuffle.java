package Done;

import java.util.ArrayList;
import java.util.Collections;

public class DivisorShuffle {

    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        
        int n = io.getInt();
        
        ArrayList<Long> list = new ArrayList<>();
        
        long max = 0L;
        
        for(int p = 0; p < n; p++) {
            long temp = io.getLong();
            if(temp > max) max = temp;
            list.add(temp);
        }
        
        Collections.sort(list);
        Long b = 0L;
        if(n == 1) {
        	b = max;
        }else {
        	b = list.get(list.size() - 2);
            for(int y = n - 1; y > -1; y--) {
                if(max%list.get(y) != 0 || list.indexOf(list.get(y)) != y ||( list.indexOf(list.get(y)) != y && max == list.get(y))) {
                    b = list.get(y);
                    break;
                }
            }
        }
        io.print(b + " " + max);
        io.close();
    }

}