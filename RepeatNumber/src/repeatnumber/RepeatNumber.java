
package repeatnumber;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Esra Kaya
 */
public class RepeatNumber {

    public static void main(String[] args){
        int[] list = {100, 120, 70, 100, 10, 230, 85, 120};
        int count;
        System.out.println("List: " + Arrays.toString(list));
        Arrays.sort(list);

        for (int i = 0; i < list.length; i++) {
            count = 0;
            for (int j = 0; j < list.length; j++) {
                if (list[i] == list[j])
                    count++;
            }
            if (i == 0 && list[i] == list[i + 1]) {
                System.out.println(list[i] + " repeated " + count + " times.");
            }
            if (i == 0 && list[i] != list[i + 1]) {
                System.out.println(list[i] + " repeated " + count + " times.");
            }
            if (i != 0 && list[i] != list[i - 1]) {
                System.out.println(list[i] + " repeated " + count + " times.");
            }
        }
    }
    
}
