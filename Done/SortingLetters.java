package Done;
import java.util.Arrays;

public class SortingLetters {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);

        String one = io.getWord();
        String two = io.getWord();

        String out = one + two;

        String[] sort = out.split("");
        Arrays.sort(sort);
        for (int i = 0; i < out.length(); i++) {
            System.out.print(sort[i]);
        }
    }
}
