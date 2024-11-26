package Done;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();

        int n = input.nextInt();

        int time = input.nextInt();

        for (int i = 0; i < n; i++) {
            q.add(input.nextInt());
        }
        int numerOfTasks = 0;
        int timeCounted = 0;
        while(true){
            if(q.isEmpty() || timeCounted + q.peek() >time){
                break;
            }
            timeCounted += q.remove();
            numerOfTasks++;
        }
        System.out.println(numerOfTasks);
    }
}
