// What is Method Overriding?

// Method Overriding means redefining a method of the parent class in the child class with the same name, return type, and parameters.

// It is an example of Runtime Polymorphism (decision made at runtime).

// Used when a subclass needs to provide a specific implementation of a method already defined in its superclass.

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
   @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class MethodOverRide {
    public static void main(String[] args) {
        Animal a;  // Reference of superclass
        a=new Dog();
        a.sound();  // Output: Dog barks


        a=new Cat();
        a.sound(); // Output: Cat meows
    }
}
