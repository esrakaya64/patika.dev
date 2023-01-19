
package chinesezodiac;
import java.util.Scanner;
/**
 *
 * @author Esra Kaya
 */
public class ChineseZodiac {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Year of birth");
        int year = input.nextInt();
        String sign;
        switch(year%12){
            case 0 : sign = "Monkey";
                System.out.println("Your Chineese zodiac is " + sign);
            break;
            case 1 : sign = "Cockerel";
                System.out.println("Your Chineese zodiac is " + sign);
            break;
            case 2 : sign = "Dog";
                System.out.println("Your Chineese zodiac is " + sign);
            break;
            case 3 : sign = "Pig";
                System.out.println("Your Chineese zodiac is " + sign);
            break;
            case 4 : sign = "Mouse";
                System.out.println("Your Chineese zodiac is " + sign);
            break;
            case 5 : sign = "Ox";
                System.out.println("Your Chineese zodiac is " + sign);
            break;
            case 6 : sign = "Tiger";
                System.out.println("Your Chineese zodiac is " + sign);
            break;
            case 7 : sign = "Rabbit";
                System.out.println("Your Chineese zodiac is " + sign);
            break;
            case 8 : sign = "Dragon";
                System.out.println("Your Chineese zodiac is " + sign);
            break;
            case 9 : sign = "Snake";
                System.out.println("Your Chineese zodiac is " + sign);
            break;
            case 10 : sign = "Horse";
                System.out.println("Your Chineese zodiac is " + sign);
            break;
            case 11 : sign = "Sheep";
                System.out.println("Your Chineese zodiac is " + sign);
            break;
            
        }
    }
    
}
