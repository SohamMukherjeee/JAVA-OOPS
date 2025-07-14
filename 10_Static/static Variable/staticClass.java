class Student {
  static int schoolID;
  int rollNo;
    
}


public class staticClass {
    public static void main(String[] args) {
        // we can directly get the access of "schoolID" from class "student"
        // no need to create object for schoolID
        Student.schoolID=7;
        
        // but to get the access of "rollNo", we need to create the object
        Student student=new Student();
        student.rollNo=67;
        System.out.println("student's roll no " + student.rollNo + " and school id"+ Student.schoolID);
    }
}
