# Java Inheritance - Important Notes

## Key Concepts

1. **Single Inheritance Only**: Java supports only single inheritance for classes (a class can extend only one parent class). This prevents the "Diamond Problem" that occurs in multiple inheritance. However, multiple inheritance can be achieved through interfaces.

2. **Constructor Chain**: When an object of a subclass is created, the constructor of the parent class is always called first (implicitly or explicitly using `super()`). This ensures proper initialization of inherited members before the subclass constructor executes.

3. **Method Overriding Rules**:
   - The overriding method must have the same method signature (name, parameters, and return type)
   - Access modifier must be same or less restrictive than the parent method
   - Cannot override `final`, `static`, or `private` methods
   - Exception thrown cannot be broader than parent method's exception

4. **IS-A Relationship**: Inheritance represents an "IS-A" relationship. A subclass object IS-A type of its parent class. This allows for polymorphism where a parent reference can point to a child object, enabling dynamic method dispatch.

5. **Protected Access Modifier**: The `protected` keyword is specifically useful in inheritance - it allows access to members within the same package and by subclasses in different packages, making it ideal for members that should be inherited but not publicly exposed.

6. **Object Class is Root**: Every class in Java implicitly extends the `Object` class if no other parent is specified. This means all classes inherit methods like `toString()`, `equals()`, `hashCode()`, and `clone()` from Object.

7. **Final Keyword Impact**:
   - A `final` class cannot be inherited (e.g., String, Integer, System)
   - A `final` method cannot be overridden by subclasses
   - This is used to prevent modification of critical functionality and ensure security/immutability

## Code Examples

### Example 1: Basic Inheritance with Static and Non-Static Members

**Parent Class A:**

```java
package pack5;

public class A {
    int numA = 120;
    static int stNumA = 121;

    public static void staticSoundA() {
        System.out.println("A static class");
    }

    public void soundA() {
        System.out.println("A non-static class");
    }
}
```

**Child Class B (extends A):**

```java
package pack5;

public class B extends A {
    int numB = 420;
    static int stNumB = 421;

    public static void staticSoundB() {
        System.out.println("B static class");
    }

    public void soundB() {
        System.out.println("B non-static class");
    }
}
```

**Key Points:**

- Class B inherits instance variables and methods from class A
- Static members (stNumA, staticSoundA) belong to the class, not inherited in traditional sense
- B can access A's non-static members (numA, soundA) through inheritance
- Both classes can have their own static and non-static members

**Main Class - Testing Inheritance:**

```java
package pack5;

public class Inheritence {

    public static void main(String[] args) {
        // TODO Auto-generated method
        B obj = new B();
        System.out.println(obj.numA);
        System.out.println(obj.stNumA);
        System.out.println(obj.numB);
        System.out.println(obj.stNumB);
        obj.staticSoundA();
        obj.staticSoundB();
        obj.soundB();
        obj.soundA();
    }
}
```

**Observations:**

- Object of class B can access both inherited members (numA, soundA) from parent class A
- Object can access both static and non-static members from parent and child classes
- Static methods can be called through object reference (though not recommended practice)
- Child class object has access to all public/protected members of parent class

---

### Example 3: Accessing Static Members Through Child Class

**Parent Class A1 with Static Members:**

```java
package pack5;

public class A1 {
   static int i=10;
   public static void eat() {
	   System.out.println("eating karle bhaiiiii");
   }
}
```

**Child Class B1 (extends A1):**

```java
package pack5;

public class B1 extends A1 {

}
```

**Main Class - Accessing Static Members:**

```java
package pack5;

public class User {

	public static void main(String[] args) {

		System.out.println(B1.i);
		B1.eat();

	}

}
```

**Key Points:**

- Static variables and methods from the parent class A1 can be accessed directly through the child class B1 using the class name (B1.i, B1.eat())
- Even though B1 is empty, it inherits the static members from A1
- Static members belong to the class itself, not to instances, so they can be accessed using the child class name
- This demonstrates that static members are accessible through the inheritance hierarchy, though technically they are not "inherited" in the traditional sense - they remain part of the parent class but are accessible via the child class reference

---

### Example 2: Constructor Chaining and Field Initialization in Inheritance

**Parent Class A with Constructor:**

```java
package pack5;

public class A {
	int a ;
	int b ;
    public A(int a,int b) {
    	super();
    }
	public static void staticSoundA() {
		System.out.println("A static class");

	}

	public void soundA() {
		System.out.println("A non-static class");
	}
}
```

**Child Class B with Constructor Chaining:**

```java
package pack5;

public class B extends A {
	int c;
	int d;

	public B(int a,int b,int c,int d) {
		super(a,b);
		this.c=c;
		this.d=d;
		super.a=a;
		super.b=b;
	}

	public static void staticSoundB() {
		System.out.println("B static class");

	}

	public void soundB() {
		System.out.println("B non-static class");
	}

}
```

**Main Class - Demonstrating Constructor Chaining:**

```java
package pack5;

public class Inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method
        B obj=new B(10,12,20,23);
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
        obj.staticSoundA();
        obj.staticSoundB();
        obj.soundB();
        obj.soundA();


	}

}


```

**Important Points:**

1. **`super()` Must Be First Statement**: When calling the parent class constructor using `super()`, it must be the first statement in the child class constructor. This ensures the parent class is properly initialized before the child class constructor executes.

2. **Accessing Parent Fields**: You can access parent class fields using `super.fieldName` (like `super.a=a`), but this is only necessary when there's a naming conflict. Since inherited fields are directly accessible in the child class, you can simply use `a` instead of `super.a` if there's no ambiguity.

3. **Constructor Parameters Pass-Through**: The child class constructor receives parameters for both parent and child fields (a, b, c, d). It then passes the parent-related parameters (a, b) to the parent constructor via `super(a,b)`, demonstrating proper constructor chaining.

4. **Complete Object Initialization**: When creating a `B` object with `new B(10,12,20,23)`, the execution flow is:
   - Call to `super(a,b)` initializes parent class A's constructor
   - Parent constructor calls `super()` (implicitly calling Object class constructor)
   - Then child class B's remaining constructor code executes
   - This ensures the complete object hierarchy is properly initialized from top to bottom
