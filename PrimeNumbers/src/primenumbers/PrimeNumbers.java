package primenumbers;
/**
 *
 * @author Esra Kaya
 */
public class PrimeNumbers {

    public static void main(String[] args) {
        int number = 0;
        for(int i = 1; i < 100; i++){
            for(int j = 1; j<= i; j++){
                if(i % j == 0){
                    number++;
                }
            }
                if(number == 2){
            System.out.print(i + " , ");
            }
            number =0;
            }
        }
    }
    

