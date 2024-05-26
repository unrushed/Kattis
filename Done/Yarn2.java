package Done;

public class Yarn2 {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);

        int length = io.getInt();
        int width = io.getInt();
        int sum = 0;
        for (int i = 0; i < length; i++) {
            String[] n = io.getWord().split("");
            for (int j = 0; j < width; j++) {
                switch (n[j]){
                    case ".":
                        sum += 20;
                        break;
                    case "O":
                        sum += 10;
                        break;
                    case "\\", "/":
                        sum += 25;
                        break;
                    case "A":
                        sum += 35;
                        break;
                    case "^":
                        sum += 5;
                        break;
                    case "v":
                        sum += 22;
                        break;
                }
            }
        }
        System.out.println(sum);
    }
}
