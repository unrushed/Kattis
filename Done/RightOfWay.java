import java.util.Scanner;
public class RightOfWay {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String comingFrom = input.next(), whereTo = input.next(), whereFrom = input.next();
        String returnDirection, whereisHe;

        
        returnDirection = figure(comingFrom, whereTo);
        whereisHe = whereistheman(comingFrom, whereFrom);

        if(returnDirection == "Right"){
            System.out.print("No");
        }else if(returnDirection.equals("Straight") && whereisHe.equals("Right")){
            System.out.print("Yes");
        }else if(returnDirection.equals("Left") && whereisHe.equals("OppositeDirection") || whereisHe.equals("Right")){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }

    public static String figure(String comingFrom, String whereTo){
        if(comingFrom.equals("North") && whereTo.equals("South")){
            return "Straight";
        }else if (comingFrom.equals("West") && whereTo.equals("East")){
            return "Straight";
        }else if((comingFrom.equals("South") && whereTo.equals("North"))){
            return "Straight";
        }else if((comingFrom.equals("East") && whereTo.equals("West"))){
            return "Straight";
        } else if ((comingFrom.equals("South") && whereTo.equals("West"))){
            return "Left";
        }else if ((comingFrom.equals("North") && whereTo.equals("East"))){
            return "Left";
        }else if ((comingFrom.equals("East") && whereTo.equals("South"))){
            return "Left";
        } else if ((comingFrom.equals("West") && whereTo.equals("North"))){
            return "Left";
        }else{
            return "Right";
        }
    }
    
    public static String whereistheman(String comingFrom, String whereFrom){
        if(comingFrom.equals("South") && whereFrom.equals("East")){
            return "Right";
        }else if (comingFrom.equals("East") && whereFrom.equals("North")){
            return "Right";
        }else if((comingFrom.equals("North") && whereFrom.equals("West"))){
            return "Right";
        }else if((comingFrom.equals("West") && whereFrom.equals("South"))){
            return "Right";
        }else if (comingFrom.equals("South") && whereFrom.equals("West")){
            return "Left";
        }else if((comingFrom.equals("West") && whereFrom.equals("North"))){
            return "Left";
        }else if(comingFrom.equals("North") && whereFrom.equals("East")){
            return "Left";
        }else if(comingFrom.equals("East") && whereFrom.equals("South")){
            return "Left";
        }else{
            return "OppositeDirection";
        }
    }
}
