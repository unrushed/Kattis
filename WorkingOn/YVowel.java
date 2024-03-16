package WorkingOn;

public class YVowel {
    //https://open.kattis.com/problems/isyavowel
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);

        String str = io.getWord();
        int sumWO = 0;
        int sumW = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'i' || str.charAt(i) == 'u') {
                sumWO++;
                sumW++;
            }else if(str.charAt(i) == 'y'){
                sumW++;
            }
        }
        System.out.println(sumWO + " " + sumW);
    }
}
