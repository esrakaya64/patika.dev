
package studentınfosystem;

/**
 *
 * @author Esra Kaya
 */
public class StudentInfoSystem {

    public static void main(String[] args) {
        Course course1 = new Course("Fizik" , "101" , "FZK");
        Course course2 = new Course("Kimya", "101 ", "KMY ");
        Course course3 = new Course("Biyoloji", "101", "BIO ");
        Student s1 = new Student("Esra Kaya" , "12345", 2 , course1, course2, course3);
        s1.addBulkExamNote(100, 100, 100, 100, 100,100);
        s1.printInfo();
        s1.isPass();
    }
    
}
