package Done;

public class ConsonantsRemoved {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);

        String word = io.getWord();

        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u' || word.charAt(i) == 'y' || word.charAt(i) == 'A' || word.charAt(i) == 'E' || word.charAt(i) == 'I' || word.charAt(i) == 'O' || word.charAt(i) == 'U' || word.charAt(i) == 'Y'){
                io.print(word.charAt(i));
            }
        }
        io.close();
    }
}
