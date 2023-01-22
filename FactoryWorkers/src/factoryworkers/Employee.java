
package factoryworkers;
/**
 *
 * @author Esra Kaya
 */
public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    double tax;
    
    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.tax = 0;
    }
 
    void tax(){
        if(this.salary > 1000){
            this.tax = this.salary * 0.03;
        }
    }
       void raiseSalary(){
        if((2021 - this.hireYear) < 10){
            System.out.println("New salary : " + (this.salary + this.salary*0.05 ));
        }
        else if((2021 - this.hireYear) > 9 && (2021 - this.hireYear) < 20){
            System.out.println("New salary : " + (this.salary +(this.salary*0.10)));
        }
        else if((2021 - this.hireYear) > 19){
            System.out.println("New salary : " + (this.salary + this.salary*0.15));
        }
    }
    void bonus(){
        if(this.workHours > 40)
            this.salary += (this.workHours - 40)*30;
        
    }
    
    void printInfo(){
        System.out.println("Name : " + this.name);
        System.out.println("Work hours : " + this.workHours);
        System.out.println("Hire year : " + this.hireYear);
    }
  
}
