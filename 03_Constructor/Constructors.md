# Constructors in Java

## What is a Constructor?

A constructor is a special method that is automatically called when an object of a class is created. It is used to initialize the object's state by assigning initial values to the instance variables.

## Syntax

```java
class ClassName {
    // Constructor syntax
    ClassName() {
        // Constructor body
    }
}
```

## Important Characteristics of Constructors

1. **Same Name as Class**: The constructor must have the same name as the class.

2. **No Return Type**: Constructors do not have a return type, not even void.

3. **Automatic Invocation**: Constructors are automatically called when an object is created using the `new` keyword.

4. **Cannot be Abstract, Static, or Final**: Constructors cannot be declared as abstract, static, or final.

5. **Can be Overloaded**: A class can have multiple constructors with different parameter lists (constructor overloading).

6. **Cannot be Inherited**: Constructors are not inherited by subclasses.

7. **Default Constructor**: If no constructor is defined, Java provides a default no-argument constructor automatically.

## Types of Constructors

### 1. Default Constructor (No-Argument Constructor)

A constructor with no parameters is called a default constructor. If you don't define any constructor, Java provides one automatically.

**Syntax:**

```java
class Student {
    String name;
    int age;

    // Default constructor
    Student() {
        name = "Unknown";
        age = 0;
    }
}
```

**Example:**

```java
public class Student {
    String name;
    int age;

    // Default constructor
    Student() {
        name = "Unknown";
        age = 0;
        System.out.println("Default constructor called");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }
}
```

**Output:**

```
Default constructor called
Name: Unknown
Age: 0
```

### 2. Parameterized Constructor

A constructor that accepts parameters is called a parameterized constructor. It is used to provide different initial values to objects.

**Syntax:**

```java
class Student {
    String name;
    int age;

    // Parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }
}
```

**Example:**

```java
public class Student {
    String name;
    int age;

    // Parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
        System.out.println("Parameterized constructor called");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Soham", 21);
        s1.display();

        Student s2 = new Student("Rahul", 22);
        s2.display();
    }
}
```

**Output:**

```
Parameterized constructor called
Name: Soham
Age: 21
Parameterized constructor called
Name: Rahul
Age: 22
```

### 3. Constructor Overloading

A class can have multiple constructors with different parameter lists. This is called constructor overloading.

**Example:**

```java
public class Employee {
    String name;
    int id;
    double salary;

    // Constructor with no parameters
    Employee() {
        name = "Not Assigned";
        id = 0;
        salary = 0.0;
    }

    // Constructor with two parameters
    Employee(String n, int i) {
        name = n;
        id = i;
        salary = 0.0;
    }

    // Constructor with three parameters
    Employee(String n, int i, double s) {
        name = n;
        id = i;
        salary = s;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println();
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Soham", 101);
        Employee e3 = new Employee("Rahul", 102, 50000.0);

        e1.display();
        e2.display();
        e3.display();
    }
}
```

**Output:**

```
Name: Not Assigned
ID: 0
Salary: 0.0

Name: Soham
ID: 101
Salary: 0.0

Name: Rahul
ID: 102
Salary: 50000.0
```

## Constructor vs Method

| Constructor                                 | Method                              |
| ------------------------------------------- | ----------------------------------- |
| Name must be same as class name             | Name can be anything                |
| No return type                              | Must have a return type             |
| Called automatically when object is created | Must be called explicitly           |
| Used to initialize object                   | Used to perform specific operations |
| Cannot be inherited                         | Can be inherited                    |

## Important Points to Remember

1. **First Statement in Constructor**: If you want to call another constructor from the same class, use `this()`. If you want to call parent class constructor, use `super()`. These must be the first statement in the constructor.

2. **Default Constructor Provision**: Java provides a default constructor only if you don't define any constructor. Once you define a parameterized constructor, the default constructor is no longer provided automatically.

3. **this() for Constructor Chaining**: You can call one constructor from another constructor of the same class using `this()`.

**Example:**

```java
public class Box {
    int length;
    int width;
    int height;

    // Constructor with all parameters
    Box(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }

    // Constructor with one parameter (cube)
    Box(int side) {
        this(side, side, side);  // Calling the 3-parameter constructor
    }

    // Default constructor
    Box() {
        this(1);  // Calling the 1-parameter constructor
    }

    void display() {
        System.out.println("Dimensions: " + length + " x " + width + " x " + height);
    }

    public static void main(String[] args) {
        Box b1 = new Box(10, 20, 30);
        Box b2 = new Box(5);
        Box b3 = new Box();

        b1.display();
        b2.display();
        b3.display();
    }
}
```

**Output:**

```
Dimensions: 10 x 20 x 30
Dimensions: 5 x 5 x 5
Dimensions: 1 x 1 x 1
```

4. **Copy Constructor**: Java doesn't have a built-in copy constructor like C++, but you can create your own.

**Example:**

```java
public class Student {
    String name;
    int age;

    // Parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    // Copy constructor
    Student(Student s) {
        name = s.name;
        age = s.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Soham", 21);
        Student s2 = new Student(s1);  // Copy constructor

        s1.display();
        s2.display();
    }
}
```

**Output:**

```
Name: Soham, Age: 21
Name: Soham, Age: 21
```

## Common Mistakes to Avoid

1. **Returning a value from constructor**: Constructors cannot return values.

2. **Making constructor static**: Constructors cannot be static as they are associated with object creation.

3. **Forgetting to call super() in inheritance**: If parent class has a parameterized constructor, child class constructor must explicitly call it using super().

4. **Using constructor name different from class name**: Constructor name must exactly match the class name, including case sensitivity.

---
