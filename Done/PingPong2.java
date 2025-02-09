package Done;

public class PingPong2 {
    public static void main(String[] args) {
        Kattio input = new Kattio(System.in, System.out);

        int rounds = input.getInt();

        int paul = input.getInt();
        int opponent = input.getInt();

        int totalScore = paul + opponent;

        while (totalScore >= 2 * rounds){
            totalScore -= (2*rounds);
        }

        if(totalScore < rounds) System.out.println("paul");
        else System.out.println("opponent");
    }
}
