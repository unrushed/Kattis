import java.util.Scanner;
public class AllowedLetters {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String str = input.nextLine(), sentence = input.nextLine().toLowerCase(), strTemp = "", strOut = "";
        boolean test = false;
        int space, grab = 0;
        char charTemp;

        char[] myList;
        myList = new char [str.length()];

        for(int x = 0; x < str.length(); x++){ //grabs the characters
            myList[x] = str.charAt(x);
        }

        do{
            space = sentence.indexOf(" ", grab);
            if(space == -1){ //if one word left checks for illegal characters
                strTemp = sentence.substring(grab, sentence.length());
                for(int y = 0; y < strTemp.length(); y++){ //executed 4 times
                    charTemp = strTemp.charAt(y);
                    //System.out.println(charTemp);
                    for(int g = 0; g < myList.length; g++){ //once
                        if(charTemp == (myList[g])){
                            strOut = strOut + drawPattern(strTemp) + " ";
                            test = true;
                            break;
                        }
                    }
                    if(test){
                        break;
                    }
                }

                if(test){
                    break;
                }else{
                    strOut = strOut + strTemp + " ";
                    break;
                }
            }
            if(space == -1){
                break;
            }

            strTemp = sentence.substring(grab, space);

            for(int y = 0; y < strTemp.length(); y++){
                charTemp = strTemp.charAt(y);
                //System.out.println(charTemp);
                for(int l = 0; l < myList.length; l++){
                    if(charTemp == myList[l]){
                        strOut = strOut + drawPattern(strTemp) + " ";
                        test = true;
                        break;
                    }
                }
                if(test){
                    break;
                }
            }
            if(test){
                test = false;
            }else{
                strOut = strOut + strTemp + " ";
                test = false;
            }
            grab = space + 1;
        }while(space >= 0);
        System.out.print(strOut);
    }

    public static String drawPattern(String strTemp){
        String str = "";
        for(int z = 0; z < strTemp.length(); z++){
        str = str + "*";
        }
        
        return str;
    }
}