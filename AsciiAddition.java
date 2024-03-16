import java.util.Scanner;

public class AsciiAddition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstLine = input.nextLine();
        String[][] in = new String[7][firstLine.length()];
        in[0] = firstLine.split("");
        for (int x = 1; x < 7; x++) {
            String line = input.nextLine();
            in[x] = line.split("");
        }
        String num = "";
        int z = 0;
        for (int i = 4; i <= firstLine.length(); z = i - 4) {
            if(in[0][z].equals(".") && in[3][z+1].equals(".")){
                num = num.concat("1");
            }else if(in[1][z].equals(".") && in[1][i].equals("x") && in[4][z].equals("x")){
                num = num.concat("2");
            }else if(in[1][z].equals(".") && in[1][i].equals("x") && in[4][z].equals(".") && in[6][z].equals("x")){
                num = num.concat("3");
            }else if(in[0][z+1].equals(".") && in[1][z].equals("x")){
                num = num.concat("4");
            }else if(in[0][z].equals("x") && in[1][i].equals(".") && in[4][z].equals(".")){
                num = num.concat("5");
            }else if(in[1][z].equals("x") && in[1][i].equals(".")){
                num = num.concat("6");
            }else if(in[1][z].equals(".") && in[1][i].equals("x")){
                num = num.concat("7");
            }else if(in[2][z+2].equals("x")){
                num = num.concat("+");
            }else if(in[1][i].equals("x") && in[4][z].equals("x") && in[3][z+1].equals("x")){
                num = num.concat("8");
            }else if(in[3][z+1].equals(".")){
                num = num.concat("0");
            }else{
                num = num.concat("9");
            }
            i += 6;
        }
        String p = (Integer.parseInt(num.substring(0,num.indexOf('+'))) + Integer.parseInt(num.substring(num.indexOf('+') + 1))) + "";
        System.out.println(p);


    }
}
