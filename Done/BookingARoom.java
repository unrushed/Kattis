import java.util.Scanner;
import java.util.Random;

public class BookingARoom {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int totalRooms = input.nextInt(), roomsBooked = input.nextInt(), t = 0, g = 0,tryTest = 1;
        boolean test = false, didNotFindRoom= false;

        int[] listOfRoomNumbers;
        listOfRoomNumbers = new int[roomsBooked];

        for(int x = 0; x < roomsBooked; x++){
            listOfRoomNumbers[x] = input.nextInt();
        }

        do{
        for(int y = 0; y < roomsBooked; y++){
            if(tryTest == (listOfRoomNumbers[y])){
                test = true;
                break;
            }
        }
        if(test == false){
            break;
        }
        if(tryTest == totalRooms){
            didNotFindRoom = true;
            break;
        }
        tryTest++;
        test = false;
        }while(t == 0);

        if(didNotFindRoom){
            System.out.print("too late");
        }else{
            System.out.print(tryTest);  
        }
    }
}
