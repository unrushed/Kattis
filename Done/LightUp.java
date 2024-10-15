package Done;

import java.util.Scanner;

public class LightUp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        int xAndY = Integer.parseInt(input.nextLine());
        String[][] arr = new String[xAndY][xAndY];
        for (int i = 0; i < xAndY; i++) {
            arr[i] = input.nextLine().split("");
        }

        if(checkEveryCell(arr)){
            System.out.println("1");
        }else System.out.println("0");
    }
    public static boolean checkEveryCell(String[][] arr){
        boolean[][] yes = new boolean[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j].matches("[?01234X]")) yes[i][j] = true;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j].equals("?")) {
                    if(!goLeft(arr, i, j, yes) || !goRight(arr, i, j, yes) || !goUp(arr, i, j, yes) || !goDown(arr, i, j, yes)) {
                        return false;
                    }
                }
            }
        }

        if(!checkForTrue(yes)) return false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j].matches("[0-4]")){
                    if(!countAround(arr, i, j)) return false;
                }
            }
        }

        return true;
    }
    public static boolean goLeft(String[][] arr, int y, int x, boolean[][] yes){
        for (int i = x - 1; i > -1; i--) {
            if(arr[y][i].equals("?")) {
                return false;
            }else if(arr[y][i].equals("X") || arr[y][i].matches("[01234]")){
                return true;
            }else{
                yes[y][i] = true;
            }
        }
        return true;
    }
    public static boolean goRight(String[][] arr, int y, int x, boolean[][] yes){
        for (int i = x + 1; i < arr[y].length; i++) {
            if(arr[y][i].equals("?")) {
                return false;
            }else if(arr[y][i].equals("X") || arr[y][i].matches("[01234]")){
                return true;
            }else{
                yes[y][i] = true;
            }
        }
        return true;
    }
    public static boolean goUp(String[][] arr, int y, int x, boolean[][] yes){
        for (int i = y - 1; i > -1; i--) {
            if(arr[i][x].equals("?")) {
                return false;
            }else if(arr[i][x].equals("X") || arr[i][x].matches("[01234]")){
                return true;
            }else{
                yes[i][x] = true;
            }
        }
        return true;
    }
    public static boolean goDown(String[][] arr, int y, int x, boolean[][] yes){
        for (int i = y + 1; i < arr[y].length; i++) {
            if(arr[i][x].equals("?")) {
                return false;
            }else if(arr[i][x].equals("X") || arr[i][x].matches("[01234]")){
                return true;
            }else{
                yes[i][x] = true;
            }
        }
        return true;
    }
    public static boolean countAround(String[][] arr, int y, int x){
        int number = Integer.parseInt(arr[y][x]);
        int count = 0;
        if(arr.length > y+1 && arr[y+1][x].equals("?")) {
            count++; // down
        }
        if(0 <= x-1 && arr[y][x-1].equals("?")) count++; // left
        if(arr[y].length > x+1 && arr[y][x+1].equals("?")){
            count++; // right
        }
        if(0 <= y-1 && arr[y-1][x].equals("?")) count++; // up

        if(count != number) return false;
        else return true;
    }
    public static boolean checkForTrue(boolean[][] yes){
        for (int i = 0; i < yes.length; i++) {
            for (int k = 0; k < yes.length; k++) {
                if(!yes[i][k]) return false;
            }
        }
        return true;
    }
}
