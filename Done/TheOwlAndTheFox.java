package Done;

public class TheOwlAndTheFox {
    public static void main(String[] args) {
        Kattio input = new Kattio(System.in, System.out);

        int n = input.getInt();

        for (int i = 0; i < n; i++) {
            int temp = input.getInt();
            int countOfOG = count(split(temp));
            while(true){
                temp--;
                int[] arr = split(temp);

                if(countOfOG - 1 == count(arr)){
                    input.println(backToNum(arr));
                    break;
                }

            }

        }
        input.close();
    }
    public static int[] split(int num){
        String stringNum = num + "";
        int[] arr = new int[stringNum.length()];

        for (int i = 0; i < stringNum.length(); i++) {
            arr[i] = Integer.parseInt(stringNum.charAt(i) +"");
        }
        return arr;
    }
    public static int count(int[] num){
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            count += num[i];
        }
        return count;
    }
    public static String backToNum(int[] num){
        String str = "";
        for (int i = 0; i < num.length; i++) {
            str += num[i];
        }
        return str;
    }

}
