# Abstraction

Abstraction is the process of hiding the implementation details and showing only the functionality to the user. In Java, abstraction is achieved using:

1. **_Concrete method_** (non static methods || any methods without abstract keyword)
2. **_Concrete Class_** ( class which is consits of static and non static methods || any class without abstract keyword)

---

_Abstract keyword_ **in complete/un implemented**

- cannot declare abstract keyword with static members

---

3. **_Abstract method_**
4. **_Abstract class_**
5. **_Interface_** (can achieved 100% abstraction)

### important points regarding abstraction in Java:

- abstract methods do not have a body (implementation)

```java
abstract void sound(); // abstract method

abstract void sound(){
    system.out.println("Sound");  // compilation error
}
```

- abstract methods can only be declared in abstract class

```java
abstract class Animal {
    abstract void sound(); // abstract method
}
```

- an abstract class can have non-abstract methods

```java
abstract class Animal {
    abstract void sound();

    // non-abstract method
    void sleep() {
        System.out.println("Sleeping");
    }
}

```

- we cannot create an object of an abstract class

- only way to use an abstract class is to inherit it from another class

```java
abstract class Animal {
    abstract void sound();
}
class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

```

- if a concrete class inherits an abstract class, it must provide implementation for all abstract methods of the abstract class

```java

abstract class Animal {
    abstract void sound();
    abstract void eat();

}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
    // compilation error: must implement eat() method
}

```
