package Done;

public class PlantsVSZombies {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);

        int x = io.getInt();
        int smallest = io.getInt();
        for (int i = 0; i < x - 1; i++) {
            int temp = io.getInt();
            if(temp < smallest) smallest = temp;
        }
        io.println(smallest + 1);
        io.close();
    }
}
