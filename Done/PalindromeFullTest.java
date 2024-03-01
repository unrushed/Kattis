import java.util.Scanner;
public class PalindromeFullTest {
    public static void main(String[] args){
        System.out.print("Enter a word : ");
        Scanner userInput = new Scanner(System.in);
        String word = userInput.next();
        int low = 0, high = word.length() - 1;
        boolean isPalindrome = true;
        while(low < high){
            if(word.charAt(low) != word.charAt(high)){
                isPalindrome = false;
                break;
            }
            low++; high--;
        }
        if(isPalindrome){
            System.out.println(word + " is a Palindrome");
        }
        else{
            System.out.println(word + " is not a Palindrome");
        }
    }
}
