package studentınfosystem;

/*
Nitelikler : name,code,prefix,note,Teacher
Metotlar : Course() , addTeacher() , printTeacher()
Course sınıfına derse ait sözlü notu kısmını girin ve ortalamaya etkisini her ders için ayrı ayrı belirtin. 
Sözlü notların ıda ortalamaya etkileme yüzdesi ile dahil edin.
Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.
*/
public class Course {
    String name;
    String code;
    String prefix;
    double courseAvr;
    Teacher teacher;

Course(String name, String code, String prefix){
    this.name=name;
    this.code =code;
    this.prefix = prefix;
    
    this.courseAvr =0;
}
void addTeacher(Teacher t){
    this.teacher = t;
}
void printTeacher(){
    System.out.println("Student of this course is: " + teacher);
}
}