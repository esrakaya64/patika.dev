package factoryworkers;

/**
 *
 * @author Esra Kaya
 */
public class FactoryWorkers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee emp1 = new Employee("Esra", 2000, 43, 2005);
        emp1.printInfo();
        emp1.raiseSalary();
    }
    
}
