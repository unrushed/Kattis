package Done;

import java.util.Scanner;

public class ICPCAwards {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] schools = new String[12][12];
        int x = Integer.parseInt(input.nextLine());

        int keepingTrack = 0;

        for (int i = 0; i < x; i++) {
            String school = input.next();
            String team = input.nextLine();
            if(!inside(schools, school) && keepingTrack != 12){
                schools[keepingTrack][0] = school;
                schools[keepingTrack][1] = team;
                keepingTrack++;
            }
        }
        printAll(schools);

    }

    public static boolean inside(String[][] schools, String school){
        for (int i = 0; i < schools.length; i++) {
            if(schools[i][0] != null && schools[i][0].equals(school)) return true;
        }
        return false;
    }

    public static void printAll(String[][] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i][0] + a[i][1]);
        }
    }
}
