public class Prozor {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);


        int x = io.getInt();
        int y = io.getInt();
        int z = io.getInt();
        String[][] window = new String[x][y];

       //build window

       int count = 0;
       int countSaved = 0;
       int xCoordinate = 0;
       int yCoordinate = 0;

        for (int i = 0; i < x; i++) {
            window[i] = io.getWord().split("");
        }
        System.out.println(window[0][2]);
        for (int i = 0; i <= x - z ; i++) {
            for(int j = 0; j <= y - z; j++){
                for (int row = i + 1; row < i + (z - 2); row++) {
                    for (int col = j + 1; col < j + (z - 2); col++) {
                        if(window[row][col].equals("*")){
                            count++;
                            System.out.print("found");
                        }
                    }
                        
                } 
                if(count > countSaved){
                    countSaved = count;
                    xCoordinate = i;
                    yCoordinate = j;
                }
                count = 0;
                i++;
                j++;
            }
        }
        System.out.println(countSaved);
        System.out.println(xCoordinate + " " +  yCoordinate);
    }
}
