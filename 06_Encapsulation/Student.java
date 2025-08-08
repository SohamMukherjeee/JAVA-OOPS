// Encapsulation in Java is one of the core concepts of Object-Oriented Programming (OOP). 
//It refers to the bundling of data (fields) and methods (functions) that operate on the data into 
//a single unit (i.e., a class), and restricting direct access to some of the object’s components. 
//This is typically done using access modifiers.

//---------------------------------------------------------------------------------------------------------------
// Key Principles of Encapsulation
// Make fields (variables) private so they cannot be accessed directly from outside the class.

// Provide public getter and setter methods to access and update the values of the private fields.

// Control how the data is modified — which helps to protect the integrity of the object.



public class Student{
    private int age;
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


}