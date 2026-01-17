### "This" Keyword

1. Non-static block/context
2. holds / stroes address of current class
3. refer/ call non-static members (variables and methods)
4. static members cannot be called using "this" keyword
5.

```java

   public class ThisExample{
    static int a=10;
    int b=20;
       void eat(){
           System.out.println(this); // acceptable //ThisExample@15db9742
           System.out.println(this.a);
              System.out.println(this.b);
       }
       {
           System.out.println(this); // acceptable //ThisExample@15db9742
                      System.out.println(this.a);
              System.out.println(this.b);
       }
       public static void main(String[] args){
           ThisExample e = new ThisExample();
           System.out.println(this); // not acceptable
           System.out.println(e); // acceptable  //ThisExample@15db9742
           e.eat();
       }
   }

```

[ *Notes in bengali* : akta "new" keyword diye jokhon object create kora hoy tokhon sei object er address store hoy "this" keyword e. Tai jokhon non-static method ba non-static block er moddhe "this" keyword use kora hoy tokhon current object er address return kore. Ar static context e "this" keyword use kora jayna karon static context er sathe kono specific object related thake na. ]

---

### Accessing Static and Non-Static Members Using "This"

The "this" keyword can be used to access both static and non-static members of a class, although it is primarily used for non-static members. The following example demonstrates this concept:

**Example1.java**

```java
package pack4;

public class Example1 {

    static int a = 10;
    static String name = "soham";
    int b = 20;
    String s = "Hi";

    public static void test() {
        System.out.println(a);
        System.out.println(name);
    }

    public void task() {
        System.out.println(this.b);
        System.out.println(this.s);
        System.out.println(this.a);
        System.out.println(this.name);
    }
}
```

**Example1_Main.java**

```java
package pack4;

public class Example1_Main {

    public static void main(String[] args) {
        System.out.println(Example1.a);
        System.out.println(Example1.name);
        Example1.test();
        Example1 e = new Example1();
        System.out.println(e.a);
        System.out.println(e.b);
        System.out.println(e.name);
        System.out.println(e.s);
        e.task();
        e.task();
    }
}
```

**Key Points:**

1. Static members (a, name) can be accessed using the class name (Example1.a, Example1.name) or through an object reference (e.a, e.name).
2. Non-static members (b, s) can only be accessed through an object reference (e.b, e.s).
3. Inside non-static methods, "this" keyword can be used to access both static and non-static members, though it is recommended to access static members using the class name for clarity.
4. The task() method demonstrates that "this.a" and "this.name" work but accessing static members through "this" is not a best practice.
5. Static methods like test() cannot use "this" keyword because they are not associated with any specific object instance.

---

### Problem with Static Variables in Multi-Object Scenarios

When using static variables to store object-specific data, a problem arises: static variables are shared among all instances of a class. This means that when one object modifies a static variable, it affects all other objects as well. This is demonstrated in the following example:

**NameStore.java**

```java
package pack4;

public class NameStore {

    static String name;
    long phNo;
    String mailId;
    String add;

    public void display() {
        System.out.println(this.name);
        System.out.println(this.phNo);
        System.out.println(this.mailId);
        System.out.println(this.add);
    }
}
```

**Contact.java**

```java
package pack4;

public class Contact {

    public static void main(String[] args) {

        NameStore e1 = new NameStore();
        e1.name = "Soham";
        e1.phNo = 7818294628l;
        e1.mailId = "gchaghfgv";
        e1.add = "UEM college";
        e1.display();

        NameStore e = new NameStore();
        e.name = "Vuivihyc";
        e.phNo = 8237689325l;
        e.mailId = "gchiugyidgaghfgv";
        e.add = "UEM + Jojo college";
        e.display();
    }
}
```

**Output:**

```
Soham
7818294628
gchaghfgv
UEM college
Vuivihyc
8237689325
gchiugyidgaghfgv
UEM + Jojo college
```

**Problem Identified:**

The issue here is that the "name" variable is static. When we create the second object (e) and set e.name = "Vuivihyc", it overwrites the static variable that is shared across all instances. So when e1.display() is called, it prints "Vuivihyc" instead of "Soham" because both e1 and e are referring to the same static variable.

**Solution - Dynamic Way:**

To solve this problem, we should make all instance-specific variables non-static. This ensures that each object has its own copy of the data. Here's the corrected version:

```java
package pack4;

public class NameStore {

    String name;  // Changed from static to non-static
    long phNo;
    String mailId;
    String add;

    public void display() {
        System.out.println(this.name);
        System.out.println(this.phNo);
        System.out.println(this.mailId);
        System.out.println(this.add);
    }
}
```

Now each object will maintain its own separate "name" value, and modifying one object's name will not affect another object's name. This is the dynamic way of handling object-specific data.

**Key Takeaway:**

Use static variables only when you want to share data across all instances of a class. For object-specific data that should be unique to each instance, always use non-static (instance) variables.

---

### Using Constructor with "This" Keyword

Instead of manually assigning values to each object after creation, we can use constructors to initialize object properties efficiently. The "this" keyword helps distinguish between instance variables and constructor parameters when they have the same name.

**NameStore.java**

```java
package pack4;

public class NameStore {

    String name;
    long phNo;
    String mailId;
    String add;

    public NameStore(String name, long phNo, String mailId, String add) {
        this.name = name;
        this.phNo = phNo;
        this.mailId = mailId;
        this.add = add;
    }

    public void display() {
        System.out.println(this.name);
        System.out.println(this.phNo);
        System.out.println(this.mailId);
        System.out.println(this.add);
    }
}
```

**Contact.java**

```java
package pack4;

public class Contact {

    public static void main(String[] args) {
        NameStore e1 = new NameStore("Soham", 7818294628l, "gchaghfgv", "UEM college");
        e1.display();
    }
}
```

Read about constructors [here]

**Important Note:**

In the constructor, using `this.name = name` is the standard and recommended approach because:

- The parameter name matches the instance variable name, making the code more readable
- "this" clearly distinguishes between the instance variable and the parameter

While you could write `this.name = a` (where 'a' is a different parameter name), it's not good practice because:

- It reduces code readability
- Other developers may find it confusing
- It doesn't follow naming conventions
- The purpose of the parameter becomes unclear

Always prefer matching parameter names with instance variable names and use "this" to differentiate them.

---
