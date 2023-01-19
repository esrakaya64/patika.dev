package passingtheclass;
import java.util.Scanner;
/**
 *
 * @author Esra Kaya
 */
public class PassingTheClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your Math note: ");
        int mathNote = input.nextInt();
        
        System.out.println("Your physics note: ");
        int physicsNote = input.nextInt();

        System.out.println("Your Chemistry note: ");
        int chemistryNote = input.nextInt();

        System.out.println("Your Geography note: ");
        int geographyNote = input.nextInt();

        System.out.println("Your Music note: ");
        int musicNote = input.nextInt();
        
        double avarage = (mathNote + physicsNote + chemistryNote + geographyNote + musicNote)/5.0;
        
        if(avarage >= 55)
            System.out.println("Avarage is:" + avarage + " You passed the class!");
        else
            System.out.println("Avarage is: " + avarage + " UNFORTUNATELY YOU CANNOT PASS THE CLASS");

    
    
}
}