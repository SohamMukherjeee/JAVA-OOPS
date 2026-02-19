# Method Shadowing

## Syntax

```java
class Parent {
    public static void method() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    public static void method() {
        System.out.println("Child method");
    }
    public static void main(String[] args) {
   method(); // calls Child's method -> output: "Child method" -> method is shadowed
    }
}

```

## syntax

```java

 interface Parent {
    public static void method() {
        System.out.println("Parent method");
    }
}

class Child implements Parent {
    public static void main(String[] args) {
     method();              // we cannot call method() directly because it is static in the interface and we are trying to call it
                            //  from the implementing class. We need to use the interface name to call the static method. So we should use
     Parent.method();
}
}
```

## important points

1. We cannot override static methods in Java. If a subclass defines a static method with the same signature as a static method in the parent class, it is called `method shadowing, not method overriding`.

2. For class : we can access the static method of the parent class directly method name.

3. For interface : we cannot access the static method of the interface directly method name. We need to use the interface name to call the static method.
   - Example:

   ```java
   interface Parent {
       public static void method() {
           System.out.println("Parent method");
       }
   }
   interface AnotherParent {
       public static void method() {
           System.out.println("Another Parent method");
       }
   }
   class Child implements Parent, AnotherParent {
       public static void main(String[] args) {
        Parent.method();
        AnotherParent.method();
   }
   }

   ```

# "Default"

```java
interface Parent {
    default void method() {
        System.out.println("Parent method");
    }
}

interface AnotherParent {
    default void method() {
        System.out.println("Another Parent method");
    }
}

class Child implements Parent, AnotherParent {
    public static void main(String[] args) {
     @Override
        public void method() {
            System.out.println("Child method");
        }
         Parent.super.method(); // calls Parent's method -> output: "Parent method"
    }

}
```

lambda
