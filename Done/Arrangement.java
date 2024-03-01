import java.util.Scanner;
public class Arrangement {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int roomNumber = input.nextInt(), numberOfTeams = input.nextInt(), evenRooms, evenRoomsFull, remainder;
        String full = "";
        remainder = numberOfTeams%roomNumber;
        if(roomNumber == 1){
            for(int i = 0; i < numberOfTeams; i++){
                full = full + "*";
            }
            System.out.println(full);
        }else{
            evenRooms = numberOfTeams / roomNumber;
            evenRoomsFull = (evenRooms*roomNumber)/(roomNumber - 1);
            for(int x = 0; x != evenRooms; x++){
                for(int i = 0; i != evenRoomsFull; i++){
                    full = full + "*";
                }
            System.out.println(full);
            full = "";
            }
            for(int p = 1; p < roomNumber; p++){
                for(int i = 0; i < remainder; i++){
                    full = full + "*";
                }
                System.out.println(full);
                System.out.print("\n");
                full = "";
            }
        }
    }
}
