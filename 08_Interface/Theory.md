# Interface in java

- is a keyword in java
- blueprint like a class
- interdace itself it's a parent class
- constructor concept is not applicable in interface
- properties are by default public static final
- concrete methods are by default public abstract methods
- we can not create the object of interface

  syntax:

```java
public interface InterfaceName{
   //properties
   //abstract methods
}
```

- JDK 8.0 onwards we can have static methods in interface
- to use the interface we have to implement it in a class using "implements" keyword

### Types of interface

1. **Functional interface**

- only one abstract method.
- Example:
  - Comparable<I> -> compareTo(object o)
  - Runnable<I> -> run()

  ```java
  interface FunctionalInterfaceExample{
      void method1(); // by default public abstract
  }

  ```

2. **Marker interface (Empty interface)**

- doesn't contain any method or field

3. **Regular interface**

# Relationships

- class - class : extends
- interface - interface : extends
- class - interface : not possible
- interface - class : implements

# Inheritance in interface

### Single inheritance

```java
interface A{
   void methodA(); // by default public abstract
}
class B implements A{
   void methodA(){
        //implementation
   }
}
class user{
    public static void main(String args[]){
         A obj = new B();
         obj.methodA();
    }
}

```

### Multi-level inheritance

```java

```

### Hierarchical inheritance

```java
   interface animal{
      void sound();
   }
   class dog implements animal{
      public void sound(){
         System.out.println("Bark");
      }
   }
   class cat implements animal{
      public void sound(){
         System.out.println("Meow");
      }
   }
   class user{
      public static void main(String args[]){
         animal a1 = new dog();
         a1.sound(); // Bark
         animal a2 = new cat();
         a2.sound(); // Meow
      }
   }
```

### Multiple inheritance

```java
   interface Father{
      void feed();
   }
   interface Mother{
      void feed();
   }
   class Child implements Father,Mother{
      public void feed(){
         System.out.println("Method A");
      }
   }
   class user{
      public static void main(String args[]){
         Child obj = new Child();
         obj.feed(); // Method A
      }
   }
```
