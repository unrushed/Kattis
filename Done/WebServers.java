package Done;

import java.util.Scanner;

public class WebServers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int cpu = 0;
        int memory = 0;
        int harddrive = 0;
        for (int i = 0; i < n; i++) {
            String cpuTemp = input.next();
            String memoryTemp = input.next();
            String hardDriveTemp = input.next();

            if(cpuTemp.equals("J")) cpu++;
            if(memoryTemp.equals("J")) memory++;
            if(hardDriveTemp.equals("J")) harddrive++;
        }
        if(cpu <= memory && cpu <= harddrive) System.out.println(cpu);
        else if(memory <= cpu && memory <= harddrive) System.out.println(memory);
        else if(harddrive <= cpu && harddrive <= memory) System.out.println(harddrive);
    }
}
