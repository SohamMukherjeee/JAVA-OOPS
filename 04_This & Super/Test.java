// super: Refers to parent class


class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}
class Dog extends Animal {
    void eat() {
        //super.eat(); ---> without this, output will be "Dog eats too"
        // but with super.eat()  -->Animal eats
                                //Dog eats too
        System.out.println("Dog eats too");
    }
}

public class Test {
    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.eat();
    }
}


