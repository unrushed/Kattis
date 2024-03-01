import java.util.Scanner;

public class EygptTriangles {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        long first, second, third, m = 0, temp;
        String strOut = "", strOutTemp = "";

        while(true){

            first = input.nextLong(); 
            second = input.nextLong();
            third = input.nextLong();

            if(first > second){
                temp = first;
                first = second;
                second = temp;
            }
            if (second > third){
                temp = second;
                second = third;
                third = temp;
            }
            if (first > second){
                temp = first;
                first = second;
                second = temp;
            }


            if(first == 0 && second == 0 && third == 0){
                break;
            } else if(first == 0 || second == 0 || third == 0){
                strOutTemp = "wrong";
            }else if(Math.sqrt(Math.pow(first,  2) + Math.pow(second,2)) == third){
                strOutTemp = "right";
            }else{
                strOutTemp = "wrong";
            }

            m++;
            if(m == 1){
                strOut = strOutTemp;
            }else{
                strOut = strOut +  "\n" + strOutTemp;
            }
            strOutTemp = "";
        }
        System.out.print(strOut);
    }
}

