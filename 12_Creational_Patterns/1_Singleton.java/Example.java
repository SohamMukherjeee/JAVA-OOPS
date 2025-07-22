
public class Example {
    public static void main(String[] args) {
        // Lazy initilization 
        Singleton singleton1 = Singleton.getInstance(); //798154996
        System.out.println(singleton1.hashCode());
        Singleton singleton2 = Singleton.getInstance(); //798154996
        System.out.println(singleton2.hashCode());

        // Eager intilization
        EagerSingleton singleton3=EagerSingleton.getInstance(); //  1392838282
        System.out.println(singleton3.hashCode());
        EagerSingleton singleton4=EagerSingleton.getInstance(); //1392838282
        System.out.println(singleton4.hashCode());

    }
} 

// Lazy initilization
/*
 * 
 *  javac Singleton.java Example.java
>> 
      java Example
>> 
798154996
798154996
 */