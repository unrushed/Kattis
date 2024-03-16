import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String firstLine = input.nextLine();
        String[][] in = new String[7][firstLine.length()];
        in[0] = firstLine.split("");
        for(int x = 1; x < 7; x++){
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
        int p = Integer.parseInt(num.substring(0,num.indexOf('+'))) + Integer.parseInt(num.substring(num.indexOf('+') + 1));
        String answer = p + "";
        System.out.println(p);
        for (int i = 0; i < answer.length(); i++) {
            String[][] temp = {};
            switch (answer.charAt(i)) {
                case '1':
                    temp = copyOne();
                    break;
                case '2':
                    temp = copyTwo();
                    break;
                case '3':
                    temp = copyThree();
                    break;
                case '4':
                    temp = copyFour();
                    break;
                case '5':
                    temp = copyFive();
                    break;
                case '6':
                    temp = copySix();
                    break;
                case '7':
                    temp = copySeven();
                    break;
                case '8':
                    temp = copyEight();
                    break;
                case '9':
                    temp = copyNine();
                    break;
                default:
                    break;
            }
            print2d(temp);
            print2d(copySpace());
        }
        

    }
    public static String[][] copyZero(){
        String[][] a = new String[7][5];
        a[0] = new String[]{"+", "-", "-", "-", "+"};
        a[1] = new String[]{"|", " ", " ", " ", "|"};
        a[2] = new String[]{"|", " ", " ", " ", "|"};
        a[3] = new String[]{"+", " ", " ", " ", "+"};
        a[4] = new String[]{"|", " ", " ", " ", "|"};
        a[5] = new String[]{"|", " ", " ", " ", "|"};
        a[6] = new String[]{"+", "-", "-", "-", "+"};
        return a;
    }
    public static String[][] copyOne(){
        String[][] a = new String[7][5];
        a[0] = new String[]{" ", " ", " ", " ", "+"};
        a[1] = new String[]{" ", " ", " ", " ", "|"};
        a[2] = new String[]{" ", " ", " ", " ", "|"};
        a[3] = new String[]{" ", " ", " ", " ", "+"};
        a[4] = new String[]{" ", " ", " ", " ", "|"};
        a[5] = new String[]{" ", " ", " ", " ", "|"};
        a[6] = new String[]{" ", " ", " ", " ", "+"};
        return a;
    }
    public static String[][] copyTwo(){
        String[][] a = new String[7][5];
        a[0] = new String[]{"+", "-", "-", "-", "+"};
        a[1] = new String[]{" ", " ", " ", " ", "|"};
        a[2] = new String[]{" ", " ", " ", " ", "|"};
        a[3] = new String[]{"+", "-", "-", "-", "+"};
        a[4] = new String[]{"|", " ", " ", " ", " "};
        a[5] = new String[]{"|", " ", " ", " ", " "};
        a[6] = new String[]{"+", "-", "-", "-", "+"};
        return a;
    }

    public static String[][] copyThree(){
        String[][] a = new String[7][5];
        a[0] = new String[]{"+", "-", "-", "-", "+"};
        a[1] = new String[]{" ", " ", " ", " ", "|"};
        a[2] = new String[]{" ", " ", " ", " ", "|"};
        a[3] = new String[]{"+", "-", "-", "-", "+"};
        a[4] = new String[]{" ", " ", " ", " ", "|"};
        a[5] = new String[]{" ", " ", " ", " ", "|"};
        a[6] = new String[]{"+", "-", "-", "-", "+"};
        return a;
    }

    public static String[][] copyFour(){
        String[][] a = new String[7][5];
        a[0] = new String[]{"+", " ", " ", " ", "+"};
        a[1] = new String[]{"|", " ", " ", " ", "|"};
        a[2] = new String[]{"|", " ", " ", " ", "|"};
        a[3] = new String[]{"+", "-", "-", "-", "+"};
        a[4] = new String[]{" ", " ", " ", " ", "|"};
        a[5] = new String[]{" ", " ", " ", " ", "|"};
        a[6] = new String[]{" ", " ", " ", " ", "+"};
        return a;
    }

    public static String[][] copyFive(){
        String[][] a = new String[7][5];
        a[0] = new String[]{"+", "-", "-", "-", "+"};
        a[1] = new String[]{"|", " ", " ", " ", " "};
        a[2] = new String[]{"|", " ", " ", " ", " "};
        a[3] = new String[]{"+", "-", "-", "-", "+"};
        a[4] = new String[]{" ", " ", " ", " ", "|"};
        a[5] = new String[]{" ", " ", " ", " ", "|"};
        a[6] = new String[]{"+", "-", "-", "-", "+"};
        return a;
    }

    public static String[][] copySix(){
        String[][] a = new String[7][5];
        a[0] = new String[]{"+", "-", "-", "-", "+"};
        a[1] = new String[]{"|", " ", " ", " ", " "};
        a[2] = new String[]{"|", " ", " ", " ", " "};
        a[3] = new String[]{"+", "-", "-", "-", "+"};
        a[4] = new String[]{"|", " ", " ", " ", "|"};
        a[5] = new String[]{"|", " ", " ", " ", "|"};
        a[6] = new String[]{"+", "-", "-", "-", "+"};
        return a;
    }

    public static String[][] copySeven(){
        String[][] a = new String[7][5];
        a[0] = new String[]{"+", "-", "-", "-", "+"};
        a[1] = new String[]{" ", " ", " ", " ", "|"};
        a[2] = new String[]{" ", " ", " ", " ", "|"};
        a[3] = new String[]{" ", " ", " ", " ", "+"};
        a[4] = new String[]{" ", " ", " ", " ", "|"};
        a[5] = new String[]{" ", " ", " ", " ", "|"};
        a[6] = new String[]{" ", " ", " ", " ", "+"};
        return a;
    }

    public static String[][] copyEight(){
        String[][] a = new String[7][5];
        a[0] = new String[]{"+", "-", "-", "-", "+"};
        a[1] = new String[]{"|", " ", " ", " ", "|"};
        a[2] = new String[]{"|", " ", " ", " ", "|"};
        a[3] = new String[]{"+", "-", "-", "-", "+"};
        a[4] = new String[]{"|", " ", " ", " ", "|"};
        a[5] = new String[]{"|", " ", " ", " ", "|"};
        a[6] = new String[]{"+", "-", "-", "-", "+"};
        return a;
    }

    public static String[][] copyNine(){
        String[][] a = new String[7][5];
        a[0] = new String[]{"+", "-", "-", "-", "+"};
        a[1] = new String[]{"|", " ", " ", " ", "|"};
        a[2] = new String[]{"|", " ", " ", " ", "|"};
        a[3] = new String[]{"+", "-", "-", "-", "+"};
        a[4] = new String[]{" ", " ", " ", " ", "|"};
        a[5] = new String[]{" ", " ", " ", " ", "|"};
        a[6] = new String[]{"+", "-", "-", "-", "+"};
        return a;
    }
    public static String[][] copySpace(){
        String[][] a = new String[7][5];
        a[0] = new String[]{"."};
        a[1] = new String[]{"."};
        a[2] = new String[]{"."};
        a[3] = new String[]{"."};
        a[4] = new String[]{"."};
        a[5] = new String[]{"."};
        a[6] = new String[]{"."};
        return a;
    }
    public static void print2d(String[][] copiedArr) { //prints 2d array
        for(int i = 0; i < copiedArr.length; i++) {
            String[] tempArr = copiedArr[i];
            for (int y = 0; y < tempArr.length; y++) {
                System.out.print(tempArr[y]);
            }
            System.out.println();
        }
    }
}