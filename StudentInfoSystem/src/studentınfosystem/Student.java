package studentınfosystem;


import studentınfosystem.Course;


public class Student {
    String name;
    String stdNo;
    int classes;
    Course c1 , c2, c3;
    double avarage = 0;
    boolean ispass;
    
    Student(String name, String stdNo, int classes, Course c1, Course c2, Course c3 ){
        this.name = name;
        this.avarage = 0.0;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.stdNo = stdNo;
        this.classes = 0;
        this.ispass = true;
    }
    void addBulkExamNote(int c1Note1, int c1Note2,int c2Note1, int c2Note2,int c3Note1, int c3Note2 ){
        this.c1.courseAvr = ((c1Note1 * 0.2) + (c1Note2 * 0.8));
        this.c2.courseAvr = ((c2Note1 * 0.2) + (c2Note2 * 0.8));
        this.c3.courseAvr = ((c3Note1 * 0.2) + (c3Note2 * 0.8));
    }
    
    void isPass(){
        this.avarage = (this.c1.courseAvr+this.c2.courseAvr+this.c3.courseAvr)/3.0;
        if(this.avarage >= 55)
            System.out.println("Avarage is: " + this.avarage + " Successful!!");
        else
            System.out.println("Avarage is: " + this.avarage + " Unseccessful!!");
    }
    void printInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Student no: " + this. stdNo);
        
    }
}
