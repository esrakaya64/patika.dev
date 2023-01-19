package gradeavarage;
import java.util.Scanner;
/**
 *
 * @author Esra Kaya
 */
public class GradeAvarage {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
        System.out.println("Enter your Math note");
        int note1 = input.nextInt();
        System.out.println("Enter your Physics note");
        int note2 = input.nextInt(); 
        System.out.println("Enter your Chemistry note");
        int note3 = input.nextInt();  
        System.out.println("Enter your Music note");
        int note4 = input.nextInt();   
        System.out.println("Enter your Biology note");
        int note5 = input.nextInt();   
        System.out.println("Enter your Geography note");
        int note6 = input.nextInt();
        
        double avarage = (note1 + note2 + note3 + note4 + note5 + note6)/6.0;
        boolean result = avarage >= 60.0;
        String result2 = result ? "Successful" : "UNSUCCESFUL!";
        System.out.println("Your avarage: " + avarage + " " + result2);
        
    }
    
}
