
package recursivepattern;
import java.util.Scanner;
/**
 *
 * @author Esra Kaya
 */
public class RecursivePattern {
    static int pattern(int n, int m) {
        if (n > 0) {
            System.out.print(n + " ");
            n -= 5;
            return pattern(n, m);
        }
        return pattern2(n, m);
    }
    static int pattern2(int a, int i){
        if (a <= i) {
            System.out.print(a + " ");
            a += 5;
            return pattern2(a, i);
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = input.nextInt();
        System.out.println(pattern(a, 5));
    }
    
}
