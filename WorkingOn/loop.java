public class loop {
    public static void main(String[] args) {
        for (int i = 0; i < 53; i++) {
            if((i % 9 != 0) == ((i + 1) % 9 != 0) && i > 8 && i < 44){
                System.out.println(i);
            }
        }
    }
}
