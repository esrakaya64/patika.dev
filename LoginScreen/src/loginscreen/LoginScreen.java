package loginscreen;
import java.util.Scanner;
/**
 *
 * @author Esra Kaya
 */
public class LoginScreen {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Username: ");
        String username = input.nextLine();
        System.out.println("Password: ");
        String password = input.nextLine();
        
        if(username.equals("loginscreen") && password.equals("correctpassword")){
            System.out.println("Login successful");
        }
        else{
            System.out.println("Unvalid password or username, try again.");
            System.out.println("Would you like to reset your password?");
            System.out.println("1) YES \n2) NO, THANKS." );
            int choosing = input.nextInt();
            if(choosing == 1){
                Scanner scan = new Scanner(System.in);
                System.out.println("Create a new password.");
                String newP = scan.nextLine();
                if(newP.equals("correctpassword"))
                    System.out.println("Try a different password.");
                else
                    System.out.println("New password is created.");
            }
            else
                System.out.println("Try again.");
        }
    }
    
}
