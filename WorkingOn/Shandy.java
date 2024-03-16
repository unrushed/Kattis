package WorkingOn;

public class Shandy {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);

        int x = io.getInt();
        int z = io.getInt();
        if(x>z) System.out.println(z*2);
        else System.out.println(x*2);
    }
}
