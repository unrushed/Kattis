
public class ParentalNames {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        String y = io.getWord();
        String e = io.getWord();


        if(y.charAt(y.length() - 1) == 'e'){
            io.println(y + "x" + e);
        }else if("aeiou".contains(String.valueOf(y.charAt(y.length()-1)))) {
            io.println(y.substring(0, y.length() - 1) + "ex" + e);
        }else if(y.substring(y.length() - 2).equals("ex")){
            io.println(y + e);
        }else{
            io.println(y + "ex" + e);
        }
        io.close();
    }
}