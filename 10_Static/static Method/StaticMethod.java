class Student{
    static void schoolName(){
        System.out.println("ABV School");
    }
    void studentName(String sname){
        System.out.println("Student name is "+sname);
    }
}

public class StaticMethod {
    
    public static void main(String[] args) {
        // we can directly get the access of "schoolName()" from class "student"
        // no need to create object for schoolName
        Student.schoolName(); // (o/p)->ABV School

        // but to get the access of studentName() , we need to create object
        Student student=new Student();
        student.studentName("Raju");

    }
}
