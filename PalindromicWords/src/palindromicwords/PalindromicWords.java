
package palindromicwords;
import java.util.Scanner;
/**
 *
 * @author Esra Kaya
 */
public class PalindromicWords {
static String isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
            return "It is not a palindromic word";
            i++;
            j--;
        }
        return "It is a palindromic word";
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.nextLine();
        System.out.println(isPalindrome(word));
    }
    
}
